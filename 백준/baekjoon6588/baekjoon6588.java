import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] state = new boolean[1000001];
        state[0] = true;
        state[1] = true;

        for(int i = 2; i <=Math.sqrt(1000000); i++){
            if(state[i])
                continue;
            for(int j =i*i; j<=1000000;j+=i){
                if(!state[j]){
                    state[j] = !state[j];
                }
            }
        }

        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
                break;
            boolean check = false;
                                
            for(int i =3 ; i <=n/2;i+=2){
                if(!state[i] && !state[n-i]){
                    System.out.println(n + " = " + i + " + " + (n-i));
                    check = true;
                    break;
                }
            }   
            if(!check)
                System.out.println("Goldbach's conjecture is wrong.");
        }
     }
}
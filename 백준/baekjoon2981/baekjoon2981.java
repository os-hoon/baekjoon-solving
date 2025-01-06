import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        for(int i = 0; i < N; i++)            
            arr[i] = Integer.parseInt(br.readLine());
        LinkedList<Integer> dif = new LinkedList<>();

        for(int i =N-1; i >= 1; i--){
            for(int j = i-1 ; j >= 0; j--){
                dif.add(Math.abs(arr[i] - arr[j]));
            }
        }
        int result = dif.get(0);
        for(int i = 1 ; i <dif.size(); i++){
            result = gcd(result,dif.get(i));
        }

        for(int i = 2; i<=result;i++){
            if(result % i == 0)
                System.out.print(i+" ");
        }
    }

    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
}
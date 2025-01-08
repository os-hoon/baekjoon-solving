import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String N = br.readLine();
        Character [] arr = new Character[N.length()];
        for(int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i);
        }
        Arrays.stream(arr).sorted((a,b)->{
            if(a ==b)
                return a-b;
            else
                return b-a;
        }).forEach(System.out::print);
        

        
    }
}
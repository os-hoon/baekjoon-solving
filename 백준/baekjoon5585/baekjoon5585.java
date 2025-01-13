import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = {500, 100, 50, 10, 5, 1};
        N = 1000 - N;
        int cnt = 0;

        for(int i = 0 ; i <6; i++){
            if(N == 0)
                break;
            else{
                if(N >= arr[i]){
                    cnt += N/arr[i];
                    N %= arr[i];
                }    
            }
        }
        System.out.print(cnt);
        
    }
}
import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] dp =new int[N];
        
        for(int i = 0 ; i <N; i++)
            arr[i] = Integer.parseInt(br.readLine());


        dp[0] = arr[0];
        if(N == 2)
            dp[1] = arr[0]+arr[1];
        else if(N ==3){
            dp[1] = arr[0]+arr[1];
            dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);            
        }

        else if(N >3){
            dp[1] = arr[0]+arr[1];
            dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
            for(int i = 3; i < N; i++)
                dp[i] = Math.max(arr[i] + dp[i-2], arr[i]+arr[i-1]+dp[i-3]);
        }

       
        System.out.print(dp[N-1]);
        
    }
}
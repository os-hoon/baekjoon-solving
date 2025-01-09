import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++)
            dp[i]= Integer.parseInt(st.nextToken());       

        int Max = dp[0];
        for(int i = 1; i < n; i++){
            if(dp[i] < dp[i-1] + dp[i])
                dp[i] = dp[i-1] + dp[i];
            Max = Math.max(Max, dp[i]);

        }
            
        System.out.print(Max);

    }
}
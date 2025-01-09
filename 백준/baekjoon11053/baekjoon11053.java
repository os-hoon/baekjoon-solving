import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++)
            arr[i]= Integer.parseInt(st.nextToken());   

        Arrays.fill(dp, 1);
        int Max =dp[0];

        for(int i = 1; i < n;i++){
            for(int j = 0; j <i;j++){
                if(arr[i] > arr[j] && dp[i] <dp[j]+1 )
                    dp[i] = dp[j] + 1;
            }
            Max = Math.max(Max,dp[i]);
        }
            
        System.out.print(Max);

    }
}
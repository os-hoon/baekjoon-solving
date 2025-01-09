import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0]= Integer.parseInt(st.nextToken()); 
            dp[i][1]= Integer.parseInt(st.nextToken());
            dp[i][2]= Integer.parseInt(st.nextToken()); 
        }

        for(int i = 1; i < n;i++){
            for(int j = 0; j < 3;j++){
                if(j == 0){
                    int tmp = Math.min(dp[i-1][1],dp[i-1][2]);
                    dp[i][j] += tmp;
                }

                else if(j == 1){
                    int tmp = Math.min(dp[i-1][0],dp[i-1][2]);
                    dp[i][j] += tmp;
                }

                else{
                    int tmp = Math.min(dp[i-1][0],dp[i-1][1]);
                    dp[i][j] += tmp;
                }
            }
        }
        int Min = dp[n-1][0];
        for(int i = 0; i< 3; i++){
            Min = Math.min(dp[n-1][i],Min);
        }
        System.out.print(Min);

    }
}
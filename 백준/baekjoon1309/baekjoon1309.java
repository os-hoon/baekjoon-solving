import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int [][] dp = new int[n][2];
        dp[0][0] = 3;
        if(n>1){
            dp[1][0] = 3;
            dp[1][1] = 2;
        }

        for(int i =2; i <n;i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1]*2)%9901;
            dp[i][1] = (dp[i-1][0]+ dp[i-1][1])%9901;
        }

        System.out.print((dp[n-1][0]+ dp[n-1][1]*2)%9901);
        
    }
}
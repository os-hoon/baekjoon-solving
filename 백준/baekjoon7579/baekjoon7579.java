import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr = new int[N+1][2];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= N; i++)         
            arr[i][0] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int allcost = 0;
        for(int i = 1; i <= N; i++){
            int cost = Integer.parseInt(st.nextToken());
            arr[i][1] = cost;
            allcost +=cost;
        }
        
        int [][] dp = new int[N+1][allcost+1];

        for(int i = 1; i <= N; i++){
            for(int j = 0; j <=allcost;j++){
                if(arr[i][1] > j)
                    dp[i][j] = dp[i-1][j];

                else
                    dp[i][j] = Math.max(dp[i-1][j], arr[i][0]+ dp[i-1][j-arr[i][1]]);

                if(i == N){
                    if(dp[i][j] >=M){
                        System.out.print(j);
                        return;
                    }
                }
                    
            }
        }
    }
}
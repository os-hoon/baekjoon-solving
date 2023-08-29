
import java.util.*;

public class baek1149 {


   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int N= sc.nextInt();

        int[][] arr = new int[N+1][4];
        int[][] dp = new int[N+1][4];
        for(int i = 1 ; i <= N; i++) {
           for(int j = 1; j <=3; j++)
              arr[i][j] = sc.nextInt();
        }
        
        for(int i = 1; i <=3;i++)
           dp[1][i] = arr[1][i];
        
        for(int i = 2; i <=N; i++) {
           dp[i][1] = arr[i][1]+ Math.min(dp[i-1][2], dp[i-1][3]);
           dp[i][2] = arr[i][2]+Math.min(dp[i-1][1], dp[i-1][3]);
           dp[i][3] = arr[i][3]+Math.min(dp[i-1][1], dp[i-1][2]);
        }
        
        int Min = dp[N][1];
        for(int i = 1; i <=3; i++)
           Min = Math.min(Min, dp[N][i]);
        System.out.println(Min);
       

           
           
               
   }
}

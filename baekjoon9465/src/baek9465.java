import java.util.*;
public class baek9465 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);                 
        int n= sc.nextInt();
        int k;
        int [][] arr = new int[2][100000];
        int [][] dp = new int[2][100000];
        
        
        for(int i = 0 ; i < n; i++) {
           k = sc.nextInt();          
           for(int j = 0; j < 2 ; j++) {
              for(int l =0; l < k; l++) {
                 arr[j][l] = sc.nextInt();
              }
           }
           dp[0][0] = arr[0][0];
           dp[1][0] = arr[1][0];
           dp[0][1] = dp[1][0] + arr[0][1];
           dp[1][1] = dp[0][0] + arr[1][1];
           
           for(int j = 2; j <k; j++) {
              dp[0][j] = Math.max(dp[1][j-1],dp[1][j-2]) +arr[0][j];
              dp[1][j] = Math.max(dp[0][j-1],dp[0][j-2]) +arr[1][j];
           }
           System.out.println(Math.max(dp[0][k-1],dp[1][k-1]));
           
        }
        
      

   }

}
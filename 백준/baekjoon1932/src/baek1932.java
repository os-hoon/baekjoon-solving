import java.util.*;
public class baek1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] dp = new int[n][n];
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j <=i;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dp[0][0] = arr[0][0];
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <=i; j++) {
				if(j == 0)
					dp[i][j] = dp[i-1][j] + arr[i][j];
				else if(j == i)
					dp[i][j] = dp[i-1][j-1] + arr[i][j];
				else {
					dp[i][j] = Math.max(dp[i-1][j-1]+arr[i][j], dp[i-1][j]+arr[i][j]);
				}
			}
		}
		
		int Max = 0;
		
		for(int i = 0; i < n; i++)
			Max = Math.max(Max, dp[n-1][i]);
		
		System.out.println(Max);


	}

}

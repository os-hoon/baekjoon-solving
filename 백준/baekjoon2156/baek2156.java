import java.util.*;
public class baek2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int[] arr = new int[n];
		int[][] dp = new int[n][3];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();			
		}
		
		int maxLength =arr[0] ;
		dp[0][0] = 0;
		dp[0][1] = arr[0];
		dp[0][2] = 0;
		
		if(n > 1) {
			dp[1][0] = dp[0][1];
			dp[1][1] = arr[1];
			dp[1][2] = dp[0][1] + arr[1];
			maxLength = dp[1][2];
		}
		
		
		for(int i = 2; i < n; i++) {			
			dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1] = Math.max(dp[i-2][0],Math.max(dp[i-2][1], dp[i-2][2])) + arr[i];
			dp[i][2] = dp[i-1][1]+ arr[i];
			maxLength = Math.max(dp[i][0], Math.max(dp[i][1], dp[i][2]));
		}
		
		System.out.println(maxLength);

		
	}

}

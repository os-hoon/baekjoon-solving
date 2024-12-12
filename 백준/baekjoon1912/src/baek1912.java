import java.util.*;

public class baek1912 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int[] arr = new int[n];
		int [] dp = new int[n+1];
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i] = Math.max(dp[i-1] + arr[i-1],arr[i-1]);
		}
		

		int maxLength =dp[1] ;
        for (int i = 1; i <= n; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        System.out.println(maxLength);
	
	}

}

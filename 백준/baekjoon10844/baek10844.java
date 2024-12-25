import java.util.*;

public class baek10844 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		long result = 0;
		
		int[][] dp = new int[101][10];
		for(int i = 1 ; i <10; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i <=100;i++) {
			for(int j = 0; j<10;j++) {
				if(j == 0)
					dp[i][j] = dp[i-1][j+1];
				else if(j == 9)
					dp[i][j] = dp[i-1][j-1];
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
				}
			}
		}
		
		for(int i = 0; i < 10; i++)
			result += dp[n][i];
		System.out.println(result% 1000000000);
		
	
	}

}

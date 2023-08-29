import java.util.Scanner;

public class baek13398 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		int[] arr = new int[n];
		int [][] dp = new int[n][2];
		
	
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();		
		}
		//두번째 괄호의 0은 배열의 수 중에서 하나를 제거 했을때 (즉 0 일때) 두번째 괄호의 1은 배열의 수 중에서 하나도 제거 안 했을때  
		dp[0][0] = 0; //첫번째 수를 지웠을때(0)일때 항상 0이므로 0넣어도 무관
		dp[0][1] = arr[0];//첫번째 수 안 지웠을때 그대로 들어감
		int maxLength =dp[0][1] ;
		
		
		
		
		for(int i = 1; i < n; i++) {			
			dp[i][0] = Math.max(dp[i-1][0] + arr[i],dp[i-1][1] );
			dp[i][1] = Math.max(dp[i-1][1] + arr[i], arr[i]);
			maxLength = Math.max(maxLength, Math.max(dp[i][0], dp[i][1])) ;
		}
		
        System.out.println(maxLength);
	
	}

}

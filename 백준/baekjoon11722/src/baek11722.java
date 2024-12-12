import java.util.*;
public class baek11722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		
		int[] dp = new int[N+1] ;
		int[] arr = new int[N+1];
		
		for(int i = 1; i <= N; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 1; i <= N; i++)
			dp[i] = 1;
		
		for(int i= N-1; i >=0; i--) {
			for(int j = N; j >i; j--) {
				if(arr[i] > arr[j] && dp[i] < dp[j] +1)
					dp[i]++;
				
			}
		}
			
		int Max = 0;
		
		for(int i = 1; i <=N; i++)
			Max = Math.max(Max, dp[i]);
		
		System.out.println(Max);
	}
}

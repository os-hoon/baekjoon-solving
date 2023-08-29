import java.util.*;
public class baek11052 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] list = new int [n];
        for(int i = 0; i < n; i++) {
        	list[i] = sc.nextInt();
        }
        
        int max = cutRod(list,n);
        System.out.println(max);
        
            
        
        
	}
	public static int cutRod(int[] price, int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		for(int i = 1; i <=n; i++) {
			int max_val = -1;
			for(int j = 0; j < i; j++) {
				max_val = Math.max(max_val, price[j] + dp[i-j-1]);
			}
			dp[i] = max_val;
		}
		return dp[n];
	}
               
}

import java.util.*;

public class baek11057 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();

        int[][] dp = new int[N][10];
    
        
        for(int i = 0; i <N; i++) {
        	for(int j = 0; j <=9; j++) {
        		if(i == 0 || j == 0)
        			dp[i][j] = 1;
        		
        		else {
        			dp[i][j] = (dp[i-1][j] + dp[i][j-1])%10007;
        		}
        	}
        }
        
        int sum = 0;
        for(int i = 0; i <=9; i++)
        	sum +=dp[N-1][i]%10007;
        System.out.println(sum%10007);
       

        	
        	
					
	}
}

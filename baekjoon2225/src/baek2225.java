import java.util.*;
import java.math.BigInteger;
public class baek2225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BigInteger bigNumber = BigInteger.valueOf(1000000000);
		 int mod = bigNumber.intValue();
		 Scanner sc = new Scanner(System.in);		 			 
	     int n= sc.nextInt();
	     int k = sc.nextInt();
	     long [][] dp = new long[k][n+1];
	     
	     for(int i =0; i < k; i++) {
	    	 for(int j = 0 ; j <=n;j++) {
	    		 if(i == 0 || j == 0)
	    			 dp[i][j] = 1;
	    		 else 
	    			 dp[i][j] = (dp[i-1][j] + dp[i][j-1])% mod;	    		 	    		 
	    	 }
	     }
	     
	     
	     
	     System.out.println(dp[k-1][n] % mod);
	     
		

	}

}

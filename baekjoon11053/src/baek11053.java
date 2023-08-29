
import java.util.*;
public class baek11053 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        int [] dp = new int[n];
        
        for(int i = 0; i < n ; i++) {
        	arr[i] = sc.nextInt();
        	dp[i] = 1;
        }
        
        for(int i =0; i <n; i++) {
        	for(int j = 0; j < i; j++) {
        		if(arr[i] > arr[j] && dp[i] < dp[j] + 1 )
        			dp[i] = dp[j] + 1;
        	}
        }
        
        int maxlength = 0;
        for(int num: dp) {
        	maxlength = Math.max(num, maxlength);
        }
       
        System.out.println(maxlength);
	}
	
               
}
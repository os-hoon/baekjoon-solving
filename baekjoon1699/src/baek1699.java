import java.util.*;
public class baek1699 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num = n;
        int [] d = new int[n+1];
        d[0] = 0;
                              
        for(int i =1; i <=n; i++) {
        	d[i] = i;
        	for(int j = 1; j*j <= i; j++) {
        		d[i] = Math.min(d[i], d[i-j*j]+1);
        		
        	}
        			
        }
        System.out.println(d[n]);
    }        

}	
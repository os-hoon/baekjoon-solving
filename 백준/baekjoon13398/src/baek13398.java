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
		//�ι�° ��ȣ�� 0�� �迭�� �� �߿��� �ϳ��� ���� ������ (�� 0 �϶�) �ι�° ��ȣ�� 1�� �迭�� �� �߿��� �ϳ��� ���� �� ������  
		dp[0][0] = 0; //ù��° ���� ��������(0)�϶� �׻� 0�̹Ƿ� 0�־ ����
		dp[0][1] = arr[0];//ù��° �� �� �������� �״�� ��
		int maxLength =dp[0][1] ;
		
		
		
		
		for(int i = 1; i < n; i++) {			
			dp[i][0] = Math.max(dp[i-1][0] + arr[i],dp[i-1][1] );
			dp[i][1] = Math.max(dp[i-1][1] + arr[i], arr[i]);
			maxLength = Math.max(maxLength, Math.max(dp[i][0], dp[i][1])) ;
		}
		
        System.out.println(maxLength);
	
	}

}

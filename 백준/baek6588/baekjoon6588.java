import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class baekjoon6588 {
	static int[]numbers = new int[1000001];
	static int MAX;
		
	
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {			
			int num= Integer.parseInt(br.readLine());
			if(num == 0)
				break;	
			list.add(num);
			ismax(num);
						
	} 
		addPrimeToMap();
		
		for(int i = 0; i < list.size(); i++) {
			int inputnum = list.get(i);
			for(int j = 3; j <MAX; j+=2) {
				if(j == inputnum - 1) {
					System.out.println("Goldbach's conjecture is wrong.");
					break;
				}
				//�� Ȧ�� �������� ���°� 0�̸� �Ѵ� �Ҽ�
				if(numbers[j] + numbers[inputnum - j] == 0) {
					System.out.println(inputnum+ " = "+ j + " + " + (inputnum - j) );
					break;
				}
			}

			
		}			
               
}
	
	public static void addPrimeToMap() {
        // �����佺�׳׽� �� (Ư�� ������ ��� �Ҽ� �Ǻ� �˰���)
        for (int i = 2; i * i <= MAX; i++) {
            if (numbers[i] == 1) continue;

            for (int j = i + i; j <= MAX; j += i)//�ռ����� �� state == 1�� �����ϴµ�
                numbers[j] = 1;

        }
    }
	
	public static void ismax(int num) {
		if(MAX < num)
			MAX =num;
	}

}


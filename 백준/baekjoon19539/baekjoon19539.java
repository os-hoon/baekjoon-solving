import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;
        int two = 0;
        int one = 0;
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());   
            sum +=num;
            two += num/2;
            one += num%2;            
        }
        
        if(sum %3 ==0){            
            if(one > two)
                System.out.print("NO");
            else
                System.out.print("YES");
        }
            
        else
            System.out.print("NO");
        
    }
}
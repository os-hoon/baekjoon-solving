import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            q.add(num);
        }

        int ans = 0;

        if(q.size() == 1){
            System.out.print(0);
            return;
        }

        while(true){
            int sum = 0;
            
            for(int i =0; i < 2; i++)
                sum+=q.poll();

            ans += sum;
            
            if(q.isEmpty()){
                System.out.print(ans);
                return;
            }
            
            q.add(sum);
        
                
        }
        
        
        
    }
}
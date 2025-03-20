import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0 ; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(q.isEmpty())
                    System.out.println(0);
                else{
                    System.out.println(q.poll());
                }
                    
            }

            else{
                q.add(num);
            }

        }
    }
}
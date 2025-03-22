import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int idx = 0; idx < T; idx++){
            PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minheap = new PriorityQueue<>();
            int M = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int size = 0;
            
            StringTokenizer st = null;
            for(int i = 1; i <= M; i++){
                if(i%10 == 1)
                    st =new StringTokenizer(br.readLine());

                if(maxheap.isEmpty() || i % 2 ==1){
                    maxheap.offer(Integer.parseInt(st.nextToken()));
                    if(!minheap.isEmpty()){
                        if(minheap.peek() < maxheap.peek()){
                            int n1;
                            int n2;

                            n1 = minheap.poll();
                            n2 = maxheap.poll();

                            maxheap.offer(n1);
                            minheap.offer(n2);
                        }
                    }
                    sb.append(maxheap.peek()+ " ");
                    size++;
                    if(size %10 == 0)
                        sb.append("\n");
                }

                else{
                    minheap.offer(Integer.parseInt(st.nextToken()));
                    if(minheap.peek() < maxheap.peek()){
                            int n1;
                            int n2;

                            n1 = minheap.poll();
                            n2 = maxheap.poll();

                            maxheap.offer(n1);
                            minheap.offer(n2);
                    }
                }
                
            }

            System.out.println(size);
            System.out.println(sb);
            
        }
    }
}
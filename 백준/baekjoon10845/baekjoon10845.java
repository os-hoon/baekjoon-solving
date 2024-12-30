import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Deque<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i =0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                q.offer(Integer.parseInt(st.nextToken()));
            }

            else if(command.equals("pop")){
                if(q.isEmpty()){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(q.poll());
            }

            else if(command.equals("size")){
                System.out.println(q.size());
            }

            else if(command.equals("empty")){
                if(q.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }

            else if(command.equals("front")){
                if(q.isEmpty())
                    System.out.println(-1);

                else
                    System.out.println(q.peekFirst());
            }

            else{
                if(q.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(q.peekLast());
            }

        }
    }
}
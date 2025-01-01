import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0 ; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push_front"))
                dq.offerFirst(Integer.parseInt(st.nextToken()));

            else if (command.equals("push_back"))
                dq.offer(Integer.parseInt(st.nextToken()));

            else if(command.equals("pop_front")){
                if(dq.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dq.poll());
            }

            else if (command.equals("pop_back")){
                if(dq.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dq.pollLast());
            }

            else if(command.equals("size"))
                System.out.println(dq.size());

            else if (command.equals("empty")){
                if(dq.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }

            else if(command.equals("front")){
                if(dq.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dq.peek());
            }

            else{
                if(dq.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dq.peekLast());
            }
        }
    }
}
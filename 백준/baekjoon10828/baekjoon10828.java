import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }

            else if(command.equals("pop")){
                if(stack.empty()){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack.pop());
            }

            else if(command.equals("size")){
                System.out.println(stack.size());
            }

            else if(command.equals("empty")){
                if(stack.empty() == true)
                    System.out.println(1);
                else
                    System.out.println(0);
            }

            else{
                if(stack.empty()){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack.peek());
            }

        }


    }
}
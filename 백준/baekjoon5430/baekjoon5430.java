import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Deque <Integer> arr = new LinkedList<>();
        for(int i = 0; i < T; i++){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String []A = br.readLine().replaceAll("\\[|\\]","").split(",");
            for(int j = 0 ; j < n; j++){
                arr.offer(Integer.parseInt(A[j]));
            }

            int cnt = 0;
            boolean state = true;
            boolean check = true;
            for(int j = 0 ; j < p.length(); j++){
                if(p.charAt(j) == 'R'){

                    cnt++;
                    if(cnt % 2 == 0)
                        state = true;

                    else if (cnt% 2 !=0)
                        state = false;
                }


                else if(p.charAt(j) == 'D'){
                    if(arr.isEmpty()){
                        System.out.println("error");
                        check = false;
                        break;
                    }
                    else{
                        if(state){
                            arr.poll();
                        }
                        else if (!state){
                            arr.pollLast();
                        }
                    }
                }

            }

            if(arr.isEmpty()){
                if(check)
                    System.out.println("[]");
            }

            else{
                StringBuilder sb = new StringBuilder();
                sb.append("[");

                while(!arr.isEmpty()){
                    if(state)
                        sb.append(arr.poll());
                    else
                        sb.append(arr.pollLast());

                    if(arr.isEmpty()){
                        sb.append("]");
                    }

                    else{
                        sb.append(",");
                    }

                }

                System.out.println(sb);
            }

        }
    }
}
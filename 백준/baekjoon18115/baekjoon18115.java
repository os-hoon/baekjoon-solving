import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque <Integer> tec = new LinkedList<>();
        Deque <Integer> firststate = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N; i++){
            tec.offerFirst(Integer.parseInt(st.nextToken()));
        }

        for(int i = 1; i <= N; i++){
            int check = tec.poll();
            if(check == 1){
                firststate.offerFirst(i);
            }

            else if(check == 2){
                int tmp = firststate.poll();
                firststate.offerFirst(i);
                firststate.offerFirst(tmp);
            }

            else if (check == 3){
                firststate.offer(i);
            }
        }

        while(!firststate.isEmpty())
            sb.append(firststate.poll()+" ");

        System.out.print(sb);

    }
}
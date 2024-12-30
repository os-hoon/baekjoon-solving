import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            LinkedList<int[]> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j <N; j++)
                q.offer(new int []{j,Integer.parseInt(st.nextToken())});
            int cnt = 0;

            while(!q.isEmpty()){
                boolean state = true;
                int[] comp = q.poll();
                for(int j = 0; j <q.size(); j++){
                    if(comp[1] < q.get(j)[1]){
                        q.offer(comp);
                        for(int k =0; k <j; k++){
                            q.offer(q.poll());
                        }
                        state = false;
                        break;
                    }
                }

                if(state){
                    cnt++;
                    if(comp[0] == M){
                        System.out.println(cnt);
                        break;
                    }
                }
            }

        }
    }
}
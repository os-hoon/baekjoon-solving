import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] state = new boolean[N +1];

        state[0] = true;
        state[1] = true;

        for(int i = 2; i <=Math.sqrt(N); i++){
            if(state[i])
                continue;
            for(int j = i*i; j <=N; j+=i){
                if(!state[j]){
                    state[j] = !state[j];
                }
            }
        }

        for(int i = M ; i <= N; i++){
            if(!state[i])
                System.out.println(i);
        }



    }
}
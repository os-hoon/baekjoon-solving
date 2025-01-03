import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] state = new boolean[N+1];
        int cnt = 0;

        for(int i =2; i <= N; i++){
            if(state[i])
                continue;

            for(int j =i; j<=N ; j+=i){
                if(!state[j]){
                    state[j] = true;
                    cnt++;
                    if(cnt == K){
                        System.out.print(j);
                        break;
                    }
                }
            }
        }
    }
}
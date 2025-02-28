import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];
        boolean [] visit = new boolean[N];

        for(int i =0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int idx = 0;
        int cnt = 1;
    
        while(true){
            if(visit[idx]){
                System.out.print(-1);
                System.exit(0);
            }

            else{
                if(arr[idx] == K){
                    System.out.print(cnt);
                    System.exit(0);
                }
                cnt++;
                visit[idx] = true;
                idx = arr[idx];
            }
        }
    }

    
}
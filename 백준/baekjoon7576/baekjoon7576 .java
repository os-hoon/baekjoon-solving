import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][]arr;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static Queue<int[]> q = new LinkedList<>();
    static int ans = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1)
                    q.add(new int[]{i,j});
            }
        }
        
        find(N,M);

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j< M; j++){
                if(arr[i][j] == 0){
                    System.out.print(-1);
                    return;
                }
                ans = Math.max(ans,arr[i][j]);
            }
        }
        System.out.print(ans-1);
        
    }

    static void find(int N, int M){
        while(!q.isEmpty()){
            int[] n = q.poll();
            int nx = n[0];
            int ny = n[1];

            for(int i = 0 ; i< 4; i++){
                int cx = dx[i]+nx;
                int cy = dy[i]+ny;

                if(cx <0 || cy < 0 || cx > N-1 || cy > M-1 || arr[cx][cy] !=0)
                    continue;
                
                q.add(new int[]{cx, cy});
                arr[cx][cy] = arr[nx][ny] +1;
            }
            
        }
    }
   
}
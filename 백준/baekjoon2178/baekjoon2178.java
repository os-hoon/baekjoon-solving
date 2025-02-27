import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [][] arr;
    static boolean[][] visit;
    static int[] dx={0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
    
        arr = new int[N][M];

        for(int i =0; i < N ; i++){
            String str = br.readLine();
            for(int j = 0 ; j<M; j++){
                arr[i][j]= Integer.parseInt(Character.toString(str.charAt(j)));
            }
        }

        visit = new boolean[N][M];

        find(0,0,N,M);

        System.out.print(arr[N-1][M-1]);

        
    }

    static void find(int x, int y, int N, int M){

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while(!q.isEmpty()){
            int []n = q.poll();
            int nx = n[0];
            int ny = n[1];

            for(int i = 0 ; i< 4; i++){
                int cx = dx[i]+nx;
                int cy = dy[i]+ny;

                if(cx <0 || cy <0 || cx > N-1 || cy > M-1 || arr[cx][cy] == 0 || visit[cx][cy])
                    continue;

                q.add(new int []{cx, cy});
                visit[cx][cy] = true;
                arr[cx][cy] = arr[nx][ny]+1;
                
            }
        }
       
        
    }
}
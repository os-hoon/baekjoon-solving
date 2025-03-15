import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean [][] check;
    static int[][] board;
    static int N;
    static int M;
    static int []dx = {1,-1,0,0};
    static int[]dy = {0,0,1,-1};
    static int Max = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        check = new boolean[N][M];

        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                find(j,i,1,0);
                if(j-1 >=0 && j+1 < M && i+1 < N)
                    Max = Math.max(Max, board[i][j] + board[i][j-1] + board[i][j+1]+ board[i+1][j]);
                if(j-1 >=0 && j+1 < M && i-1 >= 0)
                    Max = Math.max(Max, board[i][j] + board[i][j-1] + board[i][j+1]+ board[i-1][j]);
                if(j-1 >=0 && i+1 < N && i-1 >= 0)
                    Max = Math.max(Max, board[i][j] + board[i][j-1] + board[i+1][j]+ board[i-1][j]);
                if(j+1 < M && i+1 < N && i-1 >= 0)
                    Max = Math.max(Max, board[i][j] + board[i][j+1] + board[i+1][j]+ board[i-1][j]);
                
            }
        }

        System.out.print(Max);
        
    }

    static void find(int x, int y, int depth, int sum){
        sum+=board[y][x];
        check[y][x] = true;
        
        if(depth == 4){
            Max = Math.max(Max, sum);
            return;
        }

        for(int i = 0; i < 4; i++){
            int cx = dx[i] + x;
            int cy = dy[i] + y;

            if(cx >=0 && cy >=0 && cx <= M-1 && cy <= N-1 && !check[cy][cx]){
                find(cx,cy,depth+1, sum);
                check[cy][cx] = false;
            }
        }

        check[y][x] = false;
        
    }
}
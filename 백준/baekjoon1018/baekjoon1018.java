import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static int min = 64;
    public static void main(String[]args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] chess = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String input = bf.readLine();
            for(int j = 0 ; j < M; j++){
                if(input.charAt(j)=='W')
                    chess[i][j] = true;
                else
                    chess[i][j] = false;
            }
        }

        for(int i = 0; i<=N- 8; i++){
            for(int j = 0 ; j<=M-8; j++){
                search(chess,i,j);
            }
        }
        System.out.print(min);
    }

    static void search(boolean[][] chess,int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int cnt = 0;
        boolean color = chess[x][y];

        for(int i = x; i<end_x; i++){
            for(int j = y; j<end_y; j++){
                if(chess[i][j] != color)
                    cnt++;

                color = !color;
            }
            color = !color;
        }
        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(cnt,min);
    }

}
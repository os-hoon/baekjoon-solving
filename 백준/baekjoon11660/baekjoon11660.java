import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=N;j++)
                arr[i][j] = Integer.parseInt(st.nextToken());            
        }

        int [][] sum = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){
            for(int j = 0; j <=N;j++)
                if(j == 0)
                    sum[i][j] = sum[i-1][N];
                else if(j == 1)
                    sum[i][j] = sum[i-1][N] + arr[i][j];
                else
                    sum[i][j] = sum[i][j-1] + arr[i][j];          
        }

        int ans = 0;
        for(int i =0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            for(int idx = x1; idx <=x2; idx++){
                ans += sum[idx][y2] - sum[idx][y1-1];
            }

            System.out.println(ans);
            ans = 0;
        }
        

    }
}
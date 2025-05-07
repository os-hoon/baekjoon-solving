import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[R+1][C+1];
        int[][] sum = new int[R+1][C+1];

        for(int i = 1; i<=R; i++){
            st = new StringTokenizer(br.readLine()); 
            for(int j = 1; j <=C; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());        
        }

        for(int i = 1; i<=R; i++){
            for(int j = 0; j <=C; j++){
                if(j == 0)
                    sum[i][j] = sum[i-1][C];
                else
                    sum[i][j] = sum[i][j-1]+arr[i][j];
            }
        }
        
        for(int i =0; i< Q; i++){
            int ans = 0;
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            for(int idx = r1; idx <=r2; idx++){
                ans += sum[idx][c2] - sum[idx][c1-1];
                cnt += c2-c1+1;
            }

            System.out.println(ans/cnt);
        }
    }
}
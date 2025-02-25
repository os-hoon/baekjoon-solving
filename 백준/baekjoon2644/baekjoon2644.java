import java.util.*;
import java.io.*;

class Main {
    static int[][] arr;
    static boolean[] check;
    static int cnt = 0;
    static int start = 0;
    static int end = 0;
    static int [] ans = {-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        check= new boolean[n+1];

        for(int i =0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        dfs(start);
        System.out.print(ans[0]);
    }

    static void dfs(int V){
        check[V] = true;

        if(V == end){
            ans[0] = cnt;
        }
        
        for(int i = 1 ; i < check.length; i++){
            if(arr[V][i] == 1 && !check[i]){
                cnt++;
                dfs(i);
                cnt--;
            }
        }
    }
        
}

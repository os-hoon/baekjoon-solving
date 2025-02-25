import java.util.*;
import java.io.*;

class Main {
    static int[][] arr;
    static boolean[] check;
    static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        check= new boolean[n+1];

        for(int i =0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        bfs(1);
        System.out.print(cnt);
    }

    static void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        check[V] = true;

        while(!q.isEmpty()){
            V = q.poll();
            for(int i = 1 ; i < check.length; i++){
                if(arr[V][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
        
    }
}
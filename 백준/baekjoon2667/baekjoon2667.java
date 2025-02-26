import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] arr;
    static boolean [][] visit;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N][N];
        for(int i = 0; i < N ; i++){
            String str = br.readLine();

            for(int j = 0; j <N; j++){
                arr[i][j] = Integer.parseInt(Character.toString(str.charAt(j)));
            }
        }

        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j] && arr[i][j] == 1){
                    find(i,j,N);
                    l.add(cnt);
                    cnt = 0;
                }
            }
        }
        
        System.out.println(l.size());

        l.stream().sorted().forEach(System.out::println);

        
    }

    static void find(int x, int y, int N){

        if(x <0 || y <0 || x> N-1 || y > N-1 || visit[x][y] || arr[x][y] == 0)
            return;
  
        visit[x][y] = true;
        cnt++;
        for(int i =0 ; i< 4; i++){
            int cx = dx[i]+x;
            int cy = dy[i]+y;
        
            find(cx,cy,N);
        }
    }
                   
}
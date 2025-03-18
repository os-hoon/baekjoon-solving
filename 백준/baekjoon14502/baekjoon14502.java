import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [][]section;
    static int [][]check;
    static int []drow = {1,-1,0,0};
    static int []dcol = {0,0,1,-1};
    static int N;
    static int M;
    static int Max;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        section = new int[N][M];
        check = new int[N][M];

        for(int i= 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                section[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i =0; i < N; i++)       
            check[i] = section[i].clone();
           
        find(0);
            
        System.out.print(Max);
    }

    static void find(int depth){
        if(depth ==3){
            int cnt = 0;
            
            for(int i =0; i < N; i++)       
                section[i] = check[i].clone();
            
            bfs();
                       
            for(int i = 0 ; i < N; i++){
                for(int j =0 ; j < M; j++){
                    if(check[i][j] == 0)
                        cnt++;
                }
            }

            Max = Math.max(Max, cnt);
            for(int i =0; i < N; i++)       
                check[i] = section[i].clone();
        
            return;
            
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j <M; j++){
                if(check[i][j] == 0){
                    check[i][j] = 1;
                    find(depth+1);
                    check[i][j] = 0;
                }
            }
        }      
    }

    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0 ; i < N; i++){
            for(int j =0 ; j < M; j++){
                 if(check[i][j] == 2)
                     q.add(new int[]{i,j});
            }
        }

        while(!q.isEmpty()){
            int [] n = q.poll();
            int nrow = n[0];
            int ncol = n[1];

    

            for(int i = 0; i < 4; i++){
                int crow = drow[i] + nrow;
                int ccol = dcol[i] + ncol;

                if(crow < 0 || ccol <0 || crow > N-1 || ccol > M-1 || check[crow][ccol] != 0)
                    continue;

                q.add(new int[]{crow,ccol});
                check[crow][ccol] = 2;
            }
        }

        
    }
}
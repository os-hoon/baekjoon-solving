import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        boolean[][] visit = new boolean[R][C];

        for(int i = 0 ; i< R; i++){
            String str = br.readLine();
            for(int j = 0 ; j < C; j++){
                map[i][j] = str.charAt(j);
            }
        }

        int col_min = C;
        int col_max = -1;
        int row_min = R;
        int row_max = -1;

        for(int i = 0 ; i< R; i++){
            
            for(int j = 0 ; j < C; j++){
                int cnt = 0;
                
                if(map[i][j] == 'X'){
                    if(j-1 >=0){
                        if(map[i][j-1] == '.'&& !visit[i][j-1])
                            cnt++;
                    }

                    else
                        cnt++;

                    if(j+1 <C){
                        if(map[i][j+1] == '.'&& !visit[i][j+1])
                            cnt++;
                    }

                    else
                        cnt++;

                    if(i-1 >=0){
                        if(map[i-1][j] == '.'&& !visit[i-1][j])
                            cnt++;
                    }

                    else
                        cnt++;

                    if(i+1 < R){
                        if(map[i+1][j] == '.' && !visit[i+1][j])
                            cnt++;
                    }

                    else
                        cnt++;

                    if(cnt >=3){
                        map[i][j] = '.'; 
                        visit[i][j] = true;
                    }
                    else{
                        col_min = Math.min(col_min,j);
                        col_max = Math.max(col_max,j);
                        row_min = Math.min(row_min,i);
                        row_max = Math.max(row_max,i);
                    }   
                }

            }
        }

        for(int i= row_min ; i <= row_max; i++){
            for(int j = col_min; j <= col_max; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
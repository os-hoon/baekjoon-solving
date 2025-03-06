import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        char[][] board = new char[R][C];
        boolean[][] visit = new boolean[R][C];

        for(int i = 0; i < R; i++){
            String str = br.readLine();
            for(int j = 0; j<C; j++){
                board[i][j] = str.charAt(j);
                if(board[i][j] == 'O')
                    visit[i][j] = true;
            }
        }

        if(N > 1){
            for(int idx = 2; idx <= N; idx++ ){
                if(idx % 2 == 0){
                    for(int i = 0; i < R; i++){
                        for(int j = 0; j<C; j++){
                            if(board[i][j] == '.'){
                                board[i][j] = 'O';
                            }
                        }
                    }        
                }

                else{
                    for(int i = 0; i < R; i++){
                        for(int j = 0; j<C; j++){
                            if(visit[i][j] && board[i][j] == 'O'){
                                board[i][j] = '.';
                                
                                if(i-1 >=0 && !visit[i-1][j]){
                                    visit[i-1][j] = true;
                                    board[i-1][j] = '.';
                                }

                                if(i+1 <R && !visit[i+1][j]){
                                    visit[i+1][j] = true;
                                    board[i+1][j] = '.';
                                }

                                if(j-1 >=0 && !visit[i][j-1]){
                                    visit[i][j-1] = true;
                                    board[i][j-1] = '.';
                                }

                                if(j+1 < C && !visit[i][j+1]){
                                    visit[i][j+1] = true;
                                    board[i][j+1] = '.';
                                }
                            }
                            
                        }
                    }

                    for(int i = 0; i < R; i++){
                        for(int j = 0; j<C; j++)                            
                            visit[i][j] = !visit[i][j];                                                            
                    }
                }

                
            }
        }


        for(int i = 0; i < R; i++){
            for(int j = 0; j<C; j++)
                System.out.print(board[i][j]); 
            System.out.println();
        }        
    
    }
}
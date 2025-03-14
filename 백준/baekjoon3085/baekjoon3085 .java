import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];

        for(int i = 0; i < N ; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                board[i][j] = str.charAt(j);
            }
        }
        
        int ans = 1;
        int cnt = 1;
        char tmp = ' ';
        
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N - 1; j++){
                tmp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = tmp;
                
                
                for(int k = 0; k < N - 1; k++){
                    
                    if(board[i][k] == board[i][k+1]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }
                        
                    else
                        cnt = 1;
                    
                }
                cnt = 1;

                for(int l = 0; l < N - 1; l++){
                    if(board[l][j] == board[l+1][j]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }

                    else
                        cnt = 1;
                }

                cnt = 1;

                for(int o = 0; o < N - 1; o++){
                    
                    if(board[o][j+1] == board[o+1][j+1]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }

                    else
                        cnt=1;
                }
                cnt = 1;

                tmp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = tmp;
                
            }
        }

        
        for(int j = 0 ; j < N; j++){
            for(int i = 0; i < N - 1; i++){
                
                tmp = board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j] = tmp;
                
                for(int k = 0; k < N - 1; k++){
                    
                    if(board[i][k] == board[i][k+1]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }
                        
                    else
                        cnt = 1;
                    
                }

                cnt = 1;

                for(int l = 0; l < N - 1; l++){
                    if(board[i][l] == board[i][l+1]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }

                    else
                        cnt = 1;
                }

                cnt = 1;

                for(int o = 0; o < N - 1; o++){
                    
                    if(board[i+1][o] == board[i+1][o+1]){
                        cnt++;
                        ans = Math.max(cnt, ans);
                    }

                    else
                        cnt=1;
                }

                cnt = 1;


                tmp = board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j] = tmp;
                
            }
        }

        System.out.print(ans);
        
    }
}
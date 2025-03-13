import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] square = new int[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0 ; j < M ; j++){
                square[i][j] = Integer.parseInt(Character.toString(str.charAt(j)));
            }
        }

        
        
        int cnt = 1;
        int ans = 1;
        
        while(true){
            if(cnt == Math.min(N,M)){
                System.out.print(ans*ans);
                break;
                    
            }
            
            for(int i = 0; i < N - cnt; i++){
                for(int j = 0 ; j < M - cnt; j++){
                    if(square[i][j] == square[i+cnt][j] && square[i][j] == square[i][j+cnt] && square[i][j] == square[i+cnt][j+cnt]){
                        ans = cnt+1;
                    }
                }
            }

            cnt++;
        }
        
    }      
}
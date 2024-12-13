import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] arr = new char[R][C];
        char[][] ans = new char[2*R][2*C];
        for(int i = 0 ; i<R;i++){
            String input = bf.readLine();
            for(int j = 0; j < C; j++){
                arr[i][j] = input.charAt(j);
            }
        }

        st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        A--;
        B--;

        int cnt_C = C-1;
        int cnt_R = R - 1;
        for(int i = 0 ; i< R; i++){           
            for(int j = 0; j < C; j++){
                ans[i][j] = arr[i][j];
            }                       
        }

         for(int i = 0 ; i< R; i++){  
            for(int j = C; j <2* C; j++){
                ans[i][j] = arr[i][cnt_C--];
            }          
             cnt_C = C-1;
        }

        for(int i = 0 ; i <2*C;i++){
            for(int j = R; j <2*R;j++){
                ans[j][i] = ans[cnt_R--][i];
            }
            cnt_R = R - 1;
        }

        if(ans[A][B] == '.')
            ans[A][B] = '#';

        else
            ans[A][B] = '.';
        

        for(int i = 0 ; i< 2*R; i++){
            for(int j = 0 ; j < 2*C;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
       
        
        
    }
    
}
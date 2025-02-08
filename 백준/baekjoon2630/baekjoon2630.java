import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] color;
    static int [][] paper;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        color = new int[2];
        
        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        find(0,0,N);

        System.out.println(color[0]);
        System.out.print(color[1]);
 
    }
   
    static void find(int row, int col, int N){
 
        boolean check = true;
        for(int i =row ; i < row+N; i++){
            for(int j =col ; j< col+N;j++){
                if(paper[row][col] != paper[i][j]){
                    check = !check;
                    break;
                }
            }
            if(!check)
                break;
        }
    
        if(check){
            color[paper[row][col]]++;
            return;
        }

        
        N /=2;
        find(row,col,N);
        find(row,col+N,N);
        find(row+N,col,N);
        find(row+N,col+N,N);
        
    }
}
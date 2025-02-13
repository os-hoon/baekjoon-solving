import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int cnt = 0;
    static int r;
    static int c;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        N = (int)Math.pow(4,N); 
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        find(0,0,N);
        
    }

    static void find(int row, int col, int N){

        if(N == 1){
            System.out.print(cnt);
            System.exit(0);
        }
            

        N /=4;
        int idx = (int)Math.sqrt(N);
        if(r < row + idx && c < col + idx)
            find(row,col,N);
        else if(r < row + idx && c >= col + idx){
            cnt += N;
            find(row,col + idx,N);
        }
        else if(r >= row + idx && c < col + idx){
            cnt += 2 * N;
            find(row + idx,col,N);
        }
            
        else{
            cnt += 3 * N;
            find(row + idx,col + idx,N);
        }
    }
}
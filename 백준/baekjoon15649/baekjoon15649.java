import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        check = new boolean[N];
        arr = new int[M];
        backtracking(N, M, 0);

    }

    static void backtracking(int N, int M, int depth){
        if(depth == M){
            for(int i = 0; i < M; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            return;
        }

        for(int i =0;i < N; i++){
            if(!check[i]){
                check[i] = true;
                arr[depth] = i+1;
                backtracking(N,M,depth+1);
                check[i] = false;
            }
        }

    }
}
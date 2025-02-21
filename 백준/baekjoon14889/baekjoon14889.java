import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [][] arr;
    static boolean [] check;
    static int Min = 10000;
    static int team[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        check = new boolean[N];
        team = new int[N];

        find(N,0,0);
        System.out.print(Min);

    }

    static void find(int N, int depth, int count){
        if(count == N/2){
            int sumS = 0;
            int sumL = 0;
            for(int i = 0; i < N-1; i++){
                for(int j = i+1; j < N; j++){
                    if(check[i] && check[j])
                        sumS += arr[i][j] + arr[j][i];
                    else if(!check[i] && !check[j])
                        sumL += arr[i][j] + arr[j][i];
                }
            }


            Min = Math.min(Min,Math.abs(sumS - sumL));
            return;
        }

        for(int i = depth; i <N; i++){
            if(!check[i]){
                check[i] = true;
                find(N, i+1, count+1);
                check[i] = false;
            }

        }

    }
}
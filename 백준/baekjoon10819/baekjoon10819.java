import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [] arr;
    static int Max = 0;
    static int [] select;
    static boolean [] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i = 0 ; i < N ; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        check = new boolean[N];
        select = new int[N];

        find(N,0);
        System.out.print(Max);
        
        
    }

    static void find(int N, int depth){
        if(depth == N){
            int sum = 0;
            for(int i = 0; i < N-1; i++)
                sum+=Math.abs(select[i]-select[i+1]);
            Max = Math.max(Max,sum);
            return;
        }

        for(int i =0; i < N; i++){
            if(!check[i]){
                check[i] = true;
                select[depth] = arr[i];
                find(N,depth+1);
                check[i] =false;
                
            }
        }

        
    }
}
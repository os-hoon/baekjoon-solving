import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] arr;
    static int [] select;
    static boolean [] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N==0)
                break;
            arr = new int[N];
            select = new int[6];
            check = new boolean[N];
            for(int i = 0 ; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            find(N, 0);
            System.out.println();

            
        }
        

    }

    static void find(int N, int depth){
        if(depth == 6){
            for(int i = 0; i < 6; i++){
                System.out.print(select[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = depth; i< N; i++){
            if(!check[i]){
                if(depth >0 && select[depth-1] > arr[i])
                    continue;
                check[i] = true;
                select[depth] = arr[i];
                find(N,depth+1);
                check[i] =false;
            }
        }
    }
}
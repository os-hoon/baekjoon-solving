import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int cnt = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];           
        });

    
        int cur = arr[0][1];
        for(int i = 1 ; i < N ; i++){
            if(arr[i][0] >= cur){
                cnt++;
                cur = arr[i][1];
            }

            else{
                if(arr[i][1] < cur)
                    cur = arr[i][1];                
            }
        }



        System.out.println(cnt);
    }
}
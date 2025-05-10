import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (int[]a, int[]b) -> a[0] - b[0]);
            
        int range = 0, cnt = 0, ans = 0;
        for(int i = 0; i < N; i++){
            if(arr[i][0] > range)
                range = arr[i][0];
            if(arr[i][1] > range){
                while(arr[i][1] >range){
                    range += L;
                    cnt++;
                }
            } 
            
        }

        System.out.print(cnt);
    }
}
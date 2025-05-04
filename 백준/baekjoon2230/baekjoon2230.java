import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0, end = 0, sub =0, ans = Integer.MAX_VALUE;

        while(end != N){
            sub = arr[end] - arr[start];

            if(sub < M)
                end++;

            else if(sub > M)
                start++;

            else{
                System.out.print(M);
                return;
            }

            if(sub > M)
                ans = Math.min(ans, sub);
        }

        System.out.print(ans);
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int start = 0, end = N-1,sum = 0,ans = Integer.MAX_VALUE;
        while(start != end){
            sum = arr[start] + arr[end];

            if(sum > 0)
                end--;

            else if(sum < 0)
                start++;
            else{
                System.out.print(0);
                return;
            }

            if(Math.abs(ans) > Math.abs(sum))
                ans = sum;

        }

        System.out.print(ans);
    }
}
import java.util.*;
import java.io.*;

class Main {
    static long Max = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[K];

        for(int i = 0; i < K; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        System.out.print(find(arr,N,1,arr[K-1]));
    }

    static long find(int []arr, int num, long start, long end){
        long mid = (start + end)/2;

        while(start <=end){
            int cnt = 0;
            for(int i = 0; i < arr.length; i++){
                cnt+=arr[i]/mid;
            }
            if(num <= cnt){
                Max = Math.max(Max, mid);
                return find(arr, num, mid+1, end);
            }
            else
                return find(arr, num, start, mid-1);
        }
        

        return Max;
    }
}
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        System.out.print(find(arr,M,0,arr[N-1]));
    }

    static long find(int []arr, int num, long start, long end){
        long mid = (start + end)/2;

        while(start <=end){
            long cnt = 0;
            for(int i = 0; i < arr.length; i++){
                if(mid < arr[i])
                cnt+=arr[i]-mid;
            }
            if(num <= cnt){
                return find(arr, num, mid+1, end);
            }
            else
                return find(arr, num, start, mid-1);
        }
        

        return mid;
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static long ans = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long[] arr= new long[N];

        for(int i = 0 ; i < N ; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        System.out.print(find(arr,C,1,arr[N-1]-arr[0]));

        
    }

    static long find(long[]arr, int C, long start, long end){
    
        while(start <=end){
            int cnt = 1;
            long mid = (start + end)/2;
            long cur = arr[0];

            for(int i = 1; i < arr.length; i++){
                long last = arr[i];

                if(last - cur >= mid){
                    cur = last;
                    cnt++;
                }
            }
            if(cnt < C){
                return find(arr,C,start, mid-1);
            }
            else{
                ans = Math.max(ans,mid);
                return find(arr,C,mid+1,end);
            }
        }
        
        return ans;
        
    }

}
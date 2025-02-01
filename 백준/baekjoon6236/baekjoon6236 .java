import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int Min = 10000 * 100000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int Max = 0;

        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            Max = Math.max(Max, arr[i]);
        }
        System.out.print(find(arr, M, Max, 10000* N));
    }

    static int find(int[]arr, int M, int start,int end){   
        while(start <=end){
            int cnt = 1;
            int mid = (start + end)/2;
            int check = mid;
            for(int i =0 ;i < arr.length; i++){
                if(check < arr[i]){
                    check = mid;
                    cnt++;
                }
                check -= arr[i];
            }
            if(cnt <= M){
                Min = Math.min(Min,mid);
                return find(arr,M,start,mid-1);
            }
            else{
                return find(arr,M,mid+1,end);
            }
        }
        return Min;
    }
}
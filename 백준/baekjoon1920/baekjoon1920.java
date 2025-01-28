import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int [] tmp = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<M; i++)
            tmp[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++){
            System.out.println(find(arr,tmp[i],0,N-1));
        }
        
    }

    static int find(int[] arr ,int num, int start, int end){
        int mid = (start + end)/2;

        while(start <=end){
            if(num == arr[mid])
                return 1;
            else if(num > arr[mid])
                return find(arr,num, mid+1, end);
            else
                return find(arr,num, start, mid-1);
        }

        return 0;
    }
}
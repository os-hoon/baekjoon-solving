import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N+1];
        for(int i =1 ; i< N+1; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int [] sum = new int[N+1];

        for(int i =1 ; i< N+1; i++)
            sum[i] = arr[i] + sum[i-1];        
        
        int M = Integer.parseInt(br.readLine());
        
       for(int idx = 0; idx< M; idx++){
           st = new StringTokenizer(br.readLine());
           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());

           System.out.println(sum[j] - sum[i-1]);
       }

        
    }
}
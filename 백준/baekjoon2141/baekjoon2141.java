import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][2];
        StringTokenizer st;
        
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr,(a,b)-> Long.compare(a[0], b[0]));
        long sum = 0;
        for(int i = 0 ; i < N; i++){
            sum +=arr[i][1];
        }

        sum = Math.round(sum /2.0);


        long idx = 0;

        for(int i = 0; i < N; i++){
            idx+=arr[i][1];
            if(idx >=sum){
                System.out.print(arr[i][0]);
                break;
            }
        }
        
        
    }
}
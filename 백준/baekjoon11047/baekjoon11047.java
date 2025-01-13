import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr,(a,b)->
            Integer.parseInt(b) - Integer.parseInt(a)
        );

        int sum = 0;
        for(int i = 0; i < N; i ++){
            if(K >= Integer.parseInt(arr[i])){
                sum += K/Integer.parseInt(arr[i]);
                K %=Integer.parseInt(arr[i]);
            }
        }

        System.out.print(sum);

    }
}
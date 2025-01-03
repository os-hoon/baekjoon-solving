import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int [] arr = new int[n];
            for(int j = 0 ; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            for(int j = 0 ; j <n-1; j++){
                for(int k =j+1; k <n;k++){
                    int a = arr[j];
                    int b = arr[k];
                    int A= Math.max(a,b);
                    int B= Math.min(a,b);
                    while(B > 0){
                        int tmp = B;
                        B = A %B;
                        A = tmp;

                    }
                    sum+=A;
                }
            }
            System.out.println(sum);
        }
    }
}
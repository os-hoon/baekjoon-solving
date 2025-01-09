import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long [] arr = new long[91];
        arr[0] = 0;
        arr[1] = 1;

        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while(i <= n){
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        }

        System.out.print(arr[n]);
    }
}
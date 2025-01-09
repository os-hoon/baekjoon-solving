import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long [][] arr = new long[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;

        arr[1][0] = 0;
        arr[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int j = 2;
            while(j <= n){
                arr[j][0] = arr[j-1][0] + arr[j-2][0];
                arr[j][1] = arr[j-1][1] + arr[j-2][1];
                j++;
            }
            System.out.print(arr[n][0]+" ");
            System.out.print(arr[n][1]+ "\n");
        }

    }
}
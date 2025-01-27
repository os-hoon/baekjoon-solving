import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [][] arr = new int[2][3];
        StringTokenizer st;
        long X,Y = 0;
        
        for(int i = 0 ; i< T; i++){
            st = new StringTokenizer(br.readLine());
            arr[0][0] = Integer.parseInt(st.nextToken());
            arr[0][1] = Integer.parseInt(st.nextToken());
            arr[0][2] = Integer.parseInt(st.nextToken());
            
            arr[1][0] = Integer.parseInt(st.nextToken());
            arr[1][1] = Integer.parseInt(st.nextToken());
            arr[1][2] = Integer.parseInt(st.nextToken());
            X = (arr[0][0]-arr[1][0]) * (arr[0][0]-arr[1][0]);
            Y = (arr[0][1]-arr[1][1]) * (arr[0][1]-arr[1][1]);
            
            long L = X+Y;
            long r_sum = (arr[0][2] + arr[1][2]) * (arr[0][2] + arr[1][2]);
            long r_sub = (arr[0][2] - arr[1][2]) * (arr[0][2] - arr[1][2]);

            if(L == 0){
                if(arr[0][2] == arr[1][2])
                    System.out.println(-1);
                else
                    System.out.println(0);
            }
            else{
                if(L < r_sum && L > r_sub)
                    System.out.println(2);
                else if(L == r_sum || L == r_sub)
                    System.out.println(1);
                else if(L> r_sum || L < r_sub)
                    System.out.println(0);
            }          
        }
    }
}
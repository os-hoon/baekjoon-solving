import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];

        for(int i = 0; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (int[]a, int[]b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        int start = -1000000001,end = -1000000001,ans=0;
        for(int i = 0; i < N ; i++){
            if(arr[i][0] > end){
                ans+=end - start;
                end = arr[i][1];
                start = arr[i][0];
            }

            else if(arr[i][0] <= end && arr[i][1] > end)
                end = arr[i][1];
        }
        ans+=end - start;
        
        System.out.print(ans);
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr,(String[]a,String[]b)->{
            if(Integer.parseInt(b[1]) == Integer.parseInt(a[1])){
                if(Integer.parseInt(b[2]) == Integer.parseInt(a[2])){
                    if(Integer.parseInt(b[3]) == Integer.parseInt(a[3])){
                        return a[0].compareTo(b[0]);
                    }

                    else
                        return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
                }

                else
                    return Integer.parseInt(a[2]) - Integer.parseInt(b[2]);
            }
            else
                return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
        });


            for(int i = 0; i < N; i++)
                System.out.println(arr[i][0]);

        
    }
}
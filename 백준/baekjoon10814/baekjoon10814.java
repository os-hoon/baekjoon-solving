import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][2];

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }


        str = Arrays.stream(str).sorted((String[] a, String[]b) ->
                Integer.parseInt(a[0])- Integer.parseInt(b[0])).toArray(String[][]::new);

        for(int i = 0 ; i < N; i++){
            System.out.print(str[i][0]+" ");
            System.out.println(str[i][1]);
        }
            

    
      
    }
    
    
}
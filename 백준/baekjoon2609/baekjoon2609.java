import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int A= Math.max(a,b);
        int B= Math.min(a,b);

        while(B > 0){
            int tmp = B;
            B = A %B;
            A = tmp;

        }
        int L = a*b/A;
        System.out.println(A);
        System.out.println(L);
    }
}
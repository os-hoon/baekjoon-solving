import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(find(n,k));
        
    }

    public static int find(int n, int k){
        if(k == 1 || k ==n)
            return 1;

        return find(n-1, k-1) + find(n-1, k);
    }
}
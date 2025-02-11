import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        bw.write(Long.toString(find(A,B,C)));
        bw.flush();
        bw.close();
    }
    static long find(long A, long exp, long C){
        if(exp == 1)
            return A % C;

        long cur = find(A,exp/2,C);

        if(exp % 2 == 1)
            return (cur * cur%C) * A % C;

        return cur * cur % C;
        
    }
}
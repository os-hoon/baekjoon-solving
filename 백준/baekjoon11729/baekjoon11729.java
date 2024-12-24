import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int ans = (int)(Math.pow(2,N)-1);
        sb.append(ans+ "\n");
        hanoi(N,1,2,3);
        System.out.print(sb);

    }

    static void hanoi(int N, int from, int mid, int to){
        if(N == 1){
            sb.append(from +" "+to+"\n");
            return;
        }

        hanoi(N-1, from, to, mid);
        sb.append(from +" "+to+"\n");
        hanoi(N-1,mid,from ,to);
    }
}
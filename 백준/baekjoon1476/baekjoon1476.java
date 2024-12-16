import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(E == 15)
            E = 0;
        if(M == 19){
            M = 0;
        }

        int ans = 0;
        int cnt = 0;
        while(true){
            ans = 28*cnt +S;
            if(ans % 15 == E && ans%19 ==M){
                System.out.print(ans);
                break;
            }
            cnt++;
        }
    }
}
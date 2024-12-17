import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int num = 1;
        int ans = 0;
        boolean state = false;

        while(true){
            for(int i = 0; i < cnt; i++){
                if(num == A)
                    state = true;
                else if(num == B+1){
                    System.out.print(ans);
                    return;
                }
                if(state == true)
                    ans +=cnt;
                num++;
            }
            cnt++;
        }


    }
}
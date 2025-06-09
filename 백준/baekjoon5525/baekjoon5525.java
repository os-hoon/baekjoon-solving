import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String S = br.readLine();

        int ans = 0;
        int cnt = 0;
        int i = 1;

        while(i < M-1){
            if(S.charAt(i) == 'O' && S.charAt(i+1) == 'I'){
                cnt++;
                if(cnt == N){
                    if(S.charAt(i - (2*cnt-1)) == 'I'){
                        ans++;
                    }
                    cnt--;
                }
                i+=2;
            }

            else{
                cnt = 0;
                i++;
            }
        }

        System.out.print(ans);
    }
}
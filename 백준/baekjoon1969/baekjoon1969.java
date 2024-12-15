import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] list = new char[N+1][M];
        int[] cnt = new int[4];
        int sum = 0;


        for(int i = 0; i < N; i++){
            String S =bf.readLine();
            for(int j = 0; j < M; j++){
                list[i][j] = S.charAt(j);
            }
        }

        for(int i = 0; i < M; i++){
            int max = 0;
            int idx = 0;
            for(int j = 0; j < N; j++){
                if(list[j][i] == 'A')
                    cnt[0]++;
                else if(list[j][i] == 'C')
                    cnt[1]++;
                else if(list[j][i] == 'G')
                    cnt[2]++;
                else
                    cnt[3]++;
            }
            for (int k = 0; k <4; k++) {
                if(max < cnt[k]){
                    max = cnt[k];
                    idx = k;
                }

            }
            if(idx == 0)
                list[N][i] = 'A';
            else if(idx == 1)
                list[N][i] = 'C';
            else if(idx == 2)
                list[N][i] = 'G';
            else
                list[N][i] = 'T';

            sum +=N- max;
            cnt = new int[4];
        }

        for(int i = 0; i <M; i++){
            System.out.print(list[N][i]);
        }
        System.out.println();
        System.out.print(sum);
    }

}
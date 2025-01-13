import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            String[] box = new String[N];

            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                int R = Integer.parseInt(st.nextToken());
                int C =Integer.parseInt(st.nextToken());
                box[j] = Integer.toString(R*C);
            }

            Arrays.sort(box,(a,b)->{
                return Integer.parseInt(b) - Integer.parseInt(a);
            });

            for(int j = 0; j<box.length;j++){
                if(J <= Integer.parseInt(box[j])){
                    System.out.println(j+1);
                    break;
                }
                else
                    J-=Integer.parseInt(box[j]);
            }
            
        }

        
    }
}
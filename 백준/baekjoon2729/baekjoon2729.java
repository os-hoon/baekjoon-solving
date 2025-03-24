import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

                        
            int[] arrA = new int[81];
            int[] arrB = new int[81];
            int[] sum = new int[81];
            

            for(int idx = A.length()-1; idx >= 0; idx--)
                arrA[A.length()-1 - idx] = Integer.parseInt(Character.toString(A.charAt(idx)));

            for(int idx = B.length()-1; idx >= 0; idx--)
                arrB[B.length()-1 - idx] = Integer.parseInt(Character.toString(B.charAt(idx)));

            for(int idx = 0; idx <80; idx++){
                if(arrA[idx]+arrB[idx] + sum[idx] == 2){
                    sum[idx] = 0;
                    sum[idx+1] = 1;
                }

                else if(arrA[idx]+arrB[idx]+sum[idx] == 3){
                    sum[idx] = 1;
                    sum[idx+1] = 1;
                }

                else if(arrA[idx]+arrB[idx]+sum[idx] == 1)
                    sum[idx] = 1;
                else
                    sum[idx] = 0;
                
            }
            boolean state = true;
            
            for(int idx = 80; idx >=0; idx--){
                
                if(sum[idx] == 0)
                    continue;
                else{
                    state = false;
                    for(int j = idx; j >=0; j--)
                        System.out.print(sum[j]);
                }

                if(!state)
                    break;
            }

            if(state)
                System.out.print(0);

            System.out.println();
        }
        
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(N == 0)
            System.out.print(0);
            
        else{
            while(N !=0){
                if(N >0 || N % -2 == 0){
                    sb.append(N%-2);
                    N/=-2;
                }

                else{
                    N = N*-1 +2;
                    sb.append(N%2);
                    N/=2;
                }
        
            }
            System.out.print(sb.reverse());
        }
        
    }
}
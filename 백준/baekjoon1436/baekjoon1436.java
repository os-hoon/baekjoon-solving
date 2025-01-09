import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int title = 666;
        int cnt = 1;
        while(cnt !=N){
            title++;
            if(Integer.toString(title).contains("666"))
                cnt++;
        }

        System.out.print(title);
    }
}
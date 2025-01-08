import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        
        for(int i = 0; i < N; i++){
            str[i] = br.readLine();          
        }


        Arrays.stream(str).distinct().sorted((a,b)->{
            if(a.length() == b.length())
                    return a.compareTo(b);
                else
                    return a.length() - b.length();
        }).forEach(System.out::println);

      
    }
    
    
}
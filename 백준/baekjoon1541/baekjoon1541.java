import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");
        String[]tmp;              
        int ans = 0;
      
        for(int i = 0; i <input.length;i++){
            tmp = input[i].split("\\+");
            if(i == 0){
                for(int j = 0 ; j < tmp.length;j++)
                    ans += Integer.parseInt(tmp[j]);
            }
            else{
                for(int j = 0 ; j < tmp.length;j++)
                    ans -= Integer.parseInt(tmp[j]);
            }                                                  
        }
        
        
        System.out.print(ans);
            
    }
}
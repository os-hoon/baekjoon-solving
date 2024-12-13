import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[11];
        while(true){
            int num = Integer.parseInt(bf.readLine());
            if(num == 0)
                break;
            String ans = bf.readLine();
            
            if(ans.equals("too high")){
                for(int i = num; i <=10;i++ ){
                    arr[i] =1;
                }
            }

            else if(ans.equals("too low")){
                for(int i = num; i >=1 ;i-- ){
                    arr[i] =1;
                }
            }

            else{
                if(arr[num] == 0){
                    System.out.println("Stan may be honest");
                }
                else{
                    System.out.println("Stan is dishonest");
                }
                arr = new int[11];
            }
            
        }
        
        
    } 
}
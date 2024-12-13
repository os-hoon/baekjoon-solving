import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int []num = new int[10];
        int []sum = new int[10];

        for(int i = 0 ;i < 10; i++){
            num[i] = Integer.parseInt(bf.readLine());     
        }

        for(int i = 0 ; i< 10; i++){
            for(int j = 0; j <= i; j++){
                sum[i] += num[j]; 
            }
            sum[i] = Math.abs(sum[i]-100);
        }
        int min =sum[0];
        int idx = 0;
        for(int i = 0; i < 10; i++){
            if(min >= sum[i]){
                min = sum[i];
                idx = i;
            }
       
        }
        int ans = 0;

        for(int i = 0 ; i<= idx; i++){
            ans+=num[i];
        }
        System.out.print(ans);
    
    }    
}
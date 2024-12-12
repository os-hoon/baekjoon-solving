import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        String []day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= x ; i++){
            for(int j = 1; j <=31; j++){
                cnt++;
                if(i == x && j == y)
                    break;                                   
                
                if(i == 2 && j ==28)
                    break;
                
                if((i == 4 || i == 6 || i == 9 || i == 11) && j == 30)
                    break;
                
               
            }
        
        }
        System.out.print(day[cnt%7]);
        
    }
}
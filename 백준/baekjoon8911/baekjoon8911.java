import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        char [] dir  = {'북','동','남','서'};
        
        for(int i =0 ; i < T; i++){
            String command = br.readLine();

            if(!command.contains("R") && !command.contains("L")){
                System.out.println(0);
                continue;
            }

            int cnt = 0;

            int row_min = 0;
            int row_max = 0;
            int col_min = 0;
            int col_max = 0;

            int cur_x = 0;
            int cur_y = 0;

            for(int j = 0 ; j < command.length(); j++){
                if(command.charAt(j) == 'L')
                    cnt--;

                else if(command.charAt(j) == 'R')
                    cnt++;
                
                if(cnt < 0)
                    cnt+=4;
                    
                else if(command.charAt(j) == 'F'){
                    
                    if(dir[cnt%4] == '서'){
                        cur_x--;
                    }

                    else if(dir[cnt%4] == '동'){
                        cur_x++;
                    }

                    else if(dir[cnt%4] == '남'){
                        cur_y--;
                    }

                    else if(dir[cnt%4] == '북'){
                        cur_y++;
                    }
                    
                }
                    

                else if(command.charAt(j) == 'B'){
                    if(dir[cnt%4] == '서'){
                        cur_x++;
                    }

                    else if(dir[cnt%4] == '동'){
                        cur_x--;
                    }

                    else if(dir[cnt%4] == '남'){
                        cur_y++;
                    }

                    else if(dir[cnt%4] == '북'){
                        cur_y--;
                    }
                    
                }

                row_min = Math.min(row_min, cur_y);
                row_max = Math.max(row_max, cur_y);
                col_min = Math.min(col_min, cur_x);
                col_max = Math.max(col_max, cur_x);
                
            }

            System.out.println((row_max - row_min) * (col_max - col_min));
        }
        
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int D_cnt = 1;
        int ans = 0;
        char[] Day = {'월', '화', '수', '목', '금', '토', '일'};

        for(int i = 2019 ; i <=N; i++){
            for(int j = 1; j <= 12; j++){
                if(i % 400 == 0 || (i % 100 !=0 && i % 4 == 0)){
                    if(j == 2){
                        for(int k = 1; k <=29; k++){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }

                    else if(j == 1 || j == 3 || j == 5 || j == 7 || j == 8|| j ==10 || j == 12){
                        for(int k = 1; k <=31; k++ ){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }

                    else{
                        for(int k =1; k<=30; k++){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }
                }

                else{
                    if(j == 2){
                        for(int k = 1; k <=28; k++){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }

                    else if(j == 1 || j == 3 || j == 5 || j == 7 || j == 8|| j ==10 || j == 12){
                        for(int k = 1; k <=31; k++ ){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }

                    else{
                        for(int k =1; k<=30; k++){
                            if(k == 13 && Day[D_cnt%7] == '금')
                                ans++;
                            D_cnt++;
                        }
                    }
                }
                
                
            }
        }

        System.out.print(ans);
    }
}
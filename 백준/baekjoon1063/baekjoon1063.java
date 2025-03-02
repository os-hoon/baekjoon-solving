import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String king = st.nextToken();
        int king_c = king.charAt(0)-64;
        int king_r = Integer.parseInt(Character.toString(king.charAt(1)));
        
        String rock = st.nextToken();
        int rock_c = rock.charAt(0)-64;
        int rock_r = Integer.parseInt(Character.toString(rock.charAt(1)));
        
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i< N; i++){
            String command = br.readLine();

            if(command.equals("B")){
                if(king_r-1 > 0 && king_r-1 < 9){
                    king_r--;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r-1 >0 && rock_r-1 <9)
                            rock_r--;
                        else
                            king_r++;
                    }
                }
            }

            else if(command.equals("T")){
                if(king_r+1 > 0 && king_r+1 < 9){
                    king_r++;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r+1 >0 && rock_r+1 <9)
                            rock_r++;
                        else
                            king_r--;
                    }
                }
            }

            else if(command.equals("R")){
                if(king_c+1 > 0 && king_c+1 < 9){
                    king_c++;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_c+1 >0 && rock_c+1 <9)
                            rock_c++;
                        else
                            king_c--;
                    }
                }
            }

            else if(command.equals("L")){
                if(king_c-1 > 0 && king_c-1 < 9){
                    king_c--;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_c-1 >0 && rock_c-1 <9)
                            rock_c--;
                        else
                            king_c++;
                    }
                }
            }

            else if(command.equals("RT")){
                if(king_r+1 > 0 && king_r+1 < 9 && king_c+1 > 0 && king_c+1 < 9){
                    king_c++;
                    king_r++;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r+1 >0 && rock_r+1 <9 && rock_c+1 >0 && rock_c+1 <9){
                            rock_c++;
                            rock_r++;
                        }
                        else{
                            king_c--;
                            king_r--;
                        }
                    }
                }
            }

            else if(command.equals("LT")){
                if(king_r+1 > 0 && king_r+1 < 9 && king_c-1 > 0 && king_c-1 < 9){
                    king_c--;
                    king_r++;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r+1 >0 && rock_r+1 <9 && rock_c-1 >0 && rock_c-1 <9){
                            rock_c--;
                            rock_r++;
                        }
                        else{
                            king_c++;
                            king_r--;
                        }
                    }
                }
            }

            else if(command.equals("RB")){
                if(king_r-1 > 0 && king_r-1 < 9 && king_c+1 > 0 && king_c+1 < 9){
                    king_c++;
                    king_r--;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r-1 >0 && rock_r-1 <9 && rock_c+1 >0 && rock_c+1 <9){
                            rock_c++;
                            rock_r--;
                        }
                        else{
                            king_c--;
                            king_r++;
                        }
                    }
                }
            }

            else if(command.equals("LB")){
                if(king_r-1 > 0 && king_r-1 < 9 && king_c-1 > 0 && king_c-1 < 9){
                    king_c--;
                    king_r--;
                    if(king_c == rock_c && king_r == rock_r){
                        if(rock_r-1 >0 && rock_r-1 <9 && rock_c-1 >0 && rock_c-1 <9){
                            rock_c--;
                            rock_r--;
                        }
                        else{
                            king_c++;
                            king_r++;
                        }
                    }
                }
            }
            
        }

        king_c+=64;
        rock_c+=64;

        System.out.print((char)king_c);
        System.out.println(king_r);

        System.out.print((char)rock_c);
        System.out.println(rock_r);


        
    }
}
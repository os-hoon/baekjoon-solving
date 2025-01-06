import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            Stack<Character> key = new Stack<>();
            Stack<Character> tmp = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            int L = str.length();
            for(int j = 0 ; j< L; j++){
                if(str.charAt(j) == '<'){
                    if(!key.isEmpty()){
                        tmp.push(key.pop());
                    }
                }

                else if(str.charAt(j) == '>'){
                    if(!tmp.isEmpty()){
                        key.push(tmp.pop());
                    }
                }

                else if(str.charAt(j) == '-'){
                    if(!key.isEmpty()){
                        key.pop();
                    }
                }

                else{
                    key.push(str.charAt(j));
                }
            }
            while(!key.isEmpty())
                tmp.push(key.pop());
            while(!tmp.isEmpty())
                sb.append(tmp.pop());
            System.out.println(sb);
        }
        

    }
}
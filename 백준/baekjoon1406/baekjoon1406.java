import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> key = new Stack<>();
        Stack<Character> tmp = new Stack<>();
        String str = br.readLine();
        for(int i = 0; i < str.length();i++){
            key.push(str.charAt(i));
        }
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("L")){
                if(!key.isEmpty()){
                    tmp.push(key.pop());
                 }
            }

            else if(command.equals("D")){
                if(!tmp.isEmpty()){
                      key.push(tmp.pop());
                 }
            }

            else if(command.equals("B")){
                if(!key.isEmpty()){
                    key.pop();
                }
            }

            else{
                key.push(st.nextToken().charAt(0));
            }
            
        }
        while(!key.isEmpty())
            tmp.push(key.pop());
        while(!tmp.isEmpty())
            sb.append(tmp.pop());
        System.out.println(sb);

    }
}
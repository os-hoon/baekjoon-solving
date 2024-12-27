import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Stack<Character> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        boolean state = true;

        for(int i = 0 ; i < T; i++){
            String VPS = bf.readLine();

            for(int j = 0; j < VPS.length(); j++){
                if(VPS.charAt(j) == '('){
                    stack.push('(');
                }

                else{
                    if(stack.empty()){
                        System.out.println("NO");
                        stack.clear();
                        state = false;
                        break;
                    }
                    stack.pop();
                }

            }
            if(stack.empty()){
                if(state == true)
                    System.out.println("YES");
                else
                    state = true;
            }
            else{
                System.out.println("NO");
                stack.clear();
            }

        }
    }
}
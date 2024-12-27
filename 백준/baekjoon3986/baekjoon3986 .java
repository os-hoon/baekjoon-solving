import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());
        Character top=' ';
        int cnt = 0;
        for(int i = 0 ; i < N; i++){
            String word = bf.readLine();
            top = word.charAt(0);
            stack.push(word.charAt(0));
            for(int j = 1 ; j <word.length();j++){
                if(top == word.charAt(j)){
                    stack.pop();
                    if(stack.empty())
                        top = ' ';
                    else
                        top=stack.peek();
                    continue;
                }
                stack.push(word.charAt(j));
                top = stack.peek();
            }
            if(stack.empty())
                cnt++;
            stack.clear();
        }

        System.out.print(cnt);

    }
}
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(bf.readLine());
        int sum = 0;

        for(int i = 0 ; i < K; i++){
            int N = Integer.parseInt(bf.readLine());
            if(N!=0){
                stack.push(N);
            }

            else
                stack.pop();

        }

        while(!stack.empty()){
            sum+=stack.pop();
        }

        System.out.print(sum);

    }
}
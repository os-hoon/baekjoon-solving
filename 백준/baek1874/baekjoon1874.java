import java.io.*;
import java.util.*;

public class baekjoon1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        List<Character> operator = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            operator.add('+');

            while (!stack.isEmpty() && stack.peek() == arr[cnt]) {
                stack.pop();
                operator.add('-');
                cnt++;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            for (Character op : operator) {
                System.out.println(op);
            }
        }
    }
}

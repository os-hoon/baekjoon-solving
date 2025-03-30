import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int [][] tree;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        tree = new int[N][2];

        for(int i = 0;i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0) - 65;
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if(left == '.')
                tree[parent][0] = -1;
            
            else
                tree[parent][0] = left - 65;

            if(right == '.')
                tree[parent][1] = -1;

            else
                tree[parent][1] = right - 65;
            
        }
        

        sb = new StringBuilder();
        preOrder(0);
        sb.append("\n");
        inOrder(0);
        sb.append("\n");
        postOrder(0);
        System.out.print(sb);
    }

    static void preOrder(int idx){
        if(idx == -1)
            return;
        sb.append((char)(idx + 65));
        preOrder(tree[idx][0]);
        preOrder(tree[idx][1]);
    }

    static void inOrder(int idx){
        if(idx == -1)
            return;      
        inOrder(tree[idx][0]);
        sb.append((char)(idx + 65));
        inOrder(tree[idx][1]);
    }

    static void postOrder(int idx){
        if(idx == -1)
            return;      
        postOrder(tree[idx][0]);
        postOrder(tree[idx][1]);
        sb.append((char)(idx + 65));
        
    }
}
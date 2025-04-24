import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int root;
    static int [][] tree = new int[1000001][2];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        root = Integer.parseInt(br.readLine());

        while(true){
            String command = br.readLine();
            if(command == null)
                break;
            insert(root, Integer.parseInt(command));
        }

        postOrder(root);
    }

    static void insert(int curr, int n){
        if(curr > n){
            if(tree[curr][0] == 0)
                tree[curr][0] = n;
            else
                insert(tree[curr][0], n);
        }

        else{
            if(tree[curr][1] == 0)
                tree[curr][1] = n;
            else
                insert(tree[curr][1], n);
        }
    }

    static void postOrder(int v){
        if(v == 0)
            return;
        postOrder(tree[v][0]);
        postOrder(tree[v][1]);
        System.out.println(v);
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] tree;
    static ArrayList<ArrayList<Integer>> level;
    static int K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        int N = (int)Math.pow(2,K)-1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        tree = new int[N];
        level = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i < K; i++)
            level.add(new ArrayList<Integer>());
        
        for(int i = 0; i < N; i++)
            tree[i] = Integer.parseInt(st.nextToken());

        find(0,N-1,0);

        for(int i = 0; i < K; i++){
            for(int size: level.get(i))
                System.out.print(size+" ");
            System.out.println();
        }
            
    }

    static void find(int start, int end, int depth){
        if(depth == K-1){
            level.get(depth).add(tree[start]);
            return;
        }

        int mid = (end + start) / 2;

        level.get(depth).add(tree[mid]);
        find(start, mid-1, depth+1);
        find(mid+1, end, depth+1);
              
    }
}
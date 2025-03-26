import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> tree;
    static int[]ans;
    static int N;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tree = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i <=N; i++)
            tree.add(new ArrayList<>());
        
        visit = new boolean[N+1];
        
        ans = new int[N+1];

        for(int i =0; i < N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        bfs(1);

        for(int i = 2; i <= N; i++){
            System.out.println(ans[i]);
        }

    }

    static void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visit[V] = true;

        while(!q.isEmpty()){
            int num = q.poll();
            ArrayList<Integer> idx = tree.get(num);
            for(int i =0; i <idx.size(); i++){               
                if(!visit[idx.get(i)]){
                    q.add(idx.get(i));
                    visit[idx.get(i)] = true;
                    ans[idx.get(i)] = num;
                }                               
            }
        }
    }
}
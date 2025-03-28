import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean[] visit;
    static int[] parent;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList<ArrayList<Integer>>();
        visit = new boolean[N];
        parent = new int[N];

        for(int i =0; i < N; i++)
            tree.add(new ArrayList<>());



        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0;i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            parent[i] = num;
            if(num != -1)
                tree.get(num).add(i);
        }

        int del = Integer.parseInt(br.readLine());
        if(parent[del] == -1){
            System.out.print(0);
        }

        else{
            find(N, del);

            int cnt = 0;
            for(int i =0; i < N;i++){
                if(tree.get(i).size() ==0 && !visit[i])
                    cnt++;
            }

            System.out.print(cnt);
        }


    }

    static void find(int N, int del){
        Queue<Integer> q = new LinkedList<>();

        q.add(del);
        visit[del] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for(int idx: tree.get(cur)){
                if(!visit[idx]){
                    q.add(idx);
                    visit[idx] = true;
                }
            }

            for(int i =0; i < tree.get(parent[cur]).size(); i++){
                if(tree.get(parent[cur]).get(i) == cur)
                    tree.get(parent[cur]).remove(i);
            }
        }
    }


}
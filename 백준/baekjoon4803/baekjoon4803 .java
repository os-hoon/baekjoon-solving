import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0)
                break;
            
            visited = new boolean[n+1];

            graph = new ArrayList<>();
            for(int i =0; i <= n; i++)
                graph.add(new ArrayList<>());

            
            
            for(int i =0; i < m; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            
            int cnt = 0;

            for(int i = 1; i <= n; i++){
                if(!visited[i]){
                    if(bfs(i))
                        cnt+=1;
                }
            }

            if(cnt == 0)
                System.out.println("Case "+ idx +": No trees.");
            
            else if(cnt == 1)
                System.out.println("Case "+ idx +": There is one tree.");
            else
                System.out.println("Case "+ idx +": A forest of "+ cnt +" trees.");

            idx++;
        }

    }

    static boolean bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited[V] = true;
        int node =0;
        int edge = 0;
        
        while(!q.isEmpty()){
            int v = q.poll();
            visited[v] = true;
            node+=1;
            for(int i : graph.get(v)){
                edge+=1;
                if(!visited[i]){
                    q.add(i);
                }
            }
        }

        return 2*(node-1) == edge ? true : false;
    }
}
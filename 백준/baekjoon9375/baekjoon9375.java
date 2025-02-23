import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0 ; i <n; i++){
            int t = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for(int j =0; j < t; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                if(map.containsKey(key)){
                    int cnt = map.get(key);
                    cnt++;
                    map.put(key, cnt);
                }
                else
                    map.put(key,1);
            }
            int sum = 1;
            for(String str : map.keySet())
                sum *= map.get(str)+1;
            System.out.println(sum-1);
        }
    }
}
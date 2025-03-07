import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> l = new ArrayList<>();

        for(int i = 123; i <= 987; i++){
            String check = Integer.toString(i);
            boolean state = true;
            if(!check.contains("0")){
                for(int j = 0; j < 2; j++){
                    for(int k = j+1; k < 3; k++){
                        if(check.charAt(j) == check.charAt(k) ){
                            state = false;
                            break;
                        }
                    }
                    if(!state)
                        break;
                }
                if(state)
                    l.add(check);
            }
        }

        for(int i = 0; i < N ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ans = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for(int j = 0; j < l.size(); j++){
                int s_cnt = 0;
                int b_cnt = 0;
                String str = l.get(j);
                for(int cnt = 0; cnt < 3; cnt++){
                    if(ans.contains(Character.toString(str.charAt(cnt)))){
                        if(ans.charAt(cnt) == str.charAt(cnt))
                            s_cnt++;
                        else
                            b_cnt++;
                    }
                }

                if(s_cnt != strike || b_cnt != ball){
                    l.remove(j);
                    j--;
                }

            }

        }
        System.out.print(l.size());
    }
}
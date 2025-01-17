import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double sum = 0;
        long ans = 0;
        int [] arr = new int[N];
        Set<String> set = new HashSet<>();
        int [] plus = new int[4001];
        int [] minus = new int[4001];
        for(int i = 0 ; i< N; i++){
            String str = br.readLine();
            int num = Integer.parseInt(str);
            set.add(str);
            arr[i] = num;
            sum += num;
            if(num < 0)
                minus[Math.abs(num)]++;
            else
                plus[num]++;            
        }
        sum /= N;
        ans = Math.round(sum);

        Arrays.sort(arr);

        int mid = arr[N/2];

        int range = arr[N-1] - arr[0];
        List<String> re = new ArrayList<>(set);
        int [][] cnt = new int[re.size()][2];
        
        for(int i = 0 ; i < re.size(); i++){
            int num = Integer.parseInt(re.get(i));
            cnt[i][0] = num;
            if(num < 0)
                cnt[i][1] =minus[Math.abs(num)];
            else
                cnt[i][1]=plus[num];
        }

        Arrays.sort(cnt,(a,b)->{
            if(a[1] == b[1])
                return a[0] - b[0];
            else
                return b[1] - a[1];
        });

        


        System.out.println(ans);
        System.out.println(mid);
        if(N == 1)
            System.out.println(cnt[0][0]);
        else{
            if(cnt[0][1] == cnt[1][1])
                System.out.println(cnt[1][0]);
            else
                System.out.println(cnt[0][0]);
        }        
        System.out.println(range);

        
    }
}
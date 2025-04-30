import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int [] dishes = new int[N];

        for(int i = 0; i < N; i++)
            dishes[i] = Integer.parseInt(br.readLine());
        
        int [] numbers = new int[d+1];

        int cnt = 0, Max = 0;

        for(int i = 0; i < k; i++){
            if(numbers[dishes[i]] == 0){
                cnt++;
            }
            numbers[dishes[i]]++;
        }

        
        for(int i =0; i <= N-1; i++){
            if(numbers[c] == 0)
                Max = Math.max(cnt+1, Max);
            
            else
                Max = Math.max(cnt, Max);

            if(i == N -1)
                break;
            
            numbers[dishes[i]]--;
            if(numbers[dishes[i]] == 0)
                cnt--;

            if(numbers[dishes[(i+k)%N]] == 0){
                cnt++;
            }
            numbers[dishes[(i+k)%N]]++;

        }
            System.out.print(Max);
    }
}
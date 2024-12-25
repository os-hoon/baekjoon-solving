import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class baek1620 {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        String input[] = new String[M];

        String[] poketmon = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            poketmon[i] = br.readLine();
            map.put(i, poketmon[i]);          
        }
        TreeMap<String, Integer> valueToKeyMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            valueToKeyMap.put(entry.getValue(), entry.getKey());
        }
            
        for(int i = 0; i <input.length; i++) 
        	input[i] = br.readLine();       	
        
        for(int i = 0; i <input.length; i++) {
        	if(Character.isDigit(input[i].charAt(0))) {
        		System.out.println(map.get(Integer.parseInt(input[i])));
        	}
        	
        	 else {
                 Integer key = valueToKeyMap.get(input[i]);
                 System.out.println(key);                     	
        	}
        }
    }
}
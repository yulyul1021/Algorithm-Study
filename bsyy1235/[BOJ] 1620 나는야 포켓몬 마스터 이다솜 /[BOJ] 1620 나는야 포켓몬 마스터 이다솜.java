import java.util.*;
import java.io.*;

public class Main {
   public static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
     }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    HashMap<String,Integer> map = new HashMap<>();
    String[] name = new String[n+1];
    
    for(int i = 1;i<n+1;i++) {
    	String pokemon = br.readLine();
    	map.put(pokemon, i);
    	name[i]=pokemon;
    }
    
    
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<m;i++) {
    	String s = br.readLine();
    	if(isNumberic(s)) {
    		int idx = Integer.parseInt(s);
    		sb.append(name[idx]).append("\n");
    	}
    	else {
    		sb.append(map.get(s)).append("\n");
    	}
    }
    
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    
    
  }
}

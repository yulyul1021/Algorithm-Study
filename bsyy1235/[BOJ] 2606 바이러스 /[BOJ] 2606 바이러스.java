import java.util.*;
import java.io.*;

public class Main {
	public static void DFS(int graph[][], boolean visit[],int cur) {
		visit[cur] = true;
		for(int i = 1;i<visit.length;i++) {
			if(graph[cur][i]==1 && !visit[i]) {
				DFS(graph,visit,i);
			}
		}
	}
	
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int[][] node = new int[n+1][n+1];

    for(int i=0;i<k;i++) {
    	st = new StringTokenizer(br.readLine()," ");
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	node[a][b] = 1;
    	node[b][a] = 1;
    }
    
    boolean visit[] = new boolean[n+1];
    int start = 1;
    DFS(node,visit,start);
    
    int count = 0;
    for(int i = 1;i<=n;i++) {
    	if(visit[i]==true)
    		count++;
    }
    
    
    StringBuilder sb = new StringBuilder();
    sb.append(count-1);
    
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    
  }
}

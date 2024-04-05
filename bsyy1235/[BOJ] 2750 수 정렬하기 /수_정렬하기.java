import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<>();
		
		int a = Integer.parseInt(br.readLine());
		for(int i =0 ;i<a;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i=0;i<a;i++)
			System.out.println(list.get(i));
			
		
	}
}

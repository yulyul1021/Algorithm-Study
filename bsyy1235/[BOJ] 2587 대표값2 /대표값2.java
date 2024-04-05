import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		int sum =0;
		
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		System.out.println(sum/list.size());
		System.out.println(list.get(list.size()/2));
		
		sc.close();
	}
}

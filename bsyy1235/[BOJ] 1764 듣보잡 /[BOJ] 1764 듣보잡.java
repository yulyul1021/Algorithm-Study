import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Set <String> set = new HashSet<>();
		while(n-- > 0)
			set.add(sc.next());
		
		Set <String> answer = new TreeSet<>();
		while(m-- > 0) {
			String name = sc.next();
			if(set.contains(name))
				answer.add(name);
		}
		
		System.out.println(answer.size());
		for(String s : answer)
			System.out.println(s);
	}
}

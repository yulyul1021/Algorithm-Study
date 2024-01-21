import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num<100){
			System.out.println(num);
		}
		else{
			int result = 99;

	  		for (int i = 111; i <= num; i++)
  				result += han(i);
			
			System.out.println(result);
		}
	}
	
	private static int han (int inum) {
		int hun = inum / 100;
		int ten = inum % 100 / 10;
		int one = inum % 10;
		
		if (ten*2 == hun + one) {
			return 1;
		}
        
		return 0;
	}
}

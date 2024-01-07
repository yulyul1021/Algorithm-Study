import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long result = sum(x);
        System.out.println(result);
        sc.close();
    }
    
    static long sum(long x) {
    	long sum = 0;
    	for(int i=0;i<x;i++) {
    		sum += x*i+i;
    	}
    	return sum;
    }
}

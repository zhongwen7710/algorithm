package algorithms.com.guan.mianshi;

import java.util.Scanner;

public class FibonacciDemo {
	private static int k = 0;
	private static Scanner cin;
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		long a = cin.nextLong();
		System.out.println(fibonacci(a));
		System.out.println("共递归调用了" + k + "次");
		
		
	}
	private static long fibonacci(long m) {
		if(m == 0 || m == 1){
			k++;
			return m;
		}
		return fibonacci(m - 1) + fibonacci(m - 2);
		
		
	}

}

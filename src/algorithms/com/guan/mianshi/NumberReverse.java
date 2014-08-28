package algorithms.com.guan.mianshi;

import java.util.Scanner;

public class NumberReverse {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = findOneNumber(num);
		System.out.println(num2);
	}

	public static int findOneNumber(int num) {
		int i;
		for (i = 0; num > 0; i++) {
			System.out.print(num % 10);
			num /= 10;
		}
		//System.out.println();
		//System.out.println("它是" + i + "位数");
		return i;
	}

}

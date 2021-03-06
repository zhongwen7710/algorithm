package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SodaBottles2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			if (n == 0)
				break;
			System.out.println(calc(n));
		}
		s.close();
	}

	public static int calc(int n) {
		int count = 0;
		while (n > 0) {
			if (n == 2) {
				count++;
				n = 0;
			} else if (n < 2) {
				n = 0;
			} else {
				count += n / 3;
				n = n / 3 + n % 3;
			}
		}
		return count;
	}

}
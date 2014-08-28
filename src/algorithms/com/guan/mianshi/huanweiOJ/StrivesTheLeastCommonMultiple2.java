package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StrivesTheLeastCommonMultiple2 {

	public static int min(int m, int n) {
		int x = m > n ? m : n;
		int y = m < n ? m : n;
		if (x % y == 0) {
			return x;
		} else {
			for (int z = 2 * x;; z++) {
				if (z % x == 0 && z % y == 0) {
					return z;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(min(m, n));

		sc.close();
	}
}
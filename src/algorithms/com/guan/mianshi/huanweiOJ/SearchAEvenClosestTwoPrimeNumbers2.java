package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SearchAEvenClosestTwoPrimeNumbers2 {

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void findPrimeNumber(int n) {
		if (n <= 2 || n % 2 != 0) {
			return;
		}
		for (int i = n / 2; i > 1; i--) {
			if (isPrime(i) && isPrime(n - i)) {
				System.out.println(i);
				System.out.println(n - i);
				return;
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findPrimeNumber(n);
		sc.close();
	}
}
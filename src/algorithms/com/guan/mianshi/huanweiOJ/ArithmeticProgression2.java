package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ArithmeticProgression2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		System.out.println(Sum_series(N));
	}

	public static int Sum_series(int n) {
		if (n < 1)
			return -1;
		int result = n * 2 + (n * (n - 1) / 2) * 3;
		return result;
	}
}

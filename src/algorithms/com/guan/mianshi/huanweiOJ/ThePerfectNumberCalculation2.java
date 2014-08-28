package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ThePerfectNumberCalculation2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.print(numCalculate(in));

	}

	private static int numCalculate(int in) {
		int temp = 0;
		if (in <= 0)
			return temp;
		for (int i = 1; i <= in; i++) {
			int s = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					s += j;
				}
			}
			if (s == i)
				temp++;
		}
		return temp;
	}
}
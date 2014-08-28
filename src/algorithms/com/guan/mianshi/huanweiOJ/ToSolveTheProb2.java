package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ToSolveTheProb2 {

	// 求立方根，牛顿迭代法
	/*
	 * xk+1 = 2*xk/3 + a/(3*xk*xk);
	 */
	public static double getCubeRoot(double value) {
		double precision = 0.000001;
		double now = value;
		double tmp = 0;
		do {
			tmp = now;
			now = 2 * now / 3 + value / (3 * now * now);
		} while (Math.abs(now - tmp) > precision);
		return Math.round(now);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double d = scanner.nextDouble();
		System.out.println(getCubeRoot(d));

	}
}
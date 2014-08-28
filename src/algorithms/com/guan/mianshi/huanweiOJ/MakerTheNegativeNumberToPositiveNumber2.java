package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class MakerTheNegativeNumberToPositiveNumber2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0, countNe = 0, countPo = 0;
		while (s.hasNext()) {
			int n = s.nextInt();
			if (n < 0)
				countNe++;
			if (n > 0) {
				countPo++;
				sum += n;
			}
		}
		System.out.println(countNe);
		double result = 0.0;
		if (countPo != 0) {
			result = (double) sum / countPo;
			if ((int) result - result == 0)
				System.out.println((int) result);
			else
				System.out.println(result);
		} else
			System.out.println(result);
	}
}
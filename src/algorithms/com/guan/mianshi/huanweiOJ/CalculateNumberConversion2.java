package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CalculateNumberConversion2 {

	public static int getDay(int y, int m, int d) {
		int sum = 0;
		for (int i = 1; i < m; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sum += 31;
				break;
			case 2:
				if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
					sum += 29;
				} else {
					sum += 28;
				}
				;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				sum += 30;
				break;

			}
		}

		return sum + d;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(getDay(y, m, d));
		sc.close();
	}
}
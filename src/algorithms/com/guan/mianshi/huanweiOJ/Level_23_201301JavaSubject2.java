package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class Level_23_201301JavaSubject2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		scanner.close();
		System.out.println(getMethod(row, col));
	}

	public static int getMethod(int row, int col) {
		if (row >= 2 && col >= 2) {
			return getMethod(row, col - 1) + getMethod(row - 1, col);
		} else if (row == 1 && col > 1) {
			return getMethod(row, col - 1) + 1;
		} else if (row > 1 && col == 1) {
			return 1 + getMethod(row - 1, col);
		} else if (row == 1 && col == 1) {
			return 2;
		} else {
			System.out.println("ERROR");
			return 0;
		}
	}

}
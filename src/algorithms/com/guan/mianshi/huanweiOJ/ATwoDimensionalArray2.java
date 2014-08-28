package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ATwoDimensionalArray2 {

	public static void main(String[] args) {
		int ROW_LENGTH, COLUMN_LENGTH;
		int x1, y1, x2, y2, x3, y3;
		int row, column;
		Scanner scanner = new Scanner(System.in);
		ROW_LENGTH = scanner.nextInt();
		COLUMN_LENGTH = scanner.nextInt();
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		row = scanner.nextInt();
		column = scanner.nextInt();
		x3 = scanner.nextInt();
		y3 = scanner.nextInt();
		if (ROW_LENGTH > 9 || COLUMN_LENGTH > 9) {
			System.out.println(-1);
			return;
		} else {
			System.out.println(0);
		}
		if (x1 >= ROW_LENGTH || x1 < 0 || x2 >= ROW_LENGTH || x2 < 0 || y1 < 0
				|| y1 >= COLUMN_LENGTH || y2 < 0 || y2 >= ROW_LENGTH) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
		if (row <= ROW_LENGTH && row >= 0) {
			System.out.println(0);
			ROW_LENGTH++;
		} else
			System.out.println(-1);
		if (column >= 0 && column <= COLUMN_LENGTH) {
			System.out.println(0);
			COLUMN_LENGTH++;
		} else
			System.out.println(-1);
		if (x3 >= ROW_LENGTH || x3 < 0 || y3 < 0 || y3 >= ROW_LENGTH) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
	}
}
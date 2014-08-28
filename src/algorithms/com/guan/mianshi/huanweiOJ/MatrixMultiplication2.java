package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class MatrixMultiplication2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1 = scan.nextInt();
		int row2 = scan.nextInt();
		int col2 = scan.nextInt();
		int[][] ary1 = new int[row1][row2];
		int[][] ary2 = new int[row2][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < row2; j++) {
				ary1[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				ary2[i][j] = scan.nextInt();
			}
		}
		int[][] result = getResult(row1, row2, col2, ary1, ary2);
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2 - 1; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(result[i][col2 - 1]);
		}
	}

	private static int[][] getResult(int row1, int row2, int col2,
			int[][] ary1, int[][] ary2) {
		int[][] result = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				int sum = 0;
				for (int k = 0; k < row2; k++) {
					sum = sum + ary1[i][k] * ary2[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}
}

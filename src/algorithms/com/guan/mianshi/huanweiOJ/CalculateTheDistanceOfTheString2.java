package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CalculateTheDistanceOfTheString2 {

	private static Scanner s;

	public static int calStringDistance(String charA, String charB) {
		char[] A = charA.toCharArray();
		char[] B = charB.toCharArray();
		int[][] result = new int[A.length + 1][B.length + 1];
		for (int i = 0; i <= A.length; i++)
			result[i][0] = i;
		for (int i = 1; i <= B.length; i++)
			result[0][i] = i;
		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				int x = result[i][j - 1] + 1;
				int y = result[i - 1][j] + 1;
				int z = result[i - 1][j - 1] + (A[i - 1] == B[j - 1] ? 0 : 1);
				if (x < y) {
					if (x < z)
						result[i][j] = x;
					else
						result[i][j] = z;
				} else {
					if (y < z)
						result[i][j] = y;
					else
						result[i][j] = z;
				}
			}
		}
		return result[A.length][B.length];
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String sa = s.nextLine();
		String sb = s.nextLine();
		System.out.print(calStringDistance(sa, sb));
	}
}
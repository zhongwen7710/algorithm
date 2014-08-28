package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ComputingSimilarityOfTheString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(calculateStringDistance(scan.nextLine(),
				scan.nextLine()));

		scan.close();
	}

	public static String calculateStringDistance(String expressionA,
			String expressionB) {
		int n = calculateStringDistance(expressionA, 0,
				expressionA.length() - 1, expressionB, 0,
				expressionB.length() - 1);
		if (n > expressionA.length() + expressionB.length()) {
			return null;
		} else {
			return "1/" + (n + 1);
		}
	}

	public static int calculateStringDistance(String A, int indexA, int endA,
			String B, int indexB, int endB) {
		if (indexA > endA) {
			if (indexB > endB) {
				return 0;
			} else {
				return endB - indexB + 1;
			}
		}
		if (indexB > endB) {
			if (indexA > endA) {
				return 0;
			} else {
				return endA - indexA + 1;
			}
		}
		if (A.charAt(indexA) == B.charAt(indexB)) {
			return calculateStringDistance(A, indexA + 1, endA, B, indexB + 1,
					endB);
		} else {
			int t1 = calculateStringDistance(A, indexA + 1, endA, B,
					indexB + 1, endB);
			int t2 = calculateStringDistance(A, indexA, endA, B, indexB + 1,
					endB);
			int t3 = calculateStringDistance(A, indexA + 1, endA, B, indexB,
					endB);
			return minValue(t1, t2, t3) + 1;
		}
	}

	public static int minValue(int t1, int t2, int t3) {
		int min = t1;
		min = min > t2 ? t2 : min;
		min = min > t3 ? t3 : min;
		return min;
	}

}
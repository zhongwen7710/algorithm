package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SerpentineMatrix2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 1, next, lineNum = N;
		for (int i = 1; i <= N; i++) {
			start = start + i - 1;
			next = start;
			System.out.print(start);
			if (lineNum != 1) {
				System.out.print(" ");
			}
			for (int j = 2; j <= lineNum; j++) {
				next = next + j + i - 1;
				System.out.print(next + (j == lineNum ? "\n" : " "));
			}
			lineNum--;
		}
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class AcquireRound3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		float num = input.nextFloat();
		float a = num - (int) num;
		int n;
		if (a >= 0.5)
			n = (int) num + 1;
		else if (a > 0 && a < 0.5)
			n = (int) num;
		else if (a <= -0.5)
			n = (int) num - 1;
		else
			n = (int) num;
		System.out.print(n);
	}
}
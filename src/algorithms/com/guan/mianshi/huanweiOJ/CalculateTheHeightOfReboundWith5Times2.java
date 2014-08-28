package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CalculateTheHeightOfReboundWith5Times2 {
	public static void main(String[] args) {
		// 小球落地路程
		Scanner input = new Scanner(System.in);
		double Num = (double) (input.nextInt());
		double s;
		double h;
		h = Num * Math.pow(0.5, 5);
		s = 2 * Num * (1 - Math.pow(0.5, 4)) + Num;
		System.out.println(s);
		System.out.println(h);
	}
}

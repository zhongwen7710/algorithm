package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class YangHuiTriangleDeformation2 {
	public static int evenIndex(int x) {
		if (x <= 2) {
			return -1;
		} else if (x % 2 == 1) {
			return 2;
		}
		return x / 2 % 2 + 3;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		input.close();
		System.out.println(evenIndex(i));
	}
}
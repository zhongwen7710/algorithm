package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheMoneyToBuyBestChicken {
	private static Scanner input;
	private static int num;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		num = input.nextInt();
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 33; j++)
				if ((100 - 5 * i - 3 * j) * 3 + i + j == 100) {
					int[] ok = { i, j, (100 - 5 * i - 3 * j) * 3 };
					System.out.println(i + " " + j + " "
							+ (100 - 5 * i - 3 * j) * 3);
				}
	}
}
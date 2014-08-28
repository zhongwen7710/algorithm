package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class FromANumberToPickSeven2 {
	public static void main(String[] args) {
		// 有关7的数字的个数
		Scanner input = new Scanner(System.in);
		int Num = input.nextInt();
		int counter = 0;
		for (int i = 1; i <= Num; i++)
			if (i % 7 == 0 || Integer.toString(i).contains("7"))
				counter++;
		System.out.println(counter);
	}
}
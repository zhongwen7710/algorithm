package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class AutomorphicNumber2 {
	public static void main(String[] args) {
		// 自守数的个数
		Scanner input = new Scanner(System.in);
		int Num = input.nextInt();
		int counter = 0;
		for (int i = 0; i <= Num; i++) {
			if (Integer.toString(i * i).endsWith(Integer.toString(i)))
				counter++;
		}
		System.out.println(counter);
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TheNumberOf1InMemoryStore2 {

	public static void main(String[] args) {
		int i;
		int result = 0;

		Scanner Temp = new Scanner(System.in);
		int num = Temp.nextInt();
		String str = Integer.toBinaryString(num);
		int strLength = str.length();
		char[] ch = str.toCharArray();

		for (i = 0; i < strLength; i++) {
			if (ch[i] == '1') {
				result += 1;
			}
		}
		System.out.println(result);
	}
}
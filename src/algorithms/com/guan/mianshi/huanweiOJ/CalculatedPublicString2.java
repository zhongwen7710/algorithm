package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CalculatedPublicString2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str1 = cin.next();
		String str2 = cin.next();
		CalculatedPublicString2 m = new CalculatedPublicString2();
		System.out.println(m.findMaxChar(str1, str2));
	}

	private int findMaxChar(String str1, String str2) {
		int max = 0;
		if (str1 == null || str2 == null || str1.length() == 0
				|| str2.length() == 0)
			return 0;
		for (int i = 0; i < str1.length(); ++i) {
			for (int j = 0; j < str2.length(); ++j) {
				int temp = findChar(str1.substring(i), str2.substring(j));
				max = max >= temp ? max : temp;
			}
		}
		return max;
	}

	private int findChar(String str1, String str2) {
		int i = 0;
		for (i = 0; i < str1.length() && i < str2.length(); ++i)
			if (str1.charAt(i) != str2.charAt(i)
					&& str1.charAt(i) != str2.charAt(i) + 32
					&& str1.charAt(i) != str2.charAt(i) - 32)
				break;
		return i;
	}
}
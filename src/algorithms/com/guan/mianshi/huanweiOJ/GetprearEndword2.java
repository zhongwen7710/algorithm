package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class GetprearEndword2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = convert(s);
		int maxnum = check(s);
		System.out.println(maxnum);
	}

	private static int check(String str) {
		int i, j, k, size = str.length();
		int maxLen = 0, len;
		for (i = 0; i < size; i++) {
			for (j = i; j < size; j++) {
				String s = "";
				for (k = i; k <= j; k++) {
					s += str.charAt(k);
				}
				int len1 = s.length();
				if (isKey(s)) {
					len = s.length();
					if (maxLen < len) {
						maxLen = len;
					}
				}
			}
		}
		return maxLen;
	}

	private static boolean isKey(String s) {
		int i = 0, j = s.length() - 1;
		while (s.charAt(i) == s.charAt(j) && i <= j) {
			i++;
			j--;
			if (i < 0 || i > s.length() - 1 || j < 0 && j > s.length() - 1) {
				break;
			}
		}

		if (i < j) {
			return false;
		}
		return true;
	}

	private static char[] convert(String s) {
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}

}
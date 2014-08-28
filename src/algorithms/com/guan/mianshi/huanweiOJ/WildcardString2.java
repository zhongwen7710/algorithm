package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class WildcardString2 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int len = s1.length() >= s2.length() ? s2.length() : s1.length();
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) == '*' || s2.charAt(i) == '*') {
				break;
			}
			if (s1.charAt(i) == '?' || s2.charAt(i) == '?') {
				continue;
			}
			if (s1.charAt(i) != s2.charAt(i)) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
}
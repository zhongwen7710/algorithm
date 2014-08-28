package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TheWordInverted2 {

	public static void convert(String str) {
		String s = "";
		char[] cs = str.toCharArray();
		int len = cs.length;

		for (int i = 0; i < len; i++) {
			if ((cs[i] <= 'z' && cs[i] >= 'a')
					|| (cs[i] <= 'Z' && cs[i] >= 'A')) {
				s += cs[i];
			} else if ((cs[i - 1] <= 'z' && cs[i - 1] >= 'a')
					|| (cs[i - 1] <= 'Z' && cs[i - 1] >= 'A')) {
				s += " ";
			} else {
				continue;
			}
		}
		String[] ss = s.split(" ");
		for (int j = ss.length - 1; j >= 0; j--) {
			if (j != 0) {
				System.out.print(ss[j] + " ");
			} else {
				System.out.println(ss[j]);
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		convert(str);

		sc.close();

	}
}
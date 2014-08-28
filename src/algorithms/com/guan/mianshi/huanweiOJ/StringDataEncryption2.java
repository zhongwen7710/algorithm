package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringDataEncryption2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toUpperCase();
		String str = sc.nextLine();
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (temp.indexOf(s.charAt(i)) == -1) {
				temp = temp + s.charAt(i);
			}
		}
		StringBuffer sb = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int j = 0; j < temp.length(); j++) {
			for (int i = 0; i < sb.length(); i++) {
				if (temp.charAt(j) == sb.charAt(i)) {
					sb.deleteCharAt(i);
				}
			}
		}
		String sum = temp + sb.toString();
		String str1 = str.toUpperCase();
		StringBuffer res = new StringBuffer(str1);

		for (int i = 0; i < str1.length(); i++) {
			if (str.charAt(i) == 32) {
				res.setCharAt(i, (char) (32));
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				res.setCharAt(i, (char) (sum.charAt(str1.charAt(i) - 65) + 32));
			} else {
				res.setCharAt(i, sum.charAt(str1.charAt(i) - 65));
			}

		}

		System.out.println(res.toString());
	}

}
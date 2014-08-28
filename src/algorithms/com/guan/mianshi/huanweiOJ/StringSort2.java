package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringSort2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		sc.close();
		System.out.println(sortString(inputStr));
	}

	public static String sortString(String str) {
		StringBuilder sb = new StringBuilder();
		// sb.setLength(1);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ci = str.charAt(i);
			if (isLetter(ci))
				sb.append(ci);
		}
		sb = sortStr(sb);
		StringBuilder msb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < len; i++) {
			char ci = str.charAt(i);
			if (isLetter(ci)) {
				msb.append(sb.charAt(j));
				j++;
			} else
				msb.append(ci);
		}
		return msb.toString();
	}

	public static StringBuilder sortStr(StringBuilder mo) {
		int len = mo.length();
		StringBuilder sb1 = new StringBuilder();
		for (int j = 0; j < len; j++) {
			char nc = mo.charAt(j);
			int i = 0;
			while (sb1.length() != i) {
				if (Character.toUpperCase(nc) >= Character.toUpperCase(sb1
						.charAt(i)))
					i++;
				else
					break;
			}
			sb1.insert(i, nc);
		}
		return sb1;
	}

	public static boolean isLetter(char mc) {
		if ((mc >= 'A' && mc <= 'Z') || (mc >= 'a' && mc <= 'z'))
			return true;
		return false;
	}

}
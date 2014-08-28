package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringMatching2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shortStr = sc.nextLine();
		String longStr = sc.nextLine();
		sc.close();
		System.out.println(checkStr(shortStr, longStr));
	}

	public static String checkStr(String shortS, String longS) {
		boolean allexist = false;
		int len_s = shortS.length();
		for (int i = 0; i < len_s; i++) {
			if (longS.indexOf(shortS.charAt(i)) == -1) {
				allexist = false;
				break;
			} else
				allexist = true;
		}
		if (allexist == true)
			return "true";
		else
			return "false";
	}
}
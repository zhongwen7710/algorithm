package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class MovePoint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) == ';') {
				list.add(str.substring(j, i));
				j = i + 1;
			}
		}

		int strX = 0;
		int strY = 0;
		for (String s : list) {
			boolean judge1 = false;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
					judge1 = true;
				} else {
					judge1 = false;
					break;
				}
			}
			boolean judge = s.length() <= 3 && s.length() >= 2 && judge1;
			if (judge && s.charAt(0) == 'A') {
				strX = strX - Integer.parseInt(s.substring(1, s.length()));
			} else if (judge && s.charAt(0) == 'D') {
				strX = strX + Integer.parseInt(s.substring(1, s.length()));
			} else if (judge && s.charAt(0) == 'W') {
				strY = strY + Integer.parseInt(s.substring(1, s.length()));
			} else if (judge && s.charAt(0) == 'S') {
				strY = strY - Integer.parseInt(s.substring(1, s.length()));
			} else {
			}
		}
		System.out.println(strX + "," + strY);
	}
}
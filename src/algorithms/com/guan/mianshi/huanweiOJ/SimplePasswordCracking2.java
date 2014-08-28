package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SimplePasswordCracking2 {

	public static String convert(String str) {
		char ch = ' ';
		String s = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
				if (str.charAt(i) == 'Z') {
					s += 'a';

				} else {
					ch = (char) (str.charAt(i) + 33);
					s += ch;
				}
			} else {
				switch (str.charAt(i)) {
				case 'a':
				case 'b':
				case 'c':
					s += '2';
					break;
				case 'd':
				case 'e':
				case 'f':
					s += '3';
					break;
				case 'g':
				case 'h':
				case 'i':
					s += '4';
					break;
				case 'j':
				case 'k':
				case 'l':
					s += '5';
					break;
				case 'm':
				case 'n':
				case 'o':
					s += '6';
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					s += '7';
					break;
				case 't':
				case 'u':
				case 'v':
					s += '8';
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					s += '9';
					break;
				default:
					s += str.charAt(i);
					break;
				}
			}
		}
		return s;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = convert(str);
		System.out.println(s);

		sc.close();

	}
}
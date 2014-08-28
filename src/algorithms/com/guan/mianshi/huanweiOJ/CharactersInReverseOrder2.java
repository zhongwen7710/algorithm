package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CharactersInReverseOrder2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder(str);
		int i = 0;
		char s;
		while (i < sb.length() - 1) {
			s = sb.charAt(sb.length() - 1);
			sb.insert(i, s);
			sb.deleteCharAt(sb.length() - 1);
			i++;
		}
		System.out.println(sb.toString());
		scan.close();
	}
}
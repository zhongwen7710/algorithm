package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SentencesInReverseOrder2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		String s = sca.nextLine();
		String str[] = s.split(" ");

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length; i++) {
			sb.append(new StringBuffer(str[i]).reverse());
			if (i != str.length - 1)
				sb.append(" ");

		}
		sb.reverse();
		System.out.print(sb);
	}

}
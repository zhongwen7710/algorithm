package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class AcquireRound2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		System.out.println(value(s));

	}

	public static int value(String s) {
		String value[] = s.split("\\.");
		int result = 0;
		if (value[1].charAt(0) >= '0' && value[1].charAt(0) < '5')
			result = Integer.valueOf(value[0]);
		else if (Integer.valueOf(value[0]) > 0)
			result = Integer.valueOf(value[0]) + 1;
		else if (Integer.valueOf(value[0]) == 0 && value[0].length() > 1)
			result = Integer.valueOf(value[0]) - 1;
		else if (Integer.valueOf(value[0]) == 0 && value[0].length() == 1)
			result = Integer.valueOf(value[0]) + 1;
		else if (Integer.valueOf(value[0]) < 0)
			result = Integer.valueOf(value[0]) - 1;
		return result;

	}

}
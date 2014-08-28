package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public final class LearnEnglish2 {
	private LearnEnglish2() {
	}

	private static String[] str0to19 = { "zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };

	private static String[] str20to90 = { "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		System.out.println(parse(num));
		scanner.close();
	}

	public static String parse(long num) {
		if (num >= 10000000000L || num < 0L) {
			return "error";
		}
		StringBuffer sb = new StringBuffer();
		if (num >= 1000000000L) {
			sb.append(subParse1(num / 1000000000L));
			sb.append(" billion");
			num = num % 1000000000L;
		}
		if (num >= 1000000L) {
			if (!sb.toString().equals("")) {
				sb.append(" ");
			}
			sb.append(subParse1(num / 1000000L));
			sb.append(" million");
			num = num % 1000000L;
		}
		if (num >= 1000L) {
			if (!sb.toString().equals("")) {
				sb.append(" ");
			}
			sb.append(subParse1(num / 1000L));
			sb.append(" thousand");
			num = num % 1000L;
		}
		if (num > 0) {
			if (!sb.toString().equals("")) {
				sb.append(" ");
			}
			sb.append(subParse1(num));
		} else {
			if (sb.toString().equals("")) {
				sb.append("zero");
			}
		}
		return sb.toString().trim();
	}

	/**
	 * 个数最多只有三位的读法
	 * 
	 * @param num
	 * @return
	 */
	public static String subParse1(long num) {
		Integer i = (int) num;

		StringBuffer result = new StringBuffer();
		if (i >= 100) {
			result.append(str0to19[i / 100]);
			result.append(" hundred");
			i = i % 100;
		}

		if (i >= 20) {
			if (!result.toString().equals("")) {
				result.append(" and ");
			}
			result.append(str20to90[i / 10 - 2]);
			if (i % 10 != 0) {
				result.append(" " + str0to19[i % 10]);
			}
		} else if (i > 0) {
			if (!result.toString().equals("")) {
				result.append(" and ");
			}
			result.append(str0to19[i]);
		}
		return result.toString().trim();
	}
}

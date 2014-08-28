package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class ExtractNotRepeatedInteger2 {
	private ExtractNotRepeatedInteger2() {
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		char[] chars = N.toCharArray();
		int len = chars.length;
		StringBuilder sBuilder = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put(chars[len - 1], 1);
		sBuilder.append(chars[len - 1]);
		for (int i = N.length() - 2; i >= 0; i--) {
			if (!map.containsKey(chars[i])) {
				map.put(chars[i], 1);
				sBuilder.append(chars[i]);
			}
		}

		System.out.println(getResultStr(sBuilder.toString()));
		scanner.close();
	}

	private static String getResultStr(String input) {
		int firstNoZero = 0;
		for (int j = 0; j < input.length(); j++) {
			if ('0' != input.charAt(j)) {
				firstNoZero = j;
				break;
			}
		}

		return input.substring(firstNoZero);
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class FindFirstAppearedOnlyOnceCharactersFromAString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(FindChar(inputStr));
	}

	private static char FindChar(String inputStr) {
		char output = '.';

		int[] a = new int[26];
		for (int i = 0; i < 26; i++) {
			a[i] = 0;
		}
		int[] index = new int[26];
		for (int i = 0; i < 26; i++) {
			index[i] = -1;
		}
		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			int j = ch - 'a';
			a[j]++;
			index[j] = i;
		}
		int k = inputStr.length();
		for (int i = 0; i < 26; i++) {
			if (a[i] == 1 && index[i] < k) {
				k = index[i];
			}
		}
		if (k != inputStr.length()) {
			output = inputStr.charAt(k);
		}

		return output;
	}

}
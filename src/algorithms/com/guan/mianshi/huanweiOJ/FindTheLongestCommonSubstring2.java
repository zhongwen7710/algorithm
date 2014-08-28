package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class FindTheLongestCommonSubstring2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aStr = sc.nextLine();
		String bStr = sc.nextLine();
		sc.close();
		System.out.println(getLCommonSubstr(aStr, bStr));
	}

	public static String getLCommonSubstr(String a, String b) {
		int a_len = a.length();
		String abCommon = "";
		int max_len = 0;
		for (int i = 0; i < a_len; i++) {
			for (int j = i + 1; j <= a_len; j++) {
				if (b.contains(a.substring(i, j))) {
					int i_j = j - i;
					if (i_j > max_len) {
						max_len = i_j;
						abCommon = a.substring(i, j);
					}
				}
			}
		}
		return abCommon;
	}

}
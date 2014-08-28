package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * 问题描述：
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，
 * 比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。
 * 比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。
 * 因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），
 * Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 * @author guanxiangqqing
 *
 */
public class GetprearEndword {

	public static boolean isTrue(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static int getMax(String str) {
		int count = 0;
		int max = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				if (isTrue(str.substring(i, j))) {
					count = j - i;
					if (max < count) {
						max = count;
					}
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(getMax(str));
		sc.close();
	}
}
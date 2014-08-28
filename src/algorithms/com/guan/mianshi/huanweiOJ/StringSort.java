package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;

/**
 * 问题描述：
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
	规则1：英文字母从A到Z排列，不区分大小写。
	      如，输入：Type 输出：epTy
	规则2：同一个英文字母的大小写同时存在时，按照输入顺序排列。
	    如，输入：BabA 输出：aABb
	规则3：非英文字母的其它字符保持原来的位置。
	    如，输入：By?e 输出：Be?y
	样例：
	    输入：
	   A Famous Saying: Much Ado About Nothing(2012/8).
	    输出：
	   A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 * @author guanxiangqing
 *
 */
public class StringSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		sortString(str);
	}

	private static void sortString(String str) {
		List<Character> list = new ArrayList<Character>();
		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) <= 90 && str.charAt(i) >= 65)
					|| (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				list.add(str.charAt(i));
			} else {
				ch[i] = str.charAt(i);
			}
		}
		char[] temp = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			temp[i] = list.get(i);
		}
		sortChar(temp);
		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 0) {
				ch[i] = temp[j];
				j++;
			}
		}
		for (char tempchar : ch) {
			System.out.print(tempchar);
		}
	}

	private static void sortChar(char[] ch) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = ch.length - 1; j > i; j--) {
				if (ch[j] >= 65 && ch[j] <= 90) {
					if (ch[j - 1] >= 65 && ch[j - 1] <= 90) {
						if (ch[j] < ch[j - 1]) {
							temp = ch[j];
							ch[j] = ch[j - 1];
							ch[j - 1] = temp;
						}
					} else {
						if (ch[j] + 32 < ch[j - 1]) {
							temp = ch[j];
							ch[j] = ch[j - 1];
							ch[j - 1] = temp;
						}
					}
				} else {
					if (ch[j - 1] <= 122 && ch[j - 1] >= 90) {
						if (ch[j] < ch[j - 1]) {
							temp = ch[j];
							ch[j] = ch[j - 1];
							ch[j - 1] = temp;
						}
					} else {
						if (ch[j - 1] + 32 > ch[j]) {
							temp = ch[j];
							ch[j] = ch[j - 1];
							ch[j - 1] = temp;
						}
					}
				}
			}
		}
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;

/**
 * ����������
 * ��дһ�����򣬽������ַ����е��ַ������¹�������
	����1��Ӣ����ĸ��A��Z���У������ִ�Сд��
	      �磬���룺Type �����epTy
	����2��ͬһ��Ӣ����ĸ�Ĵ�Сдͬʱ����ʱ����������˳�����С�
	    �磬���룺BabA �����aABb
	����3����Ӣ����ĸ�������ַ�����ԭ����λ�á�
	    �磬���룺By?e �����Be?y
	������
	    ���룺
	   A Famous Saying: Much Ado About Nothing(2012/8).
	    �����
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
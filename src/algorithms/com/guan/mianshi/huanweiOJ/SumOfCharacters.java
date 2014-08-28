package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.Vector;
/**
 * 问题描述：
	如果统计的个数相同，则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
	实现以下接口：
	    输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
	    按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
	    清空目前的统计结果，重新统计
	调用者会保证：
	输入的字符串以‘\0’结尾。
	知识点：字符串,排序
	输  入：输入一串字符。
	输  出：对字符中的各个英文字符（大小写分开统计），数字，空格进行统计，并按照统计个数由多到少输出,如果统计的个数相同，则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 * @author guanxiangqing
 *
 */
public class SumOfCharacters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] chs = str.toCharArray();

		// 先排序
		for (int i = chs.length - 1; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (chs[j] > chs[j + 1]) {
					char temp = chs[j];
					chs[j] = chs[j + 1];
					chs[j + 1] = temp;
				}
			}

		Vector<Character> vector = new Vector<Character>();
		Vector<Integer> vector2 = new Vector<Integer>();
		char last = '?';
		for (int i = 0; i < chs.length; i++) {
			char cur = chs[i];
			if ((cur >= '0' && cur <= '9') || (cur >= 'a' && cur <= 'z')
					|| (cur >= 'A' && cur <= 'Z') || cur == ' ') {
				if (cur == last)
					vector2.set(vector2.size() - 1, vector2.lastElement() + 1);
				else {
					vector2.addElement(1);
					vector.add(cur);
				}
			}
			last = cur;
		}

		// 排序
		for (int i = vector2.size() - 1; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (vector2.get(j) < vector2.get(j + 1)) {
					int temp = vector2.get(j);
					vector2.set(j, vector2.get(j + 1));
					vector2.set(j + 1, temp);

					char temp2 = vector.get(j);
					vector.set(j, vector.get(j + 1));
					vector.set(j + 1, temp2);
				}
			}

		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i));
		}

	}

}
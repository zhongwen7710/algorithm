package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	计算字符串最后一个单词的长度，单词以空格隔开。
	知识点：字符串,循环
	输  入：一行字符串，长度小于128。
	输  出：整数N，最后一个单词的长度。
 * @author guanxiangqing
 *
 */
public class TheLengthOfTheLastWordFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] c = str.toCharArray();
		int m = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] != ' ')
				m++;
			else
				break;
		}
		System.out.print(m);
	}

}
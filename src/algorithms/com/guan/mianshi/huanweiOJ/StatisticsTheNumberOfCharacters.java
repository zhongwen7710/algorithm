package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
	知识点：字符串,函数,指针
	输  入：输入N个字符，字符在ACSII码范围内(0~127)。
	输  出：输出字符的个数。
 * @author guanxiangqing
 *
 */
public class StatisticsTheNumberOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr = sc.nextLine();
		sc.close();
		int num[] = new int[128];
		int len = mStr.length();
		for (int i = 0; i < len; i++) {
			char ci = mStr.charAt(i);
			if (ci > 0 && ci < 127)
				num[ci]++;
		}
		int n = 0;
		for (int i = 0; i < 127; i++) {
			if (num[i] != 0)
				n++;
		}
		System.out.println(n);
	}

}
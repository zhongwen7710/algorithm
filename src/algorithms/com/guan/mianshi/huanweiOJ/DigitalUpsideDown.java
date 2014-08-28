package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	输入一个整数，将这个整数以字符串的形式逆序输出
	程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
	知识点：字符串
	输  入：输入一个int整数
	输  出：将这个整数以字符串的形式逆序输出
 * @author guanxiangqing
 *
 */
public class DigitalUpsideDown {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String s = String.valueOf(k);
		StringBuffer l = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			l.append(s.charAt(i));
		}
		String m = l.toString();
		System.out.println(m);
	}
}
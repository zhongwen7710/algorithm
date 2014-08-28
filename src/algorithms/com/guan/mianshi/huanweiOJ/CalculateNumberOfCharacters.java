package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
	知识点： 字符串,函数,指针
	输  入： 输入一个有字母和数字以及空格组成的字符串，和一个字符。
	输  出： 输出输入字符串中含有该字符的个数。
 * @author guanxiangqing
 *
 */
public class CalculateNumberOfCharacters {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String s = sc.next().toLowerCase();
		char c = s.toCharArray()[0];
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				num++;
			}
		}
		System.out.print(num);
		sc.close();
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。
	知识点：字符串,循环,函数,指针
	输  入：输入一个十六进制的数值字符串。
	输  出：输出该数值的十进制字符串。

 * @author guanxiangqing
 *
 */
public class ConversionOfNumberSystems {

	public static long convert(String str) {
		int len = str.length();
		if (len < 3) {
			return 0;
		}
		String s = str.substring(2);
		int n = 0;
		long l = 0;
		for (int i = 0; i < len - 2; i++) {
			switch (s.charAt(i)) {
			case 'a':
			case 'A':
				n = 10;
				break;
			case 'b':
			case 'B':
				n = 11;
				break;
			case 'c':
			case 'C':
				n = 12;
				break;
			case 'd':
			case 'D':
				n = 13;
				break;

			case 'E':
			case 'e':
				n = 14;
				break;
			case 'F':
			case 'f':
				n = 15;
				break;
			default:
				n = Integer.parseInt(String.valueOf(s.charAt(i)));
				break;
			}
			l += n * Math.pow(16, len - 3 - i);

		}

		return l;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(convert(str));

		sc.close();
	}
}
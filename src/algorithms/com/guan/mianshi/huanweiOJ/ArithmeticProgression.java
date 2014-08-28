package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	功能:等差数列 2，5，8，11，14。。。。
	输入:正整数N >0
	输出:求等差数列前N项和
	返回:转换成功返回 0 ,非法输入与异常返回-1
	知识点： 函数
	输  入： 输入一个正整数。
	输  出： 输出一个相加后的整数。

 * @author guanxiangqing
 *
 */
public class ArithmeticProgression {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int value = 0;
		int a = 2;
		for (int i = 1; i <= n; i++) {
			value = value + a;
			a = a + 3;
		}
		s.close();
		System.out.print(value);
	}

}
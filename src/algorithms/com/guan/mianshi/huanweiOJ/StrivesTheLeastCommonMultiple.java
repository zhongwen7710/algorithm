package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
	知识点：循环,位运算
	输  入：输入两个正整数A和B
	输  出：输出A和B的最小公倍数
 * @author guanxiangqing
 *
 */
public class StrivesTheLeastCommonMultiple {
	static List<Integer> list = new ArrayList<Integer>();
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int gcd = 1;
		for (int i = 2; i <= (A < B ? A : B); i++) {
			if (isPrime(i))
				list.add(i);
		}
		for (int j = 0; j < list.size(); j++) {
			if (A % (int) list.get(j) == 0 && B % (int) list.get(j) == 0) {
				gcd = (int) list.get(j);
				break;
			}
		}
		System.out.println(A * B / gcd);
	}

	public static boolean isPrime(int i) {
		int n;
		boolean flag = true;

		if (i == 1)
			flag = false;

		for (n = 2; n < i - 1; n++) {
			if (i % n == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
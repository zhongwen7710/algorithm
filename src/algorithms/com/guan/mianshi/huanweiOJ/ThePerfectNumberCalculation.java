package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
	它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
	例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
	给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
	返回n以内完全数的个数。异常情况返回-1
	 //count(int n)相关信息
	 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
	 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
	 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
	 * 
	 * 给定函数count(int n),用于计算n以内(含n)完全数的个数
	 * @param n 计算范围, 0 < n <= 500000
	 * @return n以内完全数的个数, 异常情况返回-1
	
	public static int count(int n)
 * @author guanxiangqing
 *
 */
public class ThePerfectNumberCalculation {
	public static boolean judge(int n) {
		int result = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				result = result + i;
			}
		}
		return result == n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		if (n > 0 && n <= 500000) {
			for (int i = 1; i <= n; i++) {
				if (judge(i)) {
					result++;
				}
			}
			System.out.print(result);
		} else {
			System.out.print("-1");
		}
	}
}
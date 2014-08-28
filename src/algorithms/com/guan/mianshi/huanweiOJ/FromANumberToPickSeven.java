package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数
知识点：循环
输  入：一个正整数N。(N不大于30000)
输  出：不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.

 * @author guanxiangqing
 *
 */
public class FromANumberToPickSeven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0 || String.valueOf(i).contains("7")) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}
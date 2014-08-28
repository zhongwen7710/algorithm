package algorithms.com.guan.mianshi.huanweiOJ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值。
	知识点：函数,指针
	输  入：首先输入一个正整数n，
	然后输入n个整数。
	输  出：
		输出负数的个数，和所有正整数的平均值。
	注：输出  当平均值为整数直接输出，如果不为整数保留一小数。
 * @author guanxiangqing
 *
 */
public class RememberTheNegativeWhich {
	public static int getCountAver(List<Integer> list) {
		int nc = 0, sum = 0, pc = 0;
		BigDecimal aver;
		for (Integer in : list) {
			if (in < 0) {
				nc++;
			} else {
				sum += in;
				pc++;
			}
		}
		aver = new BigDecimal(sum).divide(new BigDecimal(pc));

		if (sum % pc == 0) {
			System.out.print(nc + " " + aver.intValue());
		} else {
			System.out.print(nc + " "
					+ aver.setScale(1, BigDecimal.ROUND_HALF_UP));
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			input.add(scan.nextInt());
		}
		getCountAver(input);

	}

}
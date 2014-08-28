package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.Vector;
/**
 * 问题描述：从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值
	知识点：字符串,循环
	输  入：输入任意个整数
	输  出：输出负数个数以及所有非负数的平均值
 * @author guanxiangqing
 *
 */
public class MakerTheNegativeNumberToPositiveNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<Integer>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			vi.add(a);
		}
		int count = f1(vi);
		float average = f2(vi, count);
		System.out.println(count);
		System.out.println(average);

	}

	public static int f1(Vector<Integer> vi) {
		int count = 0;
		for (int i = 0; i < vi.size(); i++) {
			if (vi.get(i) < 0) {
				count++;
			}
		}
		return count;
	}

	public static float f2(Vector<Integer> vi, int count) {
		int sum = 0;
		for (int i = 0; i < vi.size(); i++) {
			if (vi.get(i) >= 0) {
				sum = sum + vi.get(i);
			}
		}
		if (vi.size() == count) {
			return 0;
		} else {
			float s = sum;
			float c = vi.size() - count;
			return s / c;
		}
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	在给定的区间范围内找出所有素数能构成的最大的等差数列（即等差数列包含的素数个数最多）。
	详细描述：
	接口说明
	原型：
	int GetMaxArray(unsignedint m, unsignedint n, unsignedint *pArrayNum , unsignedint *pArray)
	输入参数：
	unsigned int m 给定的区间下限
	unsigned int n 给定的区间上限
	输出参数：
	unsigned int *pArrayNum 等差数列中数字的个数
	unsigned int *pArray 等差数列
	返回值：
	int 0：处理成功 -1：出现异常
	限制：
	0 <= m 
	m<N 
	N<=30
	举例：
	在区间[0, 10]中，素数构成的最大等差数列为3,5,7
	知识点： 数组
	输  入： 输入两个正整数
	输  出： 输出一个等差数列
 * @author guanxiangqing
 *
 */
public class LookingForArithmeticProgression {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int[] ary = getPrime(n1, n2);
		List<Integer> results = new ArrayList<Integer>();
		results = getSequence(ary, ary.length);
		for (int i = 0; i < results.size() - 1; i++) {
			System.out.print(results.get(i) + " ");
		}
		System.out.println(results.get(results.size() - 1));
	}

	private static int[] getPrime(int n1, int n2) {
		int[] ary = new int[n2];
		int i = 0;
		if (n1 >= 2) {
			i = n1;
		} else {
			i = 2;
		}
		int index = 0;
		for (; i <= n2; i++) {
			if (isPrime(i)) {
				ary[index++] = i;
			}
		}
		int[] result = new int[index];
		System.arraycopy(ary, 0, result, 0, index);
		return result;
	}

	private static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				flag = false;
		}
		return flag;
	}

	public static List<Integer> getSequence(int[] ary, int length) {
		List<Integer> lists = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> subs = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < length - 1; i++) {

			for (int j = i + 1; j < length; j++) {
				lists.add(ary[i]);
				lists.add(ary[j]);
				int n = j;
				int count = 0;
				int sub = 0;
				for (int k = j + 1; k < length; k++) {
					sub = ary[n] - ary[i];
					if (ary[k] == (sub + ary[j])) {
						lists.add(ary[k]);
						j = k;
						count++;
					}
				}
				if (count > max) {

					result.clear();
					max = count;
					result.addAll(lists);
					lists.clear();
				}
				if (count == max) {
					subs.add(sub);
				}
				lists.clear();
			}
			lists.clear();
		}
		return result;
	}
}
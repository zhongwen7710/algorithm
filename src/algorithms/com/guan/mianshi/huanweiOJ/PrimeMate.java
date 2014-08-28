package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。现在密码学会请你设计一个程序，从已有的N（N为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到两组“素数伴侣”，能组成“素数伴侣”最多的方案称为“最佳方案”，当然密码学会希望你寻找出“最佳方案”。
	输入:
	有一个正偶数N（N≤100），表示待挑选的自然数的个数。后面给出具体的数字，范围为[2,30000]。
	输出:
	输出一个整数K，表示你求得的“最佳方案”组成“素数伴侣”的对数。
	知识点：查找,搜索,排序
	输  入： 
	1 输入一个正偶数n
	2 输入n个整数
	输  出： 
		求得的“最佳方案”组成“素数伴侣”的对数。

 * @author guanxiangqing
 *
 */
public class PrimeMate {

	private static Scanner sc;

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void sort(int[] arr) {
		int len = arr.length;
		int[] num = new int[len];
		for (int i = 0; i < len; i++) {
			num[i] = 0;
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (isPrime(arr[i] + arr[j])) {
					num[i]++;
				}
			}

		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (num[i] > num[j]) {
					int temp1 = num[i];
					num[i] = num[j];
					num[j] = temp1;

					int temp2 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp2;
				}
			}
		}
	}

	public static int getMax(int[] arr) {
		int count = 0;
		int len = arr.length;
		List<Integer> list = new ArrayList<Integer>();
		sort(arr);
		for (int i = 0; i < len; i++) {
			list.add(arr[i]);
		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (isPrime(list.get(i) + list.get(j))) {
					// System.out.println(list.get(i)+" "+list.get(j));
					len--;
					// System.out.println(list.get(0));
					list.remove(j);
					// System.out.println("----"+list.remove(j));

					count++;
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 != 0) {
			System.out.println("error!");
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);

		System.out.println(getMax(arr));

		/*
		 * List<Integer> alist = new ArrayList<Integer>(); alist.add(1);
		 * alist.add(2); alist.add(3); alist.add(4);
		 * 
		 * System.out.println(alist.get(0));
		 */
	}
}
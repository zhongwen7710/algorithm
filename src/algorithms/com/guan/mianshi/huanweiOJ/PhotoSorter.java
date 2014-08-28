package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过C语言解决。
知识点：字符串
输  入： Lily使用的图片包括"A"到"Z"、"a"到"z"、"0"到"9"。输入字母或数字个数不超过1024。
输  出： Lily的所有图片按照从小到大的顺序输出

 * @author guanxiangqing
 *
 */
public class PhotoSorter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					char c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}

		}
		scanner.close();

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();

	}

}

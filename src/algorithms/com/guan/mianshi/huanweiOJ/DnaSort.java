package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。
	给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出GC-Ratio最高的子序列。
	知识点：字符串
	输  入：输入一个string型基因序列，和int型子串的长度
	输  出：找出GC比例最高的字串
 * @author guanxiangqing
 *
 */
public class DnaSort {
	private static Scanner scanner;

	public static int countChar(String str) {
		if (str == null)
			return 0;

		int count = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == 'G' || str.charAt(i) == 'C')
				++count;
		}
		return count;
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num = scanner.nextInt();
		int pos = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i <= str.length() - num; ++i) {
			String subStr = str.substring(i, i + num);
			count = countChar(subStr);
			if (count > max) {
				pos = i;
				max = count;
			}
		}
		System.out.println(str.substring(pos, pos + num));
	}

}
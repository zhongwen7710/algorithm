package algorithms.com.guan.mianshi;

import java.util.Scanner;

/**
 * 找出两个字符串的最长公共连续子串的长度
 * 
 * @author guanxiangqing
 * 
 */
public class MaxLongestCommonSubstring {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		// int lengthnum = longestCommonSubstring(str1, str2);
		
		//int lengthnum = longestCommonSubstring2(str1, str2);
		
		int lengthnum = longestCommonSubstring3(str1, str2);
		System.out.println(lengthnum);
		
		

	}

	/**
	 * 方案一：矩阵计算
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int longestCommonSubstring(String str1, String str2) {
		int i, j, k, len1, len2, max, x = 0, y = 0;
		len1 = str1.length();
		len2 = str2.length();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int c[][] = new int[len1 + 1][len2 + 1]; // 创建一个(len1+1)*(len2+1)矩阵

		for (i = 0; i < len1 + 1; i++)
			c[i][0] = 0; // 第0列都初始化为0
		for (j = 0; j < len2 + 1; j++)
			c[0][j] = 0; // 第0行都初始化为0
		max = -1;
		for (i = 1; i < len1 + 1; i++) {
			for (j = 1; j < len2 + 1; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) // 只需要跟左上方的c[i-1][j-1]比较就可以了
					c[i][j] = c[i - 1][j - 1] + 1;
				else
					// 不连续的时候还要跟左边的c[i][j-1]、上边的c[i-1][j]值比较，这里不需要
					c[i][j] = 0;
				if (c[i][j] > max) {
					max = c[i][j];
					x = i;
					y = j;
				}
			}
		}

		// char s[]= new char[1000];
		// k=max;
		// i = x - 1;
		// j = y - 1;
		// while (i >= 0 && j >= 0) {
		// if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
		// s[k--]=str1.charAt(i);
		// i--;
		// j--;
		// } else
		// // 只要有一个不相等，就说明相等的公共字符断了，不连续了
		// break;
		// }

		k = max;
		i = x - 1;
		j = y - 1;
		String substring;
		System.out.println("K的值为：" + k);
		// System.out.println("i的值为："+i);
		System.out.println("j的值为：" + j);

		substring = str2.substring(j - k + 1, j + 1);

		System.out.println(substring);
		return max;

	}

	// 华为OJ提交的答案1（测试不对）
	public static int longestCommonSubstring0(String str1, String str2) {
		int i, j, len1, len2, max;
		len1 = str1.length();
		len2 = str2.length();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int c[][] = new int[len1 + 1][len2 + 1]; // 创建一个(len1+1)*(len2+1)矩阵

		for (i = 0; i < len1 + 1; i++)
			c[i][0] = 0; // 第0列都初始化为0
		for (j = 0; j < len2 + 1; j++)
			c[0][j] = 0; // 第0行都初始化为0
		max = -1;
		for (i = 1; i < len1 + 1; i++) {
			for (j = 1; j < len2 + 1; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) // 只需要跟左上方的c[i-1][j-1]比较就可以了
					c[i][j] = c[i - 1][j - 1] + 1;
				else
					// 不连续的时候还要跟左边的c[i][j-1]、上边的c[i-1][j]值比较，这里不需要
					c[i][j] = 0;
				if (c[i][j] > max) {
					max = c[i][j];
				}
			}
		}

		return max;
	}

	/**
	 * 方案二：尺度原理
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int longestCommonSubstring2(String str1, String str2) {
		int i, len1, len2, len, s1_start, s2_start, idx, curmax, max;
		len1 = str1.length();
		len2 = str2.length();
		len = len1 + len2;
		max = 0;

		// 输入的字符串不进行区分大小写，先得进行入戏处理
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		for (i = 0; i < len; i++) {
			s1_start = s2_start = 0;
			if (i < len1)
				s1_start = len1 - i; // 每次开始匹配的起始位置
			else
				s2_start = i - len1;
			curmax = 0;
			for (idx = 0; (s1_start + idx < len1) && (s2_start + idx < len2); idx++) {
				if (str1.charAt(s1_start + idx) == str2.charAt(s2_start + idx))
					curmax++;
				else {
					// 只要有一个不相等，就说明相等的公共字符断了，不连续了，要保存curmax与max中的最大值，并将curmax重置为0
					max = curmax > max ? curmax : max;
					curmax = 0;
				}
			}
			max = curmax > max ? curmax : max;
		}
		return max;
	}

	public static int longestCommonSubstring3(String str1, String str2) {
		int MaxNum = 0;
	
		return MaxNum;
	}
}

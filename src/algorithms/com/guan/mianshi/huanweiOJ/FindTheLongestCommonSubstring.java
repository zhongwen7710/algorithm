package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	查找两个字符串a,b中的最长公共子串。
	接口设计及说明：
	
	****************************************************************************
	 Description   : 查找两个字符串a,b中的最长公共子串
	 Input Param   : String stringA, 输入字符串A
	     String stringB, 输入字符串B               
	 Output Param  : 
	 Return Value  : 成功返回最大公共子串，失败返回null（如：数据错误）
	 ****************************************************************************
	 public static String iQueryMaxCommString(String stringA, String stringB)
	 {
	     //在这里实现功能，将结果填入输入数组中
	     return null;
	 }
	知识点：字符串
	输  入： 输入两个字符串
	输  出： 返回重复出现的字符
 * @author guanxiangqing
 *
 */
public class FindTheLongestCommonSubstring {

	public static String iQueryMaxCommString(String str1, String str2) {
		int len = str1.length();
		String s = "--";
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				if (str2.contains(str1.substring(i, j))) {
					count = j - i;
					if (max < count) {
						max = count;
					}
				}
			}
		}

		for (int i = 0; i <= len - max; i++) {
			if (str2.contains(str1.substring(i, i + max))) {
				// System.out.println(str1.substring(i,i+max));
				s = str1.substring(i, i + max);
				return s;
			}
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(iQueryMaxCommString(str1, str2));

		sc.close();
	}
}
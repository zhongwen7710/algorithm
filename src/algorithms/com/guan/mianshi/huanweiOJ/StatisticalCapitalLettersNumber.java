package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	找出给定字符串中大写字符(即'A'-'Z')的个数
	接口说明
	    原型：int CalcCapital(String str);
	    返回值：int
	知识点：字符串
	输  入：输入一个String数据
	输  出： 
		输出string中大写字母的个数
	需考虑字符串为空  如果为空输出0

 * @author guanxiangiqng
 *
 */
public class StatisticalCapitalLettersNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(CalcCapital(inputStr));
	}

	private static int CalcCapital(String str) {
		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (c >= 'A' && c <= 'Z') {
				i++;
			}
		}
		return i;
	}

}
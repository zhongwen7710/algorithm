package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。
	输入参数：
	inputString：输入的字符串
	 
	返回值：
	输出转换好的逆序字符串
	知识点：字符串
	输  入：输入一个字符串，可以有空格
	输  出：输出逆序的字符串
 * @author guanxiangqing
 *
 */
public class CharactersInReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if (str.length() <= 100) {
			char[] temp = str.toCharArray();
			for (int i = temp.length - 1; i >= 0; i--) {
				System.out.print(temp[i]);
			}
		} else {
			System.out.print("输入的字符不能超过100个");
		}
		sc.close();
	}

}
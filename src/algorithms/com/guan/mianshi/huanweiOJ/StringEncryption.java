package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;
/**
 * 问题描述：
 * 1、对输入的字符串进行加解密，并输出。
   2、加密方法为：
	当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
	当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
	其他字符不做变化。
	3、解密方法为加密的逆过程。
	 
	接口描述：
	    实现接口，每个接口实现1个基本操作：
	void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
	说明：
	1、字符串以\0结尾。
	2、字符串最长100个字符。
	 
	int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
	说明：
	1、字符串以\0结尾。
    2、字符串最长100个字符。

 * @author guanxiangqing
 *
 */

public class StringEncryption {

	public static char[] secret(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9') {
				if (a[i] == '9')
					a[i] = '0';
				else
					a[i] = (char) ((int) a[i] + 1);
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				if (a[i] == 'Z')
					a[i] = 'a';
				else
					a[i] = (char) ((int) (a[i]) + 33);
			}

			else if (a[i] >= 'a' && a[i] <= 'z') {
				if (a[i] == 'z')
					a[i] = 'A';
				else
					a[i] = (char) ((int) (a[i]) - 31);
			}

		}
		return a;
	}

	public static char[] secret1(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9') {
				if (a[i] == '0')
					a[i] = '9';
				else
					a[i] = (char) ((int) a[i] - 1);
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				if (a[i] == 'A')
					a[i] = 'z';
				else
					a[i] = (char) ((int) (a[i]) + 31);
			}

			else if (a[i] >= 'a' && a[i] <= 'z') {
				if (a[i] == 'a')
					a[i] = 'Z';
				else
					a[i] = (char) ((int) (a[i]) - 33);
			}

		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine();
		String in2 = sc.nextLine();
		sc.close();
		char[] input1 = in1.toCharArray();
		char[] input2 = in2.toCharArray();
		char[] output1 = secret(input1);
		char[] output2 = secret1(input2);
		for (int i = 0; i < output1.length; i++)
			System.out.print(output1[i]);
		System.out.println();
		for (int i = 0; i < output1.length; i++)
			System.out.print(output2[i]);
	}

}
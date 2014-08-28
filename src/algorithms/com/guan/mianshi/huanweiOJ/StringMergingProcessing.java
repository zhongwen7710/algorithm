package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 问题描述：
 * 按照指定规则对输入的字符串进行处理。
	将输入的两个字符串合并。
	对合并后的字符串进行排序，要求为：下标为奇数的字符和下标为偶数的字符分别从小到大排序。这里的下标意思是字符在字符串中的位置。
	对排序后的字符串进行操作，如果字符为‘0’——‘9’或者‘A’——‘F’或者‘a’——‘f’，则对他们所代表的16进制的数进行BIT倒序的操作，
	并转换为相应的大写字符。如字符为‘4’，为0100b，则翻转后为0010b，也就是2。转换后的字符为‘2’； 如字符为‘7’，为0111b，则翻转后为1110b，也就是e。转换后的字符为大写‘E’。 
	举例：输入str1为"dec"，str2为"fab"，合并为“decfab”，分别对“dca”和“efb”进行排序，排序后为“abcedf”，转换后为“5D37BF”
	接口设计及说明：

 * @author guanxiangqing
 *
 */
public class StringMergingProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char[] result = processString(str1, str2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	static char[] processString(String str1, String str2) {
		String newString = str1.concat(str2);
		int len = newString.length();
		char[] odd = new char[len % 2 == 0 ? len / 2 : (len / 2) + 1];
		char[] even = new char[len / 2];
		int oddindex = 0, evenindex = 0;
		for (int i = 1; i <= len; i++) {
			if (i % 2 == 0) {
				even[evenindex++] = newString.charAt(i - 1);
			} else {
				odd[oddindex++] = newString.charAt(i - 1);
			}
		}
		Arrays.sort(odd);
		Arrays.sort(even);
		char[] result = new char[len];
		oddindex = 0;
		evenindex = 0;
		for (int i = 1; i <= len; i++) {
			if (i % 2 == 0) {
				result[i - 1] = even[evenindex++];
			} else {
				result[i - 1] = odd[oddindex++];
			}
		}
		convert(result);
		return result;

	}

	static void convert(char[] arr) {
		char ch;
		for (int i = 0; i < arr.length; i++) {
			ch = arr[i];
			if (Character.isDigit(ch) || (ch >= 'a' && ch <= 'f')
					|| (ch >= 'A' && ch <= 'F')) {
				StringBuffer sb = new StringBuffer(
						Integer.toBinaryString(Character.digit(ch, 16)));
				arr[i] = Character
						.toUpperCase(Integer.toHexString(
								Integer.parseInt(sb.reverse().toString(), 2))
								.charAt(0));
			}
		}

	}

}
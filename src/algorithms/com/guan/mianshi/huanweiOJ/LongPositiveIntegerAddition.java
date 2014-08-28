package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	请设计一个算法完成两个超长正整数的加法。
	接口说明 
	
	 请设计一个算法完成两个超长正整数的加法。
	 输入参数：
	 String addend：加数
	 String augend：被加数
	 返回值：加法结果
	
	 public String AddLongInteger(String addend, String augend)
	 {
	     //在这里实现功能
	  
	  return null;     
	 }
 * @author guanxiangqing
 *
 */
public class LongPositiveIntegerAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		System.out.println(AddLongInteger(str1, str2));
	}

	public static String AddLongInteger(String addend, String augend) {
		String maxstr = addend.length() > augend.length() ? addend : augend;
		String minstr = addend.length() > augend.length() ? augend : addend;
		if (addend.length() == augend.length()) {
			maxstr = addend;
			minstr = augend;
		}
		char[] ch1max = maxstr.toCharArray();
		char[] ch2 = minstr.toCharArray();
		char[] ch2min = new char[ch1max.length];
		for (int i = 0; i < ch1max.length; i++) {
			if (i >= (ch1max.length - ch2.length)) {
				ch2min[i] = ch2[i - ch1max.length + ch2.length];
			} else {
				ch2min[i] = '0';
			}

		}
		int flag = 0;
		char[] chall = new char[ch1max.length + 1];
		for (int i = ch1max.length - 1; i >= 0; i--) {
			char num = (char) ((((ch1max[i] - 48) + (ch2min[i] - 48) + flag) % 10) + 48);
			flag = ((ch1max[i] - 48) + (ch2min[i] - 48) + flag) / 10;
			chall[i + 1] = num;
		}
		chall[0] = (char) (flag + 48);
		int znum = 0;
		for (int i = 0; i < chall.length; i++) {
			if (chall[i] != '0') {
				i = chall.length;
			} else {
				znum++;
			}
		}
		return String.copyValueOf(chall).substring(znum);
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	自守数是指一个数的平方的尾数等于该数自身的自然数。例如：252 = 625，762 = 5776，93762 = 87909376。请求出n以内的自守数的个数
	 
	接口说明
	
	
	 功能: 求出n以内的自守数的个数
	
	 输入参数：
	 int n
	 返回值：
	     n以内自守数的数量。
	
	 
	 public static int CalcAutomorphicNumbers( int n)
	 {
	     //在这里实现功能
	     return 0;
	 }
 * @author guanxiangqing
 *
 */
public class AutomorphicNumber {

	public static int num(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			String str1 = String.valueOf(i);
			int len1 = str1.length();
			String str2 = String.valueOf(i * i);
			int len2 = str2.length();
			String str3 = str2.substring(len2 - len1);
			if (str1.equals(str3)) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(num(n));

		sc.close();
	}
}
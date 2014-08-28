package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * 问题描述：
	任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对 
	请实现如下接口
	    public static class PrimePair
	    {
	       public int primeMin;
	       public int primeMax;
	    }
	    public static PrimePair findPrimeNumber(int number)
	    {
	        // 请实现 
	       return null;
	    }
	 
	譬如：输入20 ，输出 7 13
	约束
	number为输入的偶数，5 < inum <= 10000
	知识点：循环
	输  入：输入一个偶数
	输  出：输出两个素数  
 * @author guanxiangqing
 *
 */
public class SearchAEvenClosestTwoPrimeNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = n / 2 - 1; i > 1; i--)
			if (isPrime(i) && isPrime(n - i)) {
				System.out.println(i);
				System.out.println(n - i);
				break;
			}
	}

	public static boolean isPrime(int i) {
		int n;
		boolean flag = true;

		if (i == 1)
			flag = false;
		for (n = 2; n < i - 1; n++) {
			if (i % n == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
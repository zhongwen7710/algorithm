package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * ����������
	����һ��ż��������2����������2��������ɣ����ż����2�������кܶ������������ĿҪ��������ָ��ż��������������ֵ��С�������� 
	��ʵ�����½ӿ�
	    public static class PrimePair
	    {
	       public int primeMin;
	       public int primeMax;
	    }
	    public static PrimePair findPrimeNumber(int number)
	    {
	        // ��ʵ�� 
	       return null;
	    }
	 
	Ʃ�磺����20 ����� 7 13
	Լ��
	numberΪ�����ż����5 < inum <= 10000
	֪ʶ�㣺ѭ��
	��  �룺����һ��ż��
	��  ���������������  
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
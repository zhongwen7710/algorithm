package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	��������ָһ������ƽ����β�����ڸ����������Ȼ�������磺252 = 625��762 = 5776��93762 = 87909376�������n���ڵ��������ĸ���
	 
	�ӿ�˵��
	
	
	 ����: ���n���ڵ��������ĸ���
	
	 ���������
	 int n
	 ����ֵ��
	     n������������������
	
	 
	 public static int CalcAutomorphicNumbers( int n)
	 {
	     //������ʵ�ֹ���
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
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���7�й����ֵĸ���������7�ı��������а���7�����֣���17��27��37...70��71��72��73...���ĸ���
֪ʶ�㣺ѭ��
��  �룺һ��������N��(N������30000)
��  ����������N����7�йص����ָ�������������20����7�йص����ְ���7,14,17.

 * @author guanxiangqing
 *
 */
public class FromANumberToPickSeven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0 || String.valueOf(i).contains("7")) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}
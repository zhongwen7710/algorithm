package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��M��ͬ����ƻ������N��ͬ��������������е����ӿ��Ų��ţ��ʹ��ж����ֲ�ͬ�ķַ�������K��ʾ��5��1��1��1��5��1 ��ͬһ�ַַ���
	����
	ÿ������������������M��N��0<=m<=10��1<=n<=10��<=n<=10<=m<=10
	 
	��������
	7 3
	�������
	8
	     * �����ƻ��������Ŀ
	     * ����ֵ�Ƿ�ʱ����-1
	     * 1 <= m,n <= 10<><= m,n <= 10<>
	     * @param m ƻ����Ŀ
	     * @param n ������Ŀ��
	     * @return ���÷�������
	     * 
	    public static int count(int m, int n)
	֪ʶ�㣺ѭ��
	��  �룺��������int����
	��  ������������int��

 * @author guanxiangqing
 *
 */
public class PutTheApple {

	public static int count(int appleNum, int plateNum) {

		if (appleNum == 0 || plateNum == 1) {
			return 1;
		}
		if (appleNum < plateNum) {
			return count(appleNum, appleNum);
		} else {
			return count(appleNum, plateNum - 1)
					+ count(appleNum - plateNum, plateNum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int appleNum = sc.nextInt();
		int plateNum = sc.nextInt();
		System.out.println(count(appleNum, plateNum));
	}
}
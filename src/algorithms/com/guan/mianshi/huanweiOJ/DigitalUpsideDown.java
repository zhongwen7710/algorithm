package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��������������������ַ�������ʽ�������
	���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
	֪ʶ�㣺�ַ���
	��  �룺����һ��int����
	��  ����������������ַ�������ʽ�������
 * @author guanxiangqing
 *
 */
public class DigitalUpsideDown {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String s = String.valueOf(k);
		StringBuffer l = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			l.append(s.charAt(i));
		}
		String m = l.toString();
		System.out.println(m);
	}
}
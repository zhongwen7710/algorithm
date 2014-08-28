package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
	֪ʶ�㣺�ַ���,����,ָ��
	��  �룺����N���ַ����ַ���ACSII�뷶Χ��(0~127)��
	��  ��������ַ��ĸ�����
 * @author guanxiangqing
 *
 */
public class StatisticsTheNumberOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr = sc.nextLine();
		sc.close();
		int num[] = new int[128];
		int len = mStr.length();
		for (int i = 0; i < len; i++) {
			char ci = mStr.charAt(i);
			if (ci > 0 && ci < 127)
				num[ci]++;
		}
		int n = 0;
		for (int i = 0; i < 127; i++) {
			if (num[i] != 0)
				n++;
		}
		System.out.println(n);
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	�����ַ������һ�����ʵĳ��ȣ������Կո������
	֪ʶ�㣺�ַ���,ѭ��
	��  �룺һ���ַ���������С��128��
	��  ��������N�����һ�����ʵĳ��ȡ�
 * @author guanxiangqing
 *
 */
public class TheLengthOfTheLastWordFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] c = str.toCharArray();
		int m = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] != ' ')
				m++;
			else
				break;
		}
		System.out.print(m);
	}

}
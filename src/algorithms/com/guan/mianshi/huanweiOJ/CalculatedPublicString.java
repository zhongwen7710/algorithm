package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���������ַ�������󹫹��ִ��ĳ��ȣ��ַ������ִ�Сд
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	int getCommonStrLength(char * pFirstStr, char * pSecondStr);
	���������
	     char * pFirstStr //��һ���ַ���
	     char * pSecondStr//�ڶ����ַ���
	֪ʶ�㣺�ַ���,����
	��  �룺���������ַ���
	��  �������һ������
 * @author guanxiangqing
 *
 */
public class CalculatedPublicString {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String strFirst = sca.nextLine();
		String[] strArray = strFirst.split(" ");
		System.out.println(getMaxSame(strArray[0], strArray[1]));
	}

	private static int getMaxSame(String first0, String second0) {

		String first = first0.toLowerCase();
		String second = second0.toLowerCase();

		int fLen = first.length();
		int sLen = second.length();
		int d = (fLen <= sLen) ? fLen : sLen;
		String min = null;
		String max = null;
		String target = null;
		if (fLen <= sLen) {
			min = first;
			max = second;
		} else {
			min = second;
			max = first;
		}
		for (int i = d; i >= 1; i--) {
			for (int j = 0; j <= min.length() - i; j++) {
				target = min.substring(j, j + i);
				for (int k = 0; k <= max.length() - i; k++) {
					if (max.substring(k, k + i).equals(target)) {
						return i;
					}
				}
			}
		}
		return 0;
	}
}
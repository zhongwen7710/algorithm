package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;
/**
 * ����������
 * 1����������ַ������мӽ��ܣ��������
   2�����ܷ���Ϊ��
	��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa��
	������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0��
	�����ַ������仯��
	3�����ܷ���Ϊ���ܵ�����̡�
	 
	�ӿ�������
	    ʵ�ֽӿڣ�ÿ���ӿ�ʵ��1������������
	void Encrypt (char aucPassword[], char aucResult[])���ڸú�����ʵ���ַ������ܲ����
	˵����
	1���ַ�����\0��β��
	2���ַ����100���ַ���
	 
	int unEncrypt (char result[], char password[])���ڸú�����ʵ���ַ������ܲ����
	˵����
	1���ַ�����\0��β��
    2���ַ����100���ַ���

 * @author guanxiangqing
 *
 */

public class StringEncryption {

	public static char[] secret(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9') {
				if (a[i] == '9')
					a[i] = '0';
				else
					a[i] = (char) ((int) a[i] + 1);
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				if (a[i] == 'Z')
					a[i] = 'a';
				else
					a[i] = (char) ((int) (a[i]) + 33);
			}

			else if (a[i] >= 'a' && a[i] <= 'z') {
				if (a[i] == 'z')
					a[i] = 'A';
				else
					a[i] = (char) ((int) (a[i]) - 31);
			}

		}
		return a;
	}

	public static char[] secret1(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9') {
				if (a[i] == '0')
					a[i] = '9';
				else
					a[i] = (char) ((int) a[i] - 1);
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				if (a[i] == 'A')
					a[i] = 'z';
				else
					a[i] = (char) ((int) (a[i]) + 31);
			}

			else if (a[i] >= 'a' && a[i] <= 'z') {
				if (a[i] == 'a')
					a[i] = 'Z';
				else
					a[i] = (char) ((int) (a[i]) - 33);
			}

		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine();
		String in2 = sc.nextLine();
		sc.close();
		char[] input1 = in1.toCharArray();
		char[] input2 = in2.toCharArray();
		char[] output1 = secret(input1);
		char[] output2 = secret1(input2);
		for (int i = 0; i < output1.length; i++)
			System.out.print(output1[i]);
		System.out.println();
		for (int i = 0; i < output1.length; i++)
			System.out.print(output2[i]);
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ��� �磺���롰I am a student���������tneduts a ma I����
	���������
	inputString��������ַ���
	 
	����ֵ��
	���ת���õ������ַ���
	֪ʶ�㣺�ַ���
	��  �룺����һ���ַ����������пո�
	��  �������������ַ���
 * @author guanxiangqing
 *
 */
public class CharactersInReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if (str.length() <= 100) {
			char[] temp = str.toCharArray();
			for (int i = temp.length - 1; i >= 0; i--) {
				System.out.print(temp[i]);
			}
		} else {
			System.out.print("������ַ����ܳ���100��");
		}
		sc.close();
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
	֪ʶ�㣺 �ַ���,����,ָ��
	��  �룺 ����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
	��  ���� ��������ַ����к��и��ַ��ĸ�����
 * @author guanxiangqing
 *
 */
public class CalculateNumberOfCharacters {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String s = sc.next().toLowerCase();
		char c = s.toCharArray()[0];
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				num++;
			}
		}
		System.out.print(num);
		sc.close();
	}
}
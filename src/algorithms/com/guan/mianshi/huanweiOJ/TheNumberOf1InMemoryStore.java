package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��int�����ݣ��������int���������ڴ��д洢ʱ1�ĸ�����
	֪ʶ�㣺�ַ���,����
	��  �룺����һ��������int���ͣ�
	��  ���������ת����2���ƺ����1�ĸ���
 * @author guanxiangqing
 *
 */
public class TheNumberOf1InMemoryStore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toBinaryString(n);
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);

		sc.close();

	}
}
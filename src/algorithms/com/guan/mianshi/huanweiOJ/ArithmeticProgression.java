package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����:�Ȳ����� 2��5��8��11��14��������
	����:������N >0
	���:��Ȳ�����ǰN���
	����:ת���ɹ����� 0 ,�Ƿ��������쳣����-1
	֪ʶ�㣺 ����
	��  �룺 ����һ����������
	��  ���� ���һ����Ӻ��������

 * @author guanxiangqing
 *
 */
public class ArithmeticProgression {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int value = 0;
		int a = 2;
		for (int i = 1; i <= n; i++) {
			value = value + a;
			a = a + 3;
		}
		s.close();
		System.out.print(value);
	}

}
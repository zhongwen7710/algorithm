package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	Lily�Ͽ�ʱʹ����ĸ����ͼƬ��С������ѧϰӢ�ﵥ�ʣ�ÿ�ζ���Ҫ����ЩͼƬ���մ�С��ASCII��ֵ��С���������պá����Ҹ�Lily��æ��ͨ��C���Խ����
֪ʶ�㣺�ַ���
��  �룺 Lilyʹ�õ�ͼƬ����"A"��"Z"��"a"��"z"��"0"��"9"��������ĸ�����ָ���������1024��
��  ���� Lily������ͼƬ���մ�С�����˳�����

 * @author guanxiangqing
 *
 */
public class PhotoSorter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					char c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}

		}
		scanner.close();

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();

	}

}

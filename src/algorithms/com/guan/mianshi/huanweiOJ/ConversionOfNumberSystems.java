package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����
	֪ʶ�㣺�ַ���,ѭ��,����,ָ��
	��  �룺����һ��ʮ�����Ƶ���ֵ�ַ�����
	��  �����������ֵ��ʮ�����ַ�����

 * @author guanxiangqing
 *
 */
public class ConversionOfNumberSystems {

	public static long convert(String str) {
		int len = str.length();
		if (len < 3) {
			return 0;
		}
		String s = str.substring(2);
		int n = 0;
		long l = 0;
		for (int i = 0; i < len - 2; i++) {
			switch (s.charAt(i)) {
			case 'a':
			case 'A':
				n = 10;
				break;
			case 'b':
			case 'B':
				n = 11;
				break;
			case 'c':
			case 'C':
				n = 12;
				break;
			case 'd':
			case 'D':
				n = 13;
				break;

			case 'E':
			case 'e':
				n = 14;
				break;
			case 'F':
			case 'f':
				n = 15;
				break;
			default:
				n = Integer.parseInt(String.valueOf(s.charAt(i)));
				break;
			}
			l += n * Math.pow(16, len - 3 - i);

		}

		return l;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(convert(str));

		sc.close();
	}
}
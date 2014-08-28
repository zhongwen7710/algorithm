package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * ����������
 * Catcher��MCA�����鱨Ա��������ʱ���ֵй�����һЩ�ԳƵ��������ͨ�ţ�
 * ��������ЩABBA��ABA��A��123321������������ʱ���ڿ�ʼ�����ʱ����һЩ�޹ص��ַ��Է�ֹ����ƽ⡣
 * ����������б仯 ABBA->12ABBA,ABA->ABAKK,123321->51233214����
 * ��Ϊ�ػ�Ĵ�̫���ˣ����Ҵ��ڶ��ֿ��ܵ������abaaab�ɿ�����aba,��baaab�ļ�����ʽ����
 * Cathcer�Ĺ�����ʵ����̫���ˣ���ֻ������Ը������������ܰ�Catcher�ҳ������Ч���봮��
 * @author guanxiangqqing
 *
 */
public class GetprearEndword {

	public static boolean isTrue(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static int getMax(String str) {
		int count = 0;
		int max = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				if (isTrue(str.substring(i, j))) {
					count = j - i;
					if (max < count) {
						max = count;
					}
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(getMax(str));
		sc.close();
	}
}
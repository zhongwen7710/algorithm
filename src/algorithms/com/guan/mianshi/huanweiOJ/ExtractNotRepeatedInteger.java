package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
	֪ʶ�㣺����
	��  �룺����һ��int������
	��  ���� 
		���մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�����
	�������������0��ͷ��ȥ��0��
	�� intput��1010   output��1

 * @author guanxiangqing
 *
 */
public class ExtractNotRepeatedInteger {
	public static void main(String[] args) {
		// ��ȡ���ظ�������
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] s2a = s.toCharArray();
		int[] counter = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i = s2a.length - 1;
		if (s2a[s2a.length - 1] == '0') {
			for (i = s2a.length - 1; i > -1; i--) {
				if (s2a[i] != '0')
					break;
			}
		}
		if (s2a[s2a.length - 1] == '0' && i == -1)
			System.out.print("0");
		for (int j = i; j > -1; j--) {
			switch (s2a[j]) {
			case '0':
				counter[0]++;
				break;
			case '1':
				counter[1]++;
				break;
			case '2':
				counter[2]++;
				break;
			case '3':
				counter[3]++;
				break;
			case '4':
				counter[4]++;
				break;
			case '5':
				counter[5]++;
				break;
			case '6':
				counter[6]++;
				break;
			case '7':
				counter[7]++;
				break;
			case '8':
				counter[8]++;
				break;
			case '9':
				counter[9]++;
				break;
			}
			if (counter[(s2a[j] - '0')] == 1) {
				if (s2a[s2a.length - 1] != '0')
					System.out.print(s2a[j]);
				else if (s2a[s2a.length - 1] == '0' && s2a[j] != '0')
					System.out.print(s2a[j]);
			}
		}
	}
}
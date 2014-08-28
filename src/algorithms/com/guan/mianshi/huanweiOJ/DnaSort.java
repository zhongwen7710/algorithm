package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	һ��DNA������A/C/G/T�ĸ���ĸ�����������ɡ�G��C�ı���������ΪGC-Ratio����������G��C������ĸ���ܵĳ��ִ��������ܵ���ĸ��Ŀ��Ҳ�������г��ȣ����ڻ��򹤳��У���������ǳ���Ҫ����Ϊ�ߵ�GC-Ratio�����ǻ������ʼ�㡣
	����һ���ܳ���DNA���У��Լ�Ҫ�����С�����г��ȣ��о���Ա��������Ҫ�������ҳ�GC-Ratio��ߵ������С�
	֪ʶ�㣺�ַ���
	��  �룺����һ��string�ͻ������У���int���Ӵ��ĳ���
	��  �����ҳ�GC������ߵ��ִ�
 * @author guanxiangqing
 *
 */
public class DnaSort {
	private static Scanner scanner;

	public static int countChar(String str) {
		if (str == null)
			return 0;

		int count = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == 'G' || str.charAt(i) == 'C')
				++count;
		}
		return count;
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num = scanner.nextInt();
		int pos = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i <= str.length() - num; ++i) {
			String subStr = str.substring(i, i + num);
			count = countChar(subStr);
			if (count > max) {
				pos = i;
				max = count;
			}
		}
		System.out.println(str.substring(pos, pos + num));
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.Vector;
/**
 * ����������
	���ͳ�Ƶĸ�����ͬ������ASII����С����������� ������������ַ��������Щ�ַ����ý���ͳ�ơ�
	ʵ�����½ӿڣ�
	    ����һ���ַ��������ַ��еĸ���Ӣ���ַ������֣��ո����ͳ�ƣ��ɷ������ã�
	    ����ͳ�Ƹ����ɶൽ�����ͳ�ƽ�������ͳ�Ƶĸ�����ͬ������ASII����С�����������
	    ���Ŀǰ��ͳ�ƽ��������ͳ��
	�����߻ᱣ֤��
	������ַ����ԡ�\0����β��
	֪ʶ�㣺�ַ���,����
	��  �룺����һ���ַ���
	��  �������ַ��еĸ���Ӣ���ַ�����Сд�ֿ�ͳ�ƣ������֣��ո����ͳ�ƣ�������ͳ�Ƹ����ɶൽ�����,���ͳ�Ƶĸ�����ͬ������ASII����С����������� ������������ַ��������Щ�ַ����ý���ͳ�ơ�
 * @author guanxiangqing
 *
 */
public class SumOfCharacters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] chs = str.toCharArray();

		// ������
		for (int i = chs.length - 1; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (chs[j] > chs[j + 1]) {
					char temp = chs[j];
					chs[j] = chs[j + 1];
					chs[j + 1] = temp;
				}
			}

		Vector<Character> vector = new Vector<Character>();
		Vector<Integer> vector2 = new Vector<Integer>();
		char last = '?';
		for (int i = 0; i < chs.length; i++) {
			char cur = chs[i];
			if ((cur >= '0' && cur <= '9') || (cur >= 'a' && cur <= 'z')
					|| (cur >= 'A' && cur <= 'Z') || cur == ' ') {
				if (cur == last)
					vector2.set(vector2.size() - 1, vector2.lastElement() + 1);
				else {
					vector2.addElement(1);
					vector.add(cur);
				}
			}
			last = cur;
		}

		// ����
		for (int i = vector2.size() - 1; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (vector2.get(j) < vector2.get(j + 1)) {
					int temp = vector2.get(j);
					vector2.set(j, vector2.get(j + 1));
					vector2.set(j + 1, temp);

					char temp2 = vector.get(j);
					vector.set(j, vector.get(j + 1));
					vector.set(j + 1, temp2);
				}
			}

		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i));
		}

	}

}
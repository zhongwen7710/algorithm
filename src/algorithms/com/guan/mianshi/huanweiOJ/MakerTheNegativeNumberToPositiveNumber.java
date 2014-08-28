package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.Vector;
/**
 * �����������������������������ͳ�����еĸ��������������зǸ�����ƽ��ֵ
	֪ʶ�㣺�ַ���,ѭ��
	��  �룺�������������
	��  ����������������Լ����зǸ�����ƽ��ֵ
 * @author guanxiangqing
 *
 */
public class MakerTheNegativeNumberToPositiveNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<Integer>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			vi.add(a);
		}
		int count = f1(vi);
		float average = f2(vi, count);
		System.out.println(count);
		System.out.println(average);

	}

	public static int f1(Vector<Integer> vi) {
		int count = 0;
		for (int i = 0; i < vi.size(); i++) {
			if (vi.get(i) < 0) {
				count++;
			}
		}
		return count;
	}

	public static float f2(Vector<Integer> vi, int count) {
		int sum = 0;
		for (int i = 0; i < vi.size(); i++) {
			if (vi.get(i) >= 0) {
				sum = sum + vi.get(i);
			}
		}
		if (vi.size() == count) {
			return 0;
		} else {
			float s = sum;
			float c = vi.size() - count;
			return s / c;
		}
	}

}
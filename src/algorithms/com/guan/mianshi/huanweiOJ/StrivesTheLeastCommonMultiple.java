package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ�����һ���㷨��������A��B����С��������
	֪ʶ�㣺ѭ��,λ����
	��  �룺��������������A��B
	��  �������A��B����С������
 * @author guanxiangqing
 *
 */
public class StrivesTheLeastCommonMultiple {
	static List<Integer> list = new ArrayList<Integer>();
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int gcd = 1;
		for (int i = 2; i <= (A < B ? A : B); i++) {
			if (isPrime(i))
				list.add(i);
		}
		for (int j = 0; j < list.size(); j++) {
			if (A % (int) list.get(j) == 0 && B % (int) list.get(j) == 0) {
				gcd = (int) list.get(j);
				break;
			}
		}
		System.out.println(A * B / gcd);
	}

	public static boolean isPrime(int i) {
		int n;
		boolean flag = true;

		if (i == 1)
			flag = false;

		for (n = 2; n < i - 1; n++) {
			if (i % n == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
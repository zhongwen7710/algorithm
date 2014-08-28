package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	�ڸ��������䷶Χ���ҳ����������ܹ��ɵ����ĵȲ����У����Ȳ����а���������������ࣩ��
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	int GetMaxArray(unsignedint m, unsignedint n, unsignedint *pArrayNum , unsignedint *pArray)
	���������
	unsigned int m ��������������
	unsigned int n ��������������
	���������
	unsigned int *pArrayNum �Ȳ����������ֵĸ���
	unsigned int *pArray �Ȳ�����
	����ֵ��
	int 0������ɹ� -1�������쳣
	���ƣ�
	0 <= m 
	m<N 
	N<=30
	������
	������[0, 10]�У��������ɵ����Ȳ�����Ϊ3,5,7
	֪ʶ�㣺 ����
	��  �룺 ��������������
	��  ���� ���һ���Ȳ�����
 * @author guanxiangqing
 *
 */
public class LookingForArithmeticProgression {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int[] ary = getPrime(n1, n2);
		List<Integer> results = new ArrayList<Integer>();
		results = getSequence(ary, ary.length);
		for (int i = 0; i < results.size() - 1; i++) {
			System.out.print(results.get(i) + " ");
		}
		System.out.println(results.get(results.size() - 1));
	}

	private static int[] getPrime(int n1, int n2) {
		int[] ary = new int[n2];
		int i = 0;
		if (n1 >= 2) {
			i = n1;
		} else {
			i = 2;
		}
		int index = 0;
		for (; i <= n2; i++) {
			if (isPrime(i)) {
				ary[index++] = i;
			}
		}
		int[] result = new int[index];
		System.arraycopy(ary, 0, result, 0, index);
		return result;
	}

	private static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				flag = false;
		}
		return flag;
	}

	public static List<Integer> getSequence(int[] ary, int length) {
		List<Integer> lists = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> subs = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < length - 1; i++) {

			for (int j = i + 1; j < length; j++) {
				lists.add(ary[i]);
				lists.add(ary[j]);
				int n = j;
				int count = 0;
				int sub = 0;
				for (int k = j + 1; k < length; k++) {
					sub = ary[n] - ary[i];
					if (ary[k] == (sub + ary[j])) {
						lists.add(ary[k]);
						j = k;
						count++;
					}
				}
				if (count > max) {

					result.clear();
					max = count;
					result.addAll(lists);
					lists.clear();
				}
				if (count == max) {
					subs.add(sub);
				}
				lists.clear();
			}
			lists.clear();
		}
		return result;
	}
}
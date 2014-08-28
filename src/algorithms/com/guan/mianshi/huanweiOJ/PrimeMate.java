package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	�������������ĺ�Ϊ����������������������֮Ϊ���������¡�����2��5��6��13��������Ӧ����ͨ�ż��ܡ���������ѧ���������һ�����򣬴����е�N��NΪż����������������ѡ�����ɶ���ɡ��������¡�����ѡ�������ֶ�����������4����������2��5��6��13�������5��6��Ϊһ����ֻ�ܵõ�һ�顰�������¡�������2��5��6��13���齫�õ����顰�������¡�������ɡ��������¡����ķ�����Ϊ����ѷ���������Ȼ����ѧ��ϣ����Ѱ�ҳ�����ѷ�������
	����:
	��һ����ż��N��N��100������ʾ����ѡ����Ȼ���ĸ��������������������֣���ΧΪ[2,30000]��
	���:
	���һ������K����ʾ����õġ���ѷ�������ɡ��������¡��Ķ�����
	֪ʶ�㣺����,����,����
	��  �룺 
	1 ����һ����ż��n
	2 ����n������
	��  ���� 
		��õġ���ѷ�������ɡ��������¡��Ķ�����

 * @author guanxiangqing
 *
 */
public class PrimeMate {

	private static Scanner sc;

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void sort(int[] arr) {
		int len = arr.length;
		int[] num = new int[len];
		for (int i = 0; i < len; i++) {
			num[i] = 0;
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (isPrime(arr[i] + arr[j])) {
					num[i]++;
				}
			}

		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (num[i] > num[j]) {
					int temp1 = num[i];
					num[i] = num[j];
					num[j] = temp1;

					int temp2 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp2;
				}
			}
		}
	}

	public static int getMax(int[] arr) {
		int count = 0;
		int len = arr.length;
		List<Integer> list = new ArrayList<Integer>();
		sort(arr);
		for (int i = 0; i < len; i++) {
			list.add(arr[i]);
		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (isPrime(list.get(i) + list.get(j))) {
					// System.out.println(list.get(i)+" "+list.get(j));
					len--;
					// System.out.println(list.get(0));
					list.remove(j);
					// System.out.println("----"+list.remove(j));

					count++;
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 != 0) {
			System.out.println("error!");
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);

		System.out.println(getMax(arr));

		/*
		 * List<Integer> alist = new ArrayList<Integer>(); alist.add(1);
		 * alist.add(2); alist.add(3); alist.add(4);
		 * 
		 * System.out.println(alist.get(0));
		 */
	}
}
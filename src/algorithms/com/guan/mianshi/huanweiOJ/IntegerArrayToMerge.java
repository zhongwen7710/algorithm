package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	�������������鰴������ϲ������ҹ��˵��ظ�����Ԫ��
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	voidCombineBySort(int* pArray1,intiArray1Num,int* pArray2,intiArray2Num,int* pOutputArray, int* iOutputNum);
	���������
	    int* pArray1 ����������1
	     intiArray1Num������1Ԫ�ظ���
	     int* pArray2 ����������2
	     intiArray2Num������2Ԫ�ظ���
	���������ָ��ָ����ڴ�����֤��Ч����
	    int* pOutputArray���ϲ��������
	     int* iOutputNum���ϲ�������Ԫ�ظ���
	����ֵ��
	    void
	֪ʶ�㣺����,����
	��  �룺 
	����˵����������˳�����룺
	1 �����һ������ĸ���
	2 �����һ���������ֵ
	3 ����ڶ�������ĸ���
	4 ����ڶ����������ֵ
	��  ���� 
		����ϲ�֮�������

 * @author guanxiangqing
 *
 */
public class IntegerArrayToMerge {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int length = cin.nextInt();
		int array1[] = new int[length];
		for (int i = 0; i < length; i++) {
			array1[i] = cin.nextInt();
		}
		bublesort(array1);
		length = cin.nextInt();
		int array2[] = new int[length];
		for (int i = 0; i < length; i++) {
			array2[i] = cin.nextInt();
		}
		bublesort(array2);

		int array3[] = new int[array1.length + array2.length];
		int a = 0, b = 0, m = 0;
		for (m = 0; (a < array1.length && b < array2.length);) {
			if (m == 0) {
				if (array1[a] < array2[b]) {
					array3[m] = array1[a];
					a++;
				} else if (array1[a] == array2[b]) {
					array3[m] = array1[a];
					a++;
					b++;
				} else {
					array3[m] = array2[b];
					b++;
				}
				m++;
			} else {
				if (array1[a] < array2[b]) {
					if (array3[m - 1] != array1[a]) {
						array3[m] = array1[a];
						m++;
					}
					a++;
				} else if (array1[a] == array2[b]) {
					if (array3[m - 1] != array1[a]) {
						array3[m] = array1[a];
						m++;
					}
					// array3[m] = array1[a];
					a++;
					b++;
				} else {
					if (array3[m - 1] != array2[b]) {
						array3[m] = array2[b];
						m++;
					}
					// array3[m] = array2[b];
					b++;
				}
			}
		}
		if ((array1.length > 0) && (array2.length > 0)) {
			if (a == array1.length) {
				for (int i = b; i < array2.length; i++) {
					if (array3[m - 1] != array2[i]) {
						array3[m] = array2[i];
						m++;
					}
					// array3[m] = array2[i];
				}
			}
			if (b == array2.length) {
				for (int i = a; i < array1.length; i++) {
					if (array3[m - 1] != array1[i]) {
						array3[m] = array1[i];
						m++;
					}
				}
			}
		} else if ((array1.length == 0) && (array2.length == 0)) {

		} else {
			if (array1.length == 0) {
				array3[0] = array2[0];
				m++;
				for (int i = 1; i < array2.length; i++) {
					if (array3[m - 1] != array2[i]) {
						array3[m] = array2[i];
						m++;
					}
				}
			} else {
				array3[0] = array1[0];
				m++;
				for (int i = 1; i < array1.length; i++) {
					if (array3[m - 1] != array1[i]) {
						array3[m] = array1[i];
						m++;
					}
				}
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.print(array3[i]);
		}
	}

	static void bublesort(int a[]) {
		for (int i = 0; i < a.length - 1; i++)
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
	}
}
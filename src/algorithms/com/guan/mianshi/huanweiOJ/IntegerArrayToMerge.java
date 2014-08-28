package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	将两个整型数组按照升序合并，并且过滤掉重复数组元素
	详细描述：
	接口说明
	原型：
	voidCombineBySort(int* pArray1,intiArray1Num,int* pArray2,intiArray2Num,int* pOutputArray, int* iOutputNum);
	输入参数：
	    int* pArray1 ：整型数组1
	     intiArray1Num：数组1元素个数
	     int* pArray2 ：整型数组2
	     intiArray2Num：数组2元素个数
	输出参数（指针指向的内存区域保证有效）：
	    int* pOutputArray：合并后的数组
	     int* iOutputNum：合并后数组元素个数
	返回值：
	    void
	知识点：排序,数组
	输  入： 
	输入说明，按下列顺序输入：
	1 输入第一个数组的个数
	2 输入第一个数组的数值
	3 输入第二个数组的个数
	4 输入第二个数组的数值
	输  出： 
		输出合并之后的数组

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
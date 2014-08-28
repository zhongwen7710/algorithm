package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���A�Ǹ�x��y�еľ���B�Ǹ�y��z�еľ��󣬰�A��B��ˣ�����������һ��x��z�еľ���C����������ÿ��Ԫ����������Ĺ�ʽ�����ģ�
ԭ�ͣ�
voidmatrix_multiply(int *m1,int *m2,int *r, int x, int y, int z);
���������
    int *m1��x��y�еľ���(array1[x][y])
    int *m2��y��z�еľ���(array2[y][z])
    int x������m1������
    int y������m1������/����m2������
    int z������m2������
 
���������
    int *r������m1, m2��˵Ľ��(array3[x][z])
 
����ֵ��
        void
֪ʶ�㣺ѭ��,����
��  �룺 
����˵����
1����һ�����������
2����һ������������͵ڶ������������
3���ڶ������������
4����һ�������ֵ
5���ڶ��������ֵ
��  �����������������˵Ľ��

 * @author guanxiangqing
 *
 */
public class MatrixMultiplication {

	public static void multiply(int[][] arr1, int[][] arr2) {
		if (arr1[0].length != arr2.length) {
			return;
		} else {
			int x = arr1.length;
			int y = arr1[0].length;
			int z = arr2[0].length;

			int[][] arr3 = new int[x][z];
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < z; j++) {
					for (int k = 0; k < y; k++) {
						arr3[i][j] += arr1[i][k] * arr2[k][j];
					}
				}
			}
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < z; j++) {
					if (j == z - 1) {
						System.out.print(arr3[i][j]);
					} else {
						System.out.print(arr3[i][j] + " ");
					}
				}
				System.out.println();
			}

			/*
			 * for (int[] is : arr3) { for (int i : is) {
			 * System.out.print(i+" "); } System.out.println(); }
			 */

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int[][] arr1 = new int[x][y];
		int[][] arr2 = new int[y][z];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		multiply(arr1, arr2);

		sc.close();

		/*
		 * int[][] arr1 = {{3,8},{8,0}}; int[][] arr2 = {{9,0},{18,9}};
		 */

	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	如果A是个x行y列的矩阵，B是个y行z列的矩阵，把A和B相乘，其结果将是另一个x行z列的矩阵C。这个矩阵的每个元素是由下面的公式决定的：
原型：
voidmatrix_multiply(int *m1,int *m2,int *r, int x, int y, int z);
输入参数：
    int *m1：x行y列的矩阵(array1[x][y])
    int *m2：y行z列的矩阵(array2[y][z])
    int x：矩阵m1的行数
    int y：矩阵m1的列数/矩阵m2的行数
    int z：矩阵m2的列数
 
输出参数：
    int *r：矩阵m1, m2相乘的结果(array3[x][z])
 
返回值：
        void
知识点：循环,数组
输  入： 
输入说明：
1、第一个矩阵的行数
2、第一个矩阵的列数和第二个矩阵的行数
3、第二个矩阵的列数
4、第一个矩阵的值
5、第二个矩阵的值
输  出：输出两个矩阵相乘的结果

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
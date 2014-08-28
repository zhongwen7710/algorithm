package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
	样例输入
	5
	样例输出
	1 3 6 10 15
	2 5 9 14
	4 8 13
	7 12
	11
	接口说明
	原型
	void GetResult(int Num, char * pResult);
	输入参数：
	        int Num：输入的正整数N
	输出参数：
	        int * pResult：指向存放蛇形矩阵的字符串指针
	        指针指向的内存区域保证有效
	返回值：
	        void
	知识点： 数组
	输  入： 输入正整数N（N不大于100）
	输  出： 输出一个N行的蛇形矩阵。
 * @author guanxiangqing
 *
 */
public class SerpentineMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		int[][] a = new int[n][n];
		int seed = 1;
		for (int m = 0; m < n; m++) {
			for (int i = m, j = 0; i >= 0 && j <= m; i--, j++) {
				a[i][j] = seed;
				seed++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != 0) {
					if (j == 0) {
						System.out.print(a[i][j]);
					} else {
						System.out.print(" " + a[i][j]);
					}
				}
			}
			System.out.println("");
		}
	}
}

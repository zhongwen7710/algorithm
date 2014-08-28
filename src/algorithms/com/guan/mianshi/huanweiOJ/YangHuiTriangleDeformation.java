package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	        1
         1  1  1
      1  2  3  2  1
   1  3  6  7  6  3  1
1  4  10 16 19  16 10  4  1
	以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
	求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
	 
	输入n(n <= 1000000000)<> 
	 
	 public static  int run(int x)
	{
	        return -1;
	 }
	 
	<= 1000000000)<><= 1000000000)<><= 1000000000)<><= 1000000000)<>
	<= 1000000000)<><= 1000000000)<>
	<= 1000000000)<>
	<= 1000000000)<>
	 
	<= 1000000000)<><= 1000000000)<>
	<= 1000000000)<>
	<= 1000000000)<>
	 
	<= 1000000000)<>
	<= 1000000000)<>
	 
	<= 1000000000)<>

 * @author guanxiangqing
 *
 */
public class YangHuiTriangleDeformation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(run(sc.nextInt()));
		sc.close();
	}

	public static int run(int n) {
		int result = -1;
		int mat[][] = new int[n][];
		int i, j, k = 0;
		for (i = 0; i < n; i++) {
			mat[i] = new int[2 * (i + 1) - 1];
			mat[i][0] = 1;
			for (j = 1; j < 2 * (i + 1) - 1; j++) {
				if (j <= i) {
					if (j - 2 < 0) {
						if (j < mat[i - 1].length) {
							mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];
						} else {
							mat[i][j] = mat[i - 1][j - 1];
						}
					} else {
						mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1]
								+ mat[i - 1][j - 2];
					}
					k = j;
				} else {
					mat[i][j] = mat[i][--k];
				}
			}
		}
		for (j = 0; j < mat[n - 1].length; j++) {
			if (mat[n - 1][j] % 2 == 0) {
				result = j + 1;
				break;
			}
		}
		return result;
	}
}

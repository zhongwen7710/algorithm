package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
	知识点： 语言基础,字符串,循环,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
	输  入： 输入两个正整数
	输  出： 返回结果

 * @author guanxiangqing
 *
 */
public class Level_23_201301JavaSubject {

	public static int count(int m, int n) {
		if (1 == m)
			return n + 1;
		if (1 == n)
			return m + 1;
		else
			return count(m - 1, n) + count(m, n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.print(count(m, n));

	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
	输入
	每个用例包含二个整数M和N。0<=m<=10，1<=n<=10。<=n<=10<=m<=10
	 
	样例输入
	7 3
	样例输出
	8
	     * 计算放苹果方法数目
	     * 输入值非法时返回-1
	     * 1 <= m,n <= 10<><= m,n <= 10<>
	     * @param m 苹果数目
	     * @param n 盘子数目数
	     * @return 放置方法总数
	     * 
	    public static int count(int m, int n)
	知识点：循环
	输  入：输入两个int整数
	输  出：输出结果，int型

 * @author guanxiangqing
 *
 */
public class PutTheApple {

	public static int count(int appleNum, int plateNum) {

		if (appleNum == 0 || plateNum == 1) {
			return 1;
		}
		if (appleNum < plateNum) {
			return count(appleNum, appleNum);
		} else {
			return count(appleNum, plateNum - 1)
					+ count(appleNum - plateNum, plateNum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int appleNum = sc.nextInt();
		int plateNum = sc.nextInt();
		System.out.println(count(appleNum, plateNum));
	}
}
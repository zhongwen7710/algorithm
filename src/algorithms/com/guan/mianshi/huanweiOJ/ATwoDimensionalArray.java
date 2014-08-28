package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	有一个数据表格为二维数组（数组元素为int类型），行长度为ROW_LENGTH,列长度为COLUMN_LENGTH。对该表格中数据的操作可以在单个单元内，也可以对一个整行或整列进行操作，操作包括交换两个单元中的数据；插入某些行或列。 
	    请编写程序，实现对表格的各种操作，并跟踪表格中数据在进行各种操作时，初始数据在表格中位置的变化轨迹。
	 
	详细要求:
	     
	1.数据表规格的表示方式为“行*列”, 数据表元素的位置表示方式为[行,列]，行列均从0开始编号
	2.数据表的最大规格为9行*9列，对表格进行操作时遇到超出规格应该返回错误
	3.插入操作时，对m*n表格，插入行号只允许0~m，插入列号只允许0~n。超出范围应该返回错误
	4.只需记录初始表格中数据的变化轨迹，查询超出初始表格的数据应返回错误
	例如:  初始表格为4*4，可查询的元素范围为[0,0]~[3,3]，假设插入了第2行，数组变为5*4，查询元素[4,0]时应该返回错误
	5.查询数据要求返回一个链表，链表中节点的顺序即为该查询的数据在表格中的位置变化顺序（需包含初始位置）
	知识点：数组
	输  入： 
	输入数据按下列顺序输入：
	1 表格的行列值
	2 要交换的两个单元格的行列值
	3 输入要插入的行的数值
	4 输入要插入的列的数值
	5 输入要获取运动轨迹的单元格的值
	输  出： 
	输出按下列顺序输出：
	1 初始化表格是否成功，若成功则返回0， 否则返回-1
	2 输出交换单元格是否成功
	3 输出插入行是否成功
	4 输出插入列是否成功
	5 输出要查询的运动轨迹的单元查询是否成功

 * @author 
 *
 */
public class ATwoDimensionalArray {

	public static void main(String[] args) {
		// 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		// 行
		int h = scanner.nextInt();
		// 列
		int l = scanner.nextInt();
		// 调换第一个单元行
		int oneRh = scanner.nextInt();
		// 调换第一个单元列
		int oneRl = scanner.nextInt();
		// 调换第二个单元行
		int twoRh = scanner.nextInt();
		// 调换第二个单元列
		int twoRl = scanner.nextInt();
		// 插入行数
		int insertH = scanner.nextInt();
		// 插入列数
		int insertL = scanner.nextInt();
		// 跟踪运动轨迹的行数
		int gh = scanner.nextInt();
		// 跟踪运动轨迹的列数
		int gl = scanner.nextInt();
		boolean isok = true;

		if (gh > h || gl > l) {
			isok = false;
		}

		if (h + 1 > 9 || l + 1 > 9) {
			System.out.println("-1");
		} else {
			System.out.println("0");
		}

		// 判断调换的单元是否可以调换
		if (oneRh > h || oneRl > l || twoRh > h || twoRl > l) {
			System.out.println("-1");

		} else {
			System.out.println("0");
			if (isok) {
				if (oneRh == gh && oneRl == gl) {
					gh = twoRh;
					gl = twoRl;
				} else if (twoRh == gh && twoRl == gl) {
					gh = oneRh;
					gl = oneRl;
				} else {
					// System.out.println("跟踪的元素没有被替换");
				}
			}
		}

		// 判断是否可以插入行
		if (insertH < 0 || insertH > h + 1) {
			System.out.println("-1");

		} else {
			h = h + 1;
			if (h + 1 > 9) {
				h = h - 1;
				System.out.println("-1");
			} else {
				System.out.println("0");
				if (isok) {
					if (insertH < gh) {
						gh++;
						if (gh > h - 1) {
							isok = false;
						}
					}
				}
			}
		}

		// 判断是否可以插入列
		if (insertL < 0 || insertL > l + 1) {
			System.out.println("-1");
		} else {
			l = l + 1;
			if (l + 1 > 9) {
				l = l - 1;
				System.out.println("-1");
			} else {
				System.out.println("0");
				if (isok) {
					if (insertL < gl) {
						gl++;
						if (gl > l - 1) {
							isok = false;
						}
					}
				}
			}
		}

		if (isok) {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}

	}

}
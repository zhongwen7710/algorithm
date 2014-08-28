package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/*详细要求: 

 1.数据表规格的表示方式为“行*列”, 数据表元素的位置表示方式为[行,列]，行列均从0开始编号 
 2.数据表的最大规格为9行*9列，对表格进行操作时遇到超出规格应该返回错误 
 3.插入操作时，对m*n表格，插入行号只允许0~m，插入列号只允许0~n。超出范围应该返回错误 
 4.只需记录初始表格中数据的变化轨迹，查询超出初始表格的数据应返回错误 
 例如:  初始表格为4*4，可查询的元素范围为[0,0]~[3,3]，假设插入了第2行，数组变为5*4，查询元素[4,0]时应该返回错误 
 5.查询数据要求返回一个链表，链表中节点的顺序即为该查询的数据在表格中的位置变化顺序（需包含初始位置） 
 */
public class ATwoDimensionalArray3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] result = new int[5];
		int m = cin.nextInt();
		int n = cin.nextInt();

		if (m > 0 && n > 0) {
			result[0] = 0;
		} else {
			result[0] = -1;
		}

		int exm = cin.nextInt();
		int exn = cin.nextInt();
		int exm1 = cin.nextInt();
		int exn1 = cin.nextInt();
		if (exm >= 0 && exm < m && exm < n && exm < 9 && exn >= 0 && exn < n
				&& exn < m && exn < 9 && exm1 >= 0 && exm1 < m && exm1 < n
				&& exm1 < 9 && exn1 >= 0 && exn1 < n && exn1 < m && exn1 < 9) {
			result[1] = 0;
		} else {
			result[1] = -1;
		}

		int inm = cin.nextInt();
		if (inm >= 0 && inm < m) {
			result[2] = 0;
		} else {
			result[2] = -1;
		}

		int inn = cin.nextInt();
		if (inn >= 0 && inn < n) {
			result[3] = 0;
		} else {
			result[3] = -1;
		}

		int dom = cin.nextInt();
		int don = cin.nextInt();
		if (dom >= 0 && dom < m && don >= 0 && don < n) {
			result[4] = 0;
		} else {
			result[4] = -1;
		}

		for (int i = 0; i < 5; i++) {
			if (i != 4) {
				System.out.println(result[i]);
			} else {
				System.out.print(result[i]);
			}
		}
	}
}

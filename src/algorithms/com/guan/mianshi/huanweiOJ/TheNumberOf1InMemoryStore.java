package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	输入一个int型数据，计算出该int型数据在内存中存储时1的个数。
	知识点：字符串,查找
	输  入：输入一个整数（int类型）
	输  出：这个数转换成2进制后，输出1的个数
 * @author guanxiangqing
 *
 */
public class TheNumberOf1InMemoryStore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toBinaryString(n);
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);

		sc.close();

	}
}
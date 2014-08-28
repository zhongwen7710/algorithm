package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。编辑距离的算法是首先由俄国科学家Levenshtein提出的，故又叫Levenshtein Distance。
	Ex：
	字符串A:abcdefg
	字符串B: abcdef
	通过增加或是删掉字符”g”的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
	要求：
	给定任意两个字符串，写出一个算法计算它们的编辑距离。
	 
	请实现如下接口
	功能：计算两个字符串的距离
	输入：字符串A和字符串B
	输出：无
	返回：如果成功计算出字符串的距离，否则返回-1
	
	    public static int calStringDistance (String charA, String  charB)
	    {
	       return 0;
	    }
 * @author guanxiangqing
 *
 */
public class CalculateTheDistanceOfTheString {

	public static int min(int a, int b, int c) {

		return a > b ? (b > c ? c : b) : (a > c ? c : a);
	}

	public static int calStringDistance(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int[][] d = new int[m + 1][n + 1];
		int i = 0;
		int j = 0;
		char ch1;
		char ch2;

		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}
		for (i = 0; i <= m; i++) {
			d[i][0] = i;
		}
		for (j = 0; j <= n; j++) {
			d[0][j] = j;
		}

		for (i = 1; i <= m; i++) {
			for (j = 1; j <= n; j++) {
				d[i][j] = min(
						d[i - 1][j - 1]
								+ (str1.charAt(i - 1) == str2.charAt(j - 1) ? 0
										: 1), d[i - 1][j] + 1, d[i][j - 1] + 1);
			}
		}

		return d[m][n];
	}

	public static void main(String[] args) {

		// System.out.println(min(4,5,3));
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(calStringDistance(str1, str2));
		sc.close();

	}
}
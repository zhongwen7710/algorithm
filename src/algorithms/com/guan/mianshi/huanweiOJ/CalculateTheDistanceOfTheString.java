package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	Levenshtein ���룬�ֳƱ༭���룬ָ���������ַ���֮�䣬��һ��ת������һ����������ٱ༭������������ɵı༭����������һ���ַ��滻����һ���ַ�������һ���ַ���ɾ��һ���ַ����༭������㷨�������ɶ����ѧ��Levenshtein����ģ����ֽ�Levenshtein Distance��
	Ex��
	�ַ���A:abcdefg
	�ַ���B: abcdef
	ͨ�����ӻ���ɾ���ַ���g���ķ�ʽ�ﵽĿ�ġ������ַ�������Ҫһ�β������������������Ҫ�Ĵ�������Ϊ�����ַ����ľ��롣
	Ҫ��
	�������������ַ�����д��һ���㷨�������ǵı༭���롣
	 
	��ʵ�����½ӿ�
	���ܣ����������ַ����ľ���
	���룺�ַ���A���ַ���B
	�������
	���أ�����ɹ�������ַ����ľ��룬���򷵻�-1
	
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
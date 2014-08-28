package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	���ڲ�ͬ���ַ���������ϣ�����а취�ж����Ƴ̶ȣ����Ƕ�����һ�ײ�������������������ͬ���ַ��������ͬ������Ĳ����������£�
	1 �޸�һ���ַ�����ѡ�a���滻Ϊ��b����
	2 ����һ���ַ�����ѡ�abdd����Ϊ��aebdd����
	3 ɾ��һ���ַ�����ѡ�travelling����Ϊ��traveling����
	���磬���ڡ�abcdefg���͡�abcdef�������ַ�����˵��������Ϊ����ͨ�����Ӻͼ���һ����g���ķ�ʽ���ﵽĿ�ġ���������ַ�������ֻ��Ҫһ�β������������������Ҫ�Ĵ�������Ϊ�����ַ����ľ��룬�����ƶȵ��ڡ����룫1���ĵ�����Ҳ����˵����abcdefg���͡�abcdef���ľ���Ϊ1�����ƶ�Ϊ1/2=0.5.
	�������������ַ��������Ƿ���д��һ���㷨����������ǵ����ƶ��أ�
	 
	��ʵ�����½ӿ�
	���ܣ������ַ��������ƶ�
	���룺pucAExpression/ pucBExpression���ַ�����ʽ����: "abcdef"
	���أ��ַ��������ƶ�,���ƶȵ��ڡ����룫1���ĵ���,�������1/�ַ�������ʽ,��1/2
	
	 public static  String  calculateStringDistance(String expressionA, String expressionB)
	 {
	     // ��ʵ��
	     return null;
	 }
	 
	Լ����
	1��PucAExpression/ PucBExpression�ַ����е���Ч�ַ�����26��Сд��ĸ��
	2��PucAExpression/ PucBExpression�������ʽ����Ч���ɵ����߱�֤;
	3������result��Χ������Ϣ�޷���ȷ���ģ�����null��
 * @author guanxiangqing
 *
 */
public class ComputingSimilarityOfTheString {

	public static int min(int a, int b, int c) {
		return a > b ? b > c ? c : b : a < c ? a : c;
	}

	public static int calculateStringDistance(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int[][] d = new int[m + 1][n + 1];

		if (n == 0) {
			return m;
		}

		if (m == 0) {
			return n;
		}

		for (int i = 0; i <= m; i++) {
			d[i][0] = i;
		}
		for (int j = 0; j <= n; j++) {
			d[0][j] = j;
		}

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				d[i][j] = min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1]
						+ (str1.charAt(i - 1) == str2.charAt(j - 1) ? 0 : 1));
			}
		}

		return d[m][n];
	}

	public static void main(String[] args) {

		// System.out.println(calculateStringDistance("abcdefg","abcdf"));
		// System.out.println(min(6,4,1));
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(1 + "/" + (calculateStringDistance(str1, str2) + 1));
	}
}
package algorithms.com.guan.mianshi;

import java.util.Scanner;

/**
 * �ҳ������ַ���������������Ӵ��ĳ���
 * 
 * @author guanxiangqing
 * 
 */
public class MaxLongestCommonSubstring {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		// int lengthnum = longestCommonSubstring(str1, str2);
		
		//int lengthnum = longestCommonSubstring2(str1, str2);
		
		int lengthnum = longestCommonSubstring3(str1, str2);
		System.out.println(lengthnum);
		
		

	}

	/**
	 * ����һ���������
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int longestCommonSubstring(String str1, String str2) {
		int i, j, k, len1, len2, max, x = 0, y = 0;
		len1 = str1.length();
		len2 = str2.length();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int c[][] = new int[len1 + 1][len2 + 1]; // ����һ��(len1+1)*(len2+1)����

		for (i = 0; i < len1 + 1; i++)
			c[i][0] = 0; // ��0�ж���ʼ��Ϊ0
		for (j = 0; j < len2 + 1; j++)
			c[0][j] = 0; // ��0�ж���ʼ��Ϊ0
		max = -1;
		for (i = 1; i < len1 + 1; i++) {
			for (j = 1; j < len2 + 1; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) // ֻ��Ҫ�����Ϸ���c[i-1][j-1]�ȽϾͿ�����
					c[i][j] = c[i - 1][j - 1] + 1;
				else
					// ��������ʱ��Ҫ����ߵ�c[i][j-1]���ϱߵ�c[i-1][j]ֵ�Ƚϣ����ﲻ��Ҫ
					c[i][j] = 0;
				if (c[i][j] > max) {
					max = c[i][j];
					x = i;
					y = j;
				}
			}
		}

		// char s[]= new char[1000];
		// k=max;
		// i = x - 1;
		// j = y - 1;
		// while (i >= 0 && j >= 0) {
		// if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
		// s[k--]=str1.charAt(i);
		// i--;
		// j--;
		// } else
		// // ֻҪ��һ������ȣ���˵����ȵĹ����ַ����ˣ���������
		// break;
		// }

		k = max;
		i = x - 1;
		j = y - 1;
		String substring;
		System.out.println("K��ֵΪ��" + k);
		// System.out.println("i��ֵΪ��"+i);
		System.out.println("j��ֵΪ��" + j);

		substring = str2.substring(j - k + 1, j + 1);

		System.out.println(substring);
		return max;

	}

	// ��ΪOJ�ύ�Ĵ�1�����Բ��ԣ�
	public static int longestCommonSubstring0(String str1, String str2) {
		int i, j, len1, len2, max;
		len1 = str1.length();
		len2 = str2.length();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int c[][] = new int[len1 + 1][len2 + 1]; // ����һ��(len1+1)*(len2+1)����

		for (i = 0; i < len1 + 1; i++)
			c[i][0] = 0; // ��0�ж���ʼ��Ϊ0
		for (j = 0; j < len2 + 1; j++)
			c[0][j] = 0; // ��0�ж���ʼ��Ϊ0
		max = -1;
		for (i = 1; i < len1 + 1; i++) {
			for (j = 1; j < len2 + 1; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) // ֻ��Ҫ�����Ϸ���c[i-1][j-1]�ȽϾͿ�����
					c[i][j] = c[i - 1][j - 1] + 1;
				else
					// ��������ʱ��Ҫ����ߵ�c[i][j-1]���ϱߵ�c[i-1][j]ֵ�Ƚϣ����ﲻ��Ҫ
					c[i][j] = 0;
				if (c[i][j] > max) {
					max = c[i][j];
				}
			}
		}

		return max;
	}

	/**
	 * ���������߶�ԭ��
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int longestCommonSubstring2(String str1, String str2) {
		int i, len1, len2, len, s1_start, s2_start, idx, curmax, max;
		len1 = str1.length();
		len2 = str2.length();
		len = len1 + len2;
		max = 0;

		// ������ַ������������ִ�Сд���ȵý�����Ϸ����
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		for (i = 0; i < len; i++) {
			s1_start = s2_start = 0;
			if (i < len1)
				s1_start = len1 - i; // ÿ�ο�ʼƥ�����ʼλ��
			else
				s2_start = i - len1;
			curmax = 0;
			for (idx = 0; (s1_start + idx < len1) && (s2_start + idx < len2); idx++) {
				if (str1.charAt(s1_start + idx) == str2.charAt(s2_start + idx))
					curmax++;
				else {
					// ֻҪ��һ������ȣ���˵����ȵĹ����ַ����ˣ��������ˣ�Ҫ����curmax��max�е����ֵ������curmax����Ϊ0
					max = curmax > max ? curmax : max;
					curmax = 0;
				}
			}
			max = curmax > max ? curmax : max;
		}
		return max;
	}

	public static int longestCommonSubstring3(String str1, String str2) {
		int MaxNum = 0;
	
		return MaxNum;
	}
}

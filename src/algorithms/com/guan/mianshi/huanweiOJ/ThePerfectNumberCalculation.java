package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
	�����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
	���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
	��������count(int n),���ڼ���n����(��n)��ȫ���ĸ��������㷶Χ, 0 < n <= 500000
	����n������ȫ���ĸ������쳣�������-1
	 //count(int n)�����Ϣ
	 * ��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
	 * �����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
	 * ���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
	 * 
	 * ��������count(int n),���ڼ���n����(��n)��ȫ���ĸ���
	 * @param n ���㷶Χ, 0 < n <= 500000
	 * @return n������ȫ���ĸ���, �쳣�������-1
	
	public static int count(int n)
 * @author guanxiangqing
 *
 */
public class ThePerfectNumberCalculation {
	public static boolean judge(int n) {
		int result = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				result = result + i;
			}
		}
		return result == n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		if (n > 0 && n <= 500000) {
			for (int i = 1; i <= n; i++) {
				if (judge(i)) {
					result++;
				}
			}
			System.out.print(result);
		} else {
			System.out.print("-1");
		}
	}
}
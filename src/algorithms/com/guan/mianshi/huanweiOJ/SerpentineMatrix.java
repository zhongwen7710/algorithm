package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���ξ�������1��ʼ����Ȼ���������гɵ�һ�������������Ρ�
	��������
	5
	�������
	1 3 6 10 15
	2 5 9 14
	4 8 13
	7 12
	11
	�ӿ�˵��
	ԭ��
	void GetResult(int Num, char * pResult);
	���������
	        int Num�������������N
	���������
	        int * pResult��ָ�������ξ�����ַ���ָ��
	        ָ��ָ����ڴ�����֤��Ч
	����ֵ��
	        void
	֪ʶ�㣺 ����
	��  �룺 ����������N��N������100��
	��  ���� ���һ��N�е����ξ���
 * @author guanxiangqing
 *
 */
public class SerpentineMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		int[][] a = new int[n][n];
		int seed = 1;
		for (int m = 0; m < n; m++) {
			for (int i = m, j = 0; i >= 0 && j <= m; i--, j++) {
				a[i][j] = seed;
				seed++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != 0) {
					if (j == 0) {
						System.out.print(a[i][j]);
					} else {
						System.out.print(" " + a[i][j]);
					}
				}
			}
			System.out.println("");
		}
	}
}

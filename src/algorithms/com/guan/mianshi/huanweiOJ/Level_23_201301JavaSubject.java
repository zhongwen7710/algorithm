package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���дһ�����������������Ӻ�����������n x m�����̸��ӣ�nΪ����ĸ�������mΪ����ĸ����������Ÿ��Ա�Ե�ߴ����Ͻ��ߵ����½ǣ��ܹ��ж������߷���Ҫ�����߻�ͷ·������ֻ�����Һ������ߣ���������������ߡ�
	֪ʶ�㣺 ���Ի���,�ַ���,ѭ��,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
	��  �룺 ��������������
	��  ���� ���ؽ��

 * @author guanxiangqing
 *
 */
public class Level_23_201301JavaSubject {

	public static int count(int m, int n) {
		if (1 == m)
			return n + 1;
		if (1 == n)
			return m + 1;
		else
			return count(m - 1, n) + count(m, n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.print(count(m, n));

	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/*��ϸҪ��: 

 1.���ݱ���ı�ʾ��ʽΪ����*�С�, ���ݱ�Ԫ�ص�λ�ñ�ʾ��ʽΪ[��,��]�����о���0��ʼ��� 
 2.���ݱ�������Ϊ9��*9�У��Ա����в���ʱ�����������Ӧ�÷��ش��� 
 3.�������ʱ����m*n��񣬲����к�ֻ����0~m�������к�ֻ����0~n��������ΧӦ�÷��ش��� 
 4.ֻ���¼��ʼ��������ݵı仯�켣����ѯ������ʼ��������Ӧ���ش��� 
 ����:  ��ʼ���Ϊ4*4���ɲ�ѯ��Ԫ�ط�ΧΪ[0,0]~[3,3]����������˵�2�У������Ϊ5*4����ѯԪ��[4,0]ʱӦ�÷��ش��� 
 5.��ѯ����Ҫ�󷵻�һ�����������нڵ��˳��Ϊ�ò�ѯ�������ڱ���е�λ�ñ仯˳���������ʼλ�ã� 
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

package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��һ�����ݱ��Ϊ��ά���飨����Ԫ��Ϊint���ͣ����г���ΪROW_LENGTH,�г���ΪCOLUMN_LENGTH���Ըñ�������ݵĲ��������ڵ�����Ԫ�ڣ�Ҳ���Զ�һ�����л����н��в�����������������������Ԫ�е����ݣ�����ĳЩ�л��С� 
	    ���д����ʵ�ֶԱ��ĸ��ֲ����������ٱ���������ڽ��и��ֲ���ʱ����ʼ�����ڱ����λ�õı仯�켣��
	 
	��ϸҪ��:
	     
	1.���ݱ���ı�ʾ��ʽΪ����*�С�, ���ݱ�Ԫ�ص�λ�ñ�ʾ��ʽΪ[��,��]�����о���0��ʼ���
	2.���ݱ�������Ϊ9��*9�У��Ա����в���ʱ�����������Ӧ�÷��ش���
	3.�������ʱ����m*n��񣬲����к�ֻ����0~m�������к�ֻ����0~n��������ΧӦ�÷��ش���
	4.ֻ���¼��ʼ��������ݵı仯�켣����ѯ������ʼ��������Ӧ���ش���
	����:  ��ʼ���Ϊ4*4���ɲ�ѯ��Ԫ�ط�ΧΪ[0,0]~[3,3]����������˵�2�У������Ϊ5*4����ѯԪ��[4,0]ʱӦ�÷��ش���
	5.��ѯ����Ҫ�󷵻�һ�����������нڵ��˳��Ϊ�ò�ѯ�������ڱ���е�λ�ñ仯˳���������ʼλ�ã�
	֪ʶ�㣺����
	��  �룺 
	�������ݰ�����˳�����룺
	1 ��������ֵ
	2 Ҫ������������Ԫ�������ֵ
	3 ����Ҫ������е���ֵ
	4 ����Ҫ������е���ֵ
	5 ����Ҫ��ȡ�˶��켣�ĵ�Ԫ���ֵ
	��  ���� 
	���������˳�������
	1 ��ʼ������Ƿ�ɹ������ɹ��򷵻�0�� ���򷵻�-1
	2 ���������Ԫ���Ƿ�ɹ�
	3 ����������Ƿ�ɹ�
	4 ����������Ƿ�ɹ�
	5 ���Ҫ��ѯ���˶��켣�ĵ�Ԫ��ѯ�Ƿ�ɹ�

 * @author 
 *
 */
public class ATwoDimensionalArray {

	public static void main(String[] args) {
		// �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		// ��
		int h = scanner.nextInt();
		// ��
		int l = scanner.nextInt();
		// ������һ����Ԫ��
		int oneRh = scanner.nextInt();
		// ������һ����Ԫ��
		int oneRl = scanner.nextInt();
		// �����ڶ�����Ԫ��
		int twoRh = scanner.nextInt();
		// �����ڶ�����Ԫ��
		int twoRl = scanner.nextInt();
		// ��������
		int insertH = scanner.nextInt();
		// ��������
		int insertL = scanner.nextInt();
		// �����˶��켣������
		int gh = scanner.nextInt();
		// �����˶��켣������
		int gl = scanner.nextInt();
		boolean isok = true;

		if (gh > h || gl > l) {
			isok = false;
		}

		if (h + 1 > 9 || l + 1 > 9) {
			System.out.println("-1");
		} else {
			System.out.println("0");
		}

		// �жϵ����ĵ�Ԫ�Ƿ���Ե���
		if (oneRh > h || oneRl > l || twoRh > h || twoRl > l) {
			System.out.println("-1");

		} else {
			System.out.println("0");
			if (isok) {
				if (oneRh == gh && oneRl == gl) {
					gh = twoRh;
					gl = twoRl;
				} else if (twoRh == gh && twoRl == gl) {
					gh = oneRh;
					gl = oneRl;
				} else {
					// System.out.println("���ٵ�Ԫ��û�б��滻");
				}
			}
		}

		// �ж��Ƿ���Բ�����
		if (insertH < 0 || insertH > h + 1) {
			System.out.println("-1");

		} else {
			h = h + 1;
			if (h + 1 > 9) {
				h = h - 1;
				System.out.println("-1");
			} else {
				System.out.println("0");
				if (isok) {
					if (insertH < gh) {
						gh++;
						if (gh > h - 1) {
							isok = false;
						}
					}
				}
			}
		}

		// �ж��Ƿ���Բ�����
		if (insertL < 0 || insertL > l + 1) {
			System.out.println("-1");
		} else {
			l = l + 1;
			if (l + 1 > 9) {
				l = l - 1;
				System.out.println("-1");
			} else {
				System.out.println("0");
				if (isok) {
					if (insertL < gl) {
						gl++;
						if (gl > l - 1) {
							isok = false;
						}
					}
				}
			}
		}

		if (isok) {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}

	}

}
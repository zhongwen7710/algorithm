package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��һ��byte���ֶ�Ӧ�Ķ�����������1�����������������3�Ķ�����Ϊ00000011���������2��1
	֪ʶ�㣺 
	��  �룺һ��byte�͵�����
	��  ���� ��
		����: ��Ӧ�Ķ�����������1�����������
 * @author guanxiangqing
 *
 */
public class ForMaximumContinuousBitNumber {

	/**
	 * ��һ��byte���ֶ�Ӧ�Ķ�����������1������������ĸ���
	 * 
	 * @param str
	 * @return
	 */

	// ��ȡ��������Ϊ1������Ӵ�
	public static int getonenum(String str) {
		int maxone = 0;
		int submax = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				submax++;
			} else {
				if (submax > maxone) {
					maxone = submax;
					submax = 0;
				}
			}
		}
		if (submax > maxone) {
			maxone = submax;
		}
		return maxone;
	}

	// һ��int����ת��Ϊ�����ƴ�
	public static String getbitstr(int intnum) {
		StringBuffer sb = new StringBuffer();
		sb.append(intnum % 2);
		int intsubnum = intnum / 2;
		if (intsubnum > 0) {
			sb.append(getbitstr(intsubnum));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int istr = sc.nextInt();
		System.out.println(getonenum(getbitstr(istr)));
		sc.close();
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	��������Ҫ�������������n��Ȼ������n�����������Ϊn�������и����ĸ�������������������ƽ��ֵ��
	֪ʶ�㣺����,ָ��
	��  �룺��������һ��������n��
	Ȼ������n��������
	��  ����
		��������ĸ�������������������ƽ��ֵ��
	ע�����  ��ƽ��ֵΪ����ֱ������������Ϊ��������һС����
 * @author guanxiangqing
 *
 */
public class RememberTheNegativeWhich {
	public static int getCountAver(List<Integer> list) {
		int nc = 0, sum = 0, pc = 0;
		BigDecimal aver;
		for (Integer in : list) {
			if (in < 0) {
				nc++;
			} else {
				sum += in;
				pc++;
			}
		}
		aver = new BigDecimal(sum).divide(new BigDecimal(pc));

		if (sum % pc == 0) {
			System.out.print(nc + " " + aver.intValue());
		} else {
			System.out.print(nc + " "
					+ aver.setScale(1, BigDecimal.ROUND_HALF_UP));
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			input.add(scan.nextInt());
		}
		getCountAver(input);

	}

}
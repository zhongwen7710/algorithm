package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
 
	��ϸ������
	
	�����ӿ�˵����
	    public String getResult(long ulDataInput)
	���������
	         long ulDataInput�������������
	����ֵ��
	        String
	֪ʶ�㣺����
	��  �룺����һ��long������
	��  �������մ�С�����˳����������������������ӣ��Կո����

 * @author guanxiangqing
 *
 */
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		sc.close();
		zhiSort(l);
	}

	private static void zhiSort(long l) {
		// TODO Auto-generated method stub
		List<Long> list = new ArrayList<Long>();
		long k = 2;
		while (k <= Math.abs(l)) {
			if (l % k == 0) {
				list.add(k);
				l = l / k;
			} else {
				k++;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < list.size(); j++) {
			sb.append(list.get(j) + " ");
		}
		System.out.print(sb.toString().trim());
	}
}
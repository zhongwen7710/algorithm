package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	�ҳ������ַ����д�д�ַ�(��'A'-'Z')�ĸ���
	�ӿ�˵��
	    ԭ�ͣ�int CalcCapital(String str);
	    ����ֵ��int
	֪ʶ�㣺�ַ���
	��  �룺����һ��String����
	��  ���� 
		���string�д�д��ĸ�ĸ���
	�迼���ַ���Ϊ��  ���Ϊ�����0

 * @author guanxiangiqng
 *
 */
public class StatisticalCapitalLettersNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(CalcCapital(inputStr));
	}

	private static int CalcCapital(String str) {
		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (c >= 'A' && c <= 'Z') {
				i++;
			}
		}
		return i;
	}

}
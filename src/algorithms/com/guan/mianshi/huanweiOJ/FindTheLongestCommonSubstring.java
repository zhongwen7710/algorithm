package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	���������ַ���a,b�е�������Ӵ���
	�ӿ���Ƽ�˵����
	
	****************************************************************************
	 Description   : ���������ַ���a,b�е�������Ӵ�
	 Input Param   : String stringA, �����ַ���A
	     String stringB, �����ַ���B               
	 Output Param  : 
	 Return Value  : �ɹ�������󹫹��Ӵ���ʧ�ܷ���null���磺���ݴ���
	 ****************************************************************************
	 public static String iQueryMaxCommString(String stringA, String stringB)
	 {
	     //������ʵ�ֹ��ܣ��������������������
	     return null;
	 }
	֪ʶ�㣺�ַ���
	��  �룺 ���������ַ���
	��  ���� �����ظ����ֵ��ַ�
 * @author guanxiangqing
 *
 */
public class FindTheLongestCommonSubstring {

	public static String iQueryMaxCommString(String str1, String str2) {
		int len = str1.length();
		String s = "--";
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				if (str2.contains(str1.substring(i, j))) {
					count = j - i;
					if (max < count) {
						max = count;
					}
				}
			}
		}

		for (int i = 0; i <= len - max; i++) {
			if (str2.contains(str1.substring(i, i + max))) {
				// System.out.println(str1.substring(i,i+max));
				s = str1.substring(i, i + max);
				return s;
			}
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(iQueryMaxCommString(str1, str2));

		sc.close();
	}
}
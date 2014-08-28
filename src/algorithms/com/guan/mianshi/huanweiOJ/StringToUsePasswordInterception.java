package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	Catcher��MCA�����鱨Ա��������ʱ���ֵй�����һЩ�ԳƵ��������ͨ�ţ���������ЩABBA��ABA��A��123321������������ʱ���ڿ�ʼ�����ʱ����һЩ�޹ص��ַ��Է�ֹ����ƽ⡣����������б仯 ABBA->12ABBA,ABA->ABAKK,123321->51233214������Ϊ�ػ�Ĵ�̫���ˣ����Ҵ��ڶ��ֿ��ܵ������abaaab�ɿ�����aba,��baaab�ļ�����ʽ����Cathcer�Ĺ�����ʵ����̫���ˣ���ֻ������Ը������������ܰ�Catcher�ҳ������Ч���봮��
	֪ʶ�㣺���Ի���,�ַ���,ѭ��,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
	��  �룺����һ���ַ���
	��  ����������Ч���봮����󳤶�

 * @author guanxiangqing
 *
 */
public class StringToUsePasswordInterception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr = sc.nextLine();
		sc.close();
		System.out.println(getLongestRound(mStr));
	}

	public static int getLongestRound(String st) {
		int len = st.length();
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				String sub = st.substring(i, j + 1);
				if (checkRound(sub) && sub.length() > max) {
					max = sub.length();
				}
			}
		}
		return max;
	}

	public static boolean checkRound(String ms) {
		int len = ms.length();
		int half_len = len / 2;
		for (int i = 0; i < half_len; i++) {
			if (ms.charAt(i) != ms.charAt(len - 1 - i))
				return false;
			else
				continue;
		}
		return true;
	}
}
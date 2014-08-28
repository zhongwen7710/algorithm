package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	�ж϶��ַ����е������ַ��Ƿ��ڳ��ַ�����ȫ������
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	boolIsAllCharExist(char* pShortString,char* pLongString);
	���������
	    char* pShortString�����ַ���
	    char* pLongString�����ַ���
	֪ʶ�㣺�ַ���,ѭ��,ָ��
	��  �룺���������ַ�������һ��Ϊ���ַ����ڶ���Ϊ���ַ���
	��  ���� 
	����ֵ��
	    true  - ��ʾ���ַ����������ַ����ڳ��ַ����г���
	    false- ��ʾ���ַ��������ַ��ڳ��ַ�����û�г���
 * @author guanxiangqing
 *
 */
public class StringMatching {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		boolean result = isAllCharExist(a, b);
		System.out.println(result);
	}

	/**
	 * �ж϶��ַ����е������ַ��Ƿ��ڳ��ַ�����ȫ������
	 */
	public static boolean isAllCharExist(String s, String l) {
		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(i, i + 1);
			if (l.contains(sub)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
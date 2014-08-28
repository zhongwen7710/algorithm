package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ����������
 * ����ָ�������������ַ������д���
	������������ַ����ϲ���
	�Ժϲ�����ַ�����������Ҫ��Ϊ���±�Ϊ�������ַ����±�Ϊż�����ַ��ֱ��С��������������±���˼���ַ����ַ����е�λ�á�
	���������ַ������в���������ַ�Ϊ��0��������9�����ߡ�A��������F�����ߡ�a��������f������������������16���Ƶ�������BIT����Ĳ�����
	��ת��Ϊ��Ӧ�Ĵ�д�ַ������ַ�Ϊ��4����Ϊ0100b����ת��Ϊ0010b��Ҳ����2��ת������ַ�Ϊ��2���� ���ַ�Ϊ��7����Ϊ0111b����ת��Ϊ1110b��Ҳ����e��ת������ַ�Ϊ��д��E���� 
	����������str1Ϊ"dec"��str2Ϊ"fab"���ϲ�Ϊ��decfab�����ֱ�ԡ�dca���͡�efb���������������Ϊ��abcedf����ת����Ϊ��5D37BF��
	�ӿ���Ƽ�˵����

 * @author guanxiangqing
 *
 */
public class StringMergingProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char[] result = processString(str1, str2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	static char[] processString(String str1, String str2) {
		String newString = str1.concat(str2);
		int len = newString.length();
		char[] odd = new char[len % 2 == 0 ? len / 2 : (len / 2) + 1];
		char[] even = new char[len / 2];
		int oddindex = 0, evenindex = 0;
		for (int i = 1; i <= len; i++) {
			if (i % 2 == 0) {
				even[evenindex++] = newString.charAt(i - 1);
			} else {
				odd[oddindex++] = newString.charAt(i - 1);
			}
		}
		Arrays.sort(odd);
		Arrays.sort(even);
		char[] result = new char[len];
		oddindex = 0;
		evenindex = 0;
		for (int i = 1; i <= len; i++) {
			if (i % 2 == 0) {
				result[i - 1] = even[evenindex++];
			} else {
				result[i - 1] = odd[oddindex++];
			}
		}
		convert(result);
		return result;

	}

	static void convert(char[] arr) {
		char ch;
		for (int i = 0; i < arr.length; i++) {
			ch = arr[i];
			if (Character.isDigit(ch) || (ch >= 'a' && ch <= 'f')
					|| (ch >= 'A' && ch <= 'F')) {
				StringBuffer sb = new StringBuffer(
						Integer.toBinaryString(Character.digit(ch, 16)));
				arr[i] = Character
						.toUpperCase(Integer.toHexString(
								Integer.parseInt(sb.reverse().toString(), 2))
								.charAt(0));
			}
		}

	}

}
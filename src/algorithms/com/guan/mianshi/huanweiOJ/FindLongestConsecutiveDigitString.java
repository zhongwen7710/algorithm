package algorithms.com.guan.mianshi.huanweiOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ����������
	�������
	���123058789����������ֵ9
	���54761����������ֵ5
	 
	�ӿ�˵��
	����ԭ�ͣ�
	   unsignedint Continumax(char** pOutputstr,  char* intputstr)
	���������
	   char* intputstr  �����ַ�����
	���������
	   char** pOutputstr: ����������ִ����������������ִ��ĳ���Ϊ0��Ӧ�÷��ؿ��ַ�������������ַ����ǿգ�ҲӦ�÷��ؿ��ַ�����  
	����ֵ��
	  ����������ִ��ĳ���
	֪ʶ�㣺λ����
	��  �룺����һ���ַ�����
	��  ���� 
		����ַ�������������ַ��������ĳ��ȡ�
	��������ַ���Ϊ�գ���ֻ���0
	�� input: dadfsaf  output:0

 * @author guanxiangqing
 *
 */
public class FindLongestConsecutiveDigitString {

	public String findNums(String str) {
		if (str == null) {
			return "";
		}
		String result = " ";
		int count = 0;
		int maxLength = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
				if (count > maxLength) {
					maxLength = count;
					result = str.substring(i - count + 1, i + 1);
				}
			} else {
				count = 0;
			}

		}
		if (maxLength == 0) {
			return "0";
		}
		result = result + "," + maxLength;
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FindLongestConsecutiveDigitString m = new FindLongestConsecutiveDigitString();
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		System.out.println(m.findNums(str));
	}

}
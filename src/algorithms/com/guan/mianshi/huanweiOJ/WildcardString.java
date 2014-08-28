package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����������
	�����������ڼ�����У�ͨ���һ�������﷨���㷺Ӧ�����ļ����������ݿ⡢������ʽ��������Ҫ���λʵ���ַ���ͨ������㷨��
	Ҫ��
	ʵ������2��ͨ�����
	*��ƥ��0�������ϵ��ַ����ַ���Ӣ����ĸ������0-9��ɣ������ִ�Сд����ͬ��
	����ƥ��1���ַ�
	
	���룺
	ͨ������ʽ��
	һ���ַ�����
	
	�����
	����ƥ��Ľ������ȷ���true���������false
	֪ʶ�㣺�ַ���
	��  �룺������һ������ͨ������ַ�����������һ����Ҫƥ����ַ���
	��  ��������ƥ��Ľ������ȷ���true���������false
 * @author guanxiangqing
 *
 */
public class WildcardString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String commonStr = scanner.nextLine();
		String str = scanner.nextLine();
		commonStr = commonStr.replaceAll("[*]", "\\\\w+").replaceAll("[?]",
				"\\\\w");

		// ������������ʽ
		Pattern pattern = Pattern.compile(commonStr);
		Matcher matcher = pattern.matcher(str);
		System.out.print(matcher.find());
		scanner.close();

	}

}
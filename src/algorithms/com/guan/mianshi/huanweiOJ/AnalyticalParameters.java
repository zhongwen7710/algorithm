package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * ����������
	�������������������
	xcopy /s c:\ d:\��
	�����������£� 
	����1��������xcopy 
	����2���ַ���/s
	����3���ַ���c:\
	����4: �ַ���d:\
	���дһ��������������ʵ�ֽ������и�����������������
	 
	�������� 
	1.�����ָ���Ϊ�ո� 
	2.�����á������������Ĳ���������м��пո񣬲��ܽ���Ϊ�������������������������xcopy /s ��C:\program files�� ��d:\��ʱ��������Ȼ��4������3������Ӧ�����ַ���C:\program files��������C:\program��ע���������ʱ����Ҫ������ȥ�������Ų�����Ƕ�������
	3.���������� 
	4.������������֤��������ֲ�����Ҫ�������
	����ʾ:	
	 ��Ҫʵ�ֵĽӿ����£�
	 
	//��ʼ��������ÿ����������ǰ�ᱣ֤����һ�Σ�
	 public static void paramparse_init()
	 {
	  
	 }
	 //������������������ֵ0��ʾ�ɹ�����0Ϊʧ�ܣ�
	 public static int  paramparse_parse(String pszInput)
	 {
	  return 0;
	 }
	 //��ȡ���������ĺ���������ֵΪ������
	 public static int  paramparse_getnum()
	 {
	  return 0;
	 
	 }
	 //��ȡָ�������ĺ���,���ָ��index�����ڣ�����null
	 public static String  paramparse_getparam(int index)
	 {
	  return null;  
	 }
	 //��Դ�ͷź�����ÿ���������к�ᱣ֤����һ�Σ�
	 public static void paramparse_uninit()
	 {
	  
	 }

 * @author guanxiangqing
 *
 */
public class AnalyticalParameters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int flag = 0;
		List<String> list = new ArrayList<String>();
		StringBuilder stem = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '"') {
				flag++;
				continue;
			}
			if (flag % 2 == 0) {
				if (str.charAt(i) != ' ') {
					if (i == str.length() - 1) {
						stem.append(String.valueOf(str.charAt(i)));
						list.add(stem.toString());
					} else {
						stem.append(String.valueOf(str.charAt(i)));
					}

				} else {
					list.add(stem.toString());
					stem.delete(0, stem.length());
				}
			} else {
				stem.append(String.valueOf(str.charAt(i)));
			}
		}

		int j = list.size();
		for (String s : list) {
			if (null == s || "".equals(s) || " ".equals(s)) {
				j--;
			}
		}

		System.out.println(j);
		for (String s : list) {
			if (null != s && !"".equals(s) && !" ".equals(s)) {
				System.out.println(s);
			}

		}

	}
}
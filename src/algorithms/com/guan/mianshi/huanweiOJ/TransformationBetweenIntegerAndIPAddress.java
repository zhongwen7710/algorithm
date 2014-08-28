package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	ԭ��ip��ַ��ÿ�ο��Կ�����һ��0-255����������ÿ�β�ֳ�һ����������ʽ���������Ȼ��������������ת���
	һ����������
	������һ��ip��ַΪ10.0.3.193
	ÿ������             ���Ӧ�Ķ�������
	10                   00001010
	0                    00000000
	3                    00000011
	193                  11000001
	���������Ϊ��00001010 00000000 00000011 11000001,ת��Ϊ10���������ǣ�167773121������IP��ַת��������־������ˡ�
	 
	��ÿ�ο��Կ�����һ��0-255����������Ҫ��IP��ַ����У��
	֪ʶ�㣺�ַ���,λ����
	��  �룺 
	1 ����IP��ַ
	2 ����10�����͵�IP��ַ
	��  ���� 
	1 ���ת����10���Ƶ�IP��ַ
	2 ���ת�����IP��ַ

 * @author guanxiangqing
 *
 */
public class TransformationBetweenIntegerAndIPAddress {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		long intip = sc.nextLong();
		sc.close();
		System.out.println(ipToInt(ip));
		System.out.println(intToIp(intip));

	}

	static int ipToInt(String ip) {
		String[] tmps = ip.split("\\.");
		StringBuffer sb = new StringBuffer();
		for (String tmp : tmps) {
			sb.append(myToBinaryString(Integer.parseInt(tmp)));
		}
		return Integer.parseInt(sb.toString(), 2);
	}

	static String myToBinaryString(int i) {
		String orignl = Integer.toBinaryString(i);
		StringBuffer sb = new StringBuffer(orignl);
		while (sb.length() < 8) {
			sb.insert(0, '0');
		}
		return sb.toString();
	}

	static String intToIp(long intip) {
		String ip = Long.toBinaryString(intip);
		String tmp;
		int end = ip.length();
		int start;
		List<Integer> result = new LinkedList<>();
		while (end > 0) {
			start = end - 8 > 0 ? end - 8 : 0;
			tmp = ip.substring(start, end);
			result.add(0, Integer.parseInt(tmp, 2));
			end = start;
		}

		while (result.size() < 4) {
			result.add(0, 0);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			sb.append(result.get(i));
			if (i != 3) {
				sb.append('.');
			}
		}
		return sb.toString();
	}
}

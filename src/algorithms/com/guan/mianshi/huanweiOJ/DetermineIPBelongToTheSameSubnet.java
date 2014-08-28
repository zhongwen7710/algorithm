package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 *  ����������
 * ���������������ж�������̨�������IP��ַ�Ƿ�����ͬһ������ĸ��ݡ�
	����������IP��ַ�ṹ��ͬ����32λ������������������Ų���ȫΪ��1���������Ų���ȫΪ��0��������������������ж���̨�����Ƿ���ͬһ�����С�����̨������IP��ַ�ֱ������ǵ����������ࡰ�롱��Ľ����ͬ����˵������̨������ͬһ�����С�
	ʾ����
	I P ��ַ�� 192.168.0.1
	�������롡 255.255.255.0
	ת��Ϊ�����ƽ������㣺
	I P ��ַ��11010000.10101000.00000000.00000001
	�������롡11111111.11111111.11111111.00000000
	AND����
	 ��������11000000.10101000.00000000.00000000
	ת��Ϊʮ���ƺ�Ϊ��
	 ��������192.168.0.0
	 
	I P ��ַ�� 192.168.0.254
	�������롡 255.255.255.0
	
	ת��Ϊ�����ƽ������㣺
	I P ��ַ��11010000.10101000.00000000.11111110
	�������롡11111111.11111111.11111111.00000000
	AND����
	����������11000000.10101000.00000000.00000000
	ת��Ϊʮ���ƺ�Ϊ��
	����������192.168.0.0
	ͨ�����϶���̨�����IP��ַ�����������AND��������ǿ��Կ�������������һ���ġ���Ϊ192.168.0.0���������̨���������Ϊ��ͬһ�����硣
	
	* ����: �ж���̨�����IP��ַ��ͬһ�����硣 
	* ���������    String Mask: �������룬��ʽ����255.255.255.0���� 
	*               String ip1: �����1��IP��ַ����ʽ����192.168.0.254����
	*               String ip2: �����2��IP��ַ����ʽ����192.168.0.1����
	*               
	* ����ֵ��      0��IP1��IP2����ͬһ�����磻     1��IP��ַ�����������ʽ�Ƿ���    2��IP1��IP2������ͬһ������
	
	public int checkNetSegment(String mask, String ip1, String ip2) 
	{     
	    //������ʵ�ֹ���
	    return 0;
	}
 * @author guanxiangqing
 *
 */
public class DetermineIPBelongToTheSameSubnet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String subNet = scanner.nextLine();
			String ip1 = scanner.nextLine();
			String ip2 = scanner.nextLine();
			if (!(checkIp(subNet) && checkIp(ip1) && checkIp(ip2))) {
				System.out.println(1);
				return;
			}
			String result1 = andResult(subNet, ip1);
			String result2 = andResult(subNet, ip2);
			if (result1.equals(result2)) {
				System.out.println(0);
			} else {
				System.out.println(2);
			}
		} catch (Exception e) {
			System.out.println(1);
		} finally {
			scanner.close();
		}
	}

	private static boolean checkIp(String Ip) {
		String[] temp = Ip.split("\\.");
		if (temp.length != 4) {
			return false;
		}
		for (int i = 0; i < temp.length; i++) {
			int ipTemp = Integer.parseInt(temp[i]);
			if (ipTemp < 0 || ipTemp > 255) {
				return false;
			}
		}
		return true;
	}

	private static String andResult(String subNet, String ip) {
		String[] subNetArray = subNet.split("\\.");
		String[] ipArray = ip.split("\\.");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ipArray.length; i++) {
			sb.append(Integer.parseInt(subNetArray[i])
					& Integer.parseInt(ipArray[i]));
			if (i != ipArray.length - 1) {
				sb.append('.');
			}
		}
		return sb.toString();
	}
}
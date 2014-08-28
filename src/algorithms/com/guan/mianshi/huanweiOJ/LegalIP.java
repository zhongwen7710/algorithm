package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����IPV4����һ��32λ�޷�����������ʾ��һ���õ�ַ�ʽ����ʾ���㽫IP��ַ�ֳ�4�����֣�ÿ������Ϊ8λ����ʾ��һ���޷�����������˲���Ҫ�����ų��֣�����10.137.17.1�������Ƿǳ���Ϥ��IP��ַ��һ��IP��ַ����û�пո���֣���ΪҪ��ʾ��һ��32���֣���
	������Ҫ���ó������ж�IP�Ƿ�Ϸ���
	֪ʶ�㣺�����������,���Ի���,�ַ���,ѭ��,���ݽṹ,����,����,ջ,�㷨,����,����,����,��,ͼ,����,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
	��  �룺����һ��ip��ַ
	��  ���������жϵĽ��YES or NO

 * @author guanxiangqing
 *
 */
public class LegalIP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ip = scan.nextLine();
		if (isRightIp(ip))
			System.out.println("YES");
		else
			System.out.println("NO");
		scan.close();
	}

	public static boolean isRightIp(String ip) {
		int dotCount = 0;
		for (int i = 0; i < ip.length(); i++) {
			if (!(ip.charAt(i) >= '0' && ip.charAt(i) <= '9')
					&& ip.charAt(i) != '.') {
				// System.out.println(ip.charAt(i) + " 1 " + i);
				return false;
			} else if (ip.charAt(i) == '.')
				dotCount++;
		}

		if (dotCount != 3) {
			// System.out.println(2);
			return false;
		}
		String ips[] = ip.split("[.]");

		for (int i = 0; i < 4; i++) {
			if (ips[i] == null || ips[i].equals("")) {
				// System.out.println(3);
				return false;
			} else {
				try {
					int n = Integer.parseInt(ips[i]);
					if (!(n >= 0 && n < 256)) {
						// System.out.println(4);
						return false;
					}
				} catch (Exception e) {
					// System.out.println(5);
					return false;
				}
			}
		}

		return true;

	}

}
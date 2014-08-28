package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	�����IP��ַ�Ͷ�Ӧ�����룬���з���ʶ��Ҫ����A/B/C/D/E���ַ���࣬���Ϸ��ĵ�ַ�����뵥�����ࡣ
���е�IP��ַ����Ϊ A,B,C,D,E����
A���ַ1.0.0.0~126.255.255.255; 
B���ַ128.0.0.0~191.255.255.255; 
C���ַ192.0.0.0~223.255.255.255;
D���ַ224.0.0.0~239.255.255.255��
E���ַ240.0.0.0~255.255.255.255

˽��IP��Χ�ǣ�
10.0.0.0��10.255.255.255
172.16.0.0��172.31.255.255
192.168.0.0��192.168.255.255
 
��������Ϊǰ����������1��Ȼ��ȫ��0
֪ʶ�㣺���Ի���,�ַ���,ѭ��,�㷨,����,����,����,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
��  �룺 �����ַ�����ÿ��һ��IP��ַ�����룬��~�������磺
10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
��  ����ͳ��A��B��C��D��E������IP��ַ��������롢˽��IP�ĸ�����֮���Կո���������������IP�����Եõ���
1.0.0.1~255.0.0.0 ----A��
192.168.0.2~255.255.255.0  ----C�࣬˽��
10.70.44.68~255.254.255.0----���������
19..0.~255.255.255.0-----�����IP
���Եõ�ͳ���������£�
1 0 1 0 0 2 1

 * @author guanxiangqing
 *
 */
public class IdentifyEffectiveIPAddressAndMask {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int[] mark = new int[7];

		// String line;

		while (sca.hasNext()) {
			String line = sca.nextLine();
			String[] ss = line.split("~");
			String ip = ss[0];
			String yanma = ss[1];
			if (yanma.equals("255.0.0.0") || yanma.equals("255.255.0.0")
					|| yanma.equals("255.255.255.0")) {
				String[] ips = ip.split("\\.");
				if (ips.length == 4) {
					int ip1 = Integer.valueOf(ips[0]);
					int ip2 = Integer.valueOf(ips[1]);
					int ip3 = Integer.valueOf(ips[2]);
					int ip4 = Integer.valueOf(ips[3]);
					if ((ip1 <= 255 && ip1 >= 1) && (ip2 <= 255 && ip2 >= 0)
							&& (ip3 <= 255 && ip3 >= 0)
							&& (ip4 <= 255 && ip4 >= 0)) {
						if (ip1 <= 126 && ip1 >= 1) {
							mark[0]++;
							if (ip1 == 10)
								mark[6]++;
						} else if (ip1 <= 191 && ip1 >= 128) {
							mark[1]++;
							if (ip1 == 172 && (ip2 <= 31 && ip2 >= 16))
								mark[6]++;
						} else if (ip1 <= 223 && ip1 >= 192) {
							mark[2]++;
							if (ip1 == 192 && ip2 == 168)
								mark[6]++;
						} else if (ip1 <= 239 && ip1 >= 224) {
							mark[3]++;
						} else if (ip1 <= 255 && ip1 >= 240) {
							mark[4]++;
						}
					} else
						mark[5]++;
				} else
					mark[5]++;
			}

			else
				mark[5]++;

		}
		System.out.println(mark[0] + " " + mark[1] + " " + mark[2] + " "
				+ mark[3] + " " + mark[4] + " " + mark[5] + " " + mark[6]);

	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
所有的IP地址划分为 A,B,C,D,E五类
A类地址1.0.0.0~126.255.255.255; 
B类地址128.0.0.0~191.255.255.255; 
C类地址192.0.0.0~223.255.255.255;
D类地址224.0.0.0~239.255.255.255；
E类地址240.0.0.0~255.255.255.255

私网IP范围是：
10.0.0.0～10.255.255.255
172.16.0.0～172.31.255.255
192.168.0.0～192.168.255.255
 
子网掩码为前面是连续的1，然后全是0
知识点：语言基础,字符串,循环,算法,查找,搜索,排序,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
输  入： 多行字符串。每行一个IP地址和掩码，已~隔开。如：
10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
输  出：统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开，根据上面的IP，可以得到：
1.0.0.1~255.0.0.0 ----A类
192.168.0.2~255.255.255.0  ----C类，私有
10.70.44.68~255.254.255.0----错误的掩码
19..0.~255.255.255.0-----错误的IP
可以得到统计数据如下：
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
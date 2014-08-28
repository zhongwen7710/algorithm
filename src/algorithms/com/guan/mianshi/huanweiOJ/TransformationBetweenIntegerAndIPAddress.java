package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
	一个长整数。
	举例：一个ip地址为10.0.3.193
	每段数字             相对应的二进制数
	10                   00001010
	0                    00000000
	3                    00000011
	193                  11000001
	组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
	 
	的每段可以看成是一个0-255的整数，需要对IP地址进行校验
	知识点：字符串,位运算
	输  入： 
	1 输入IP地址
	2 输入10进制型的IP地址
	输  出： 
	1 输出转换成10进制的IP地址
	2 输出转换后的IP地址

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

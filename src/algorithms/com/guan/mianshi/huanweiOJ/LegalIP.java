package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
	现在需要你用程序来判断IP是否合法。
	知识点：基于输入输出,语言基础,字符串,循环,数据结构,链表,队列,栈,算法,查找,搜索,排序,树,图,数组,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
	输  入：输入一个ip地址
	输  出：返回判断的结果YES or NO

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
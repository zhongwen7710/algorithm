package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
	知识点： 
	输  入：一个byte型的数字
	输  出： 无
		返回: 对应的二进制数字中1的最大连续数
 * @author guanxiangqing
 *
 */
public class ForMaximumContinuousBitNumber {

	/**
	 * 求一个byte数字对应的二进制数字中1的最大连续数的个数
	 * 
	 * @param str
	 * @return
	 */

	// 获取串中连续为1的最大子串
	public static int getonenum(String str) {
		int maxone = 0;
		int submax = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				submax++;
			} else {
				if (submax > maxone) {
					maxone = submax;
					submax = 0;
				}
			}
		}
		if (submax > maxone) {
			maxone = submax;
		}
		return maxone;
	}

	// 一个int数字转换为二进制串
	public static String getbitstr(int intnum) {
		StringBuffer sb = new StringBuffer();
		sb.append(intnum % 2);
		int intsubnum = intnum / 2;
		if (intsubnum > 0) {
			sb.append(getbitstr(intsubnum));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int istr = sc.nextInt();
		System.out.println(getonenum(getbitstr(istr)));
		sc.close();
	}

}
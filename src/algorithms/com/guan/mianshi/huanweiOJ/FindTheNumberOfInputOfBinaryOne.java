package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	请实现如下接口
    public static int findNumberOf1(intnum)
    {
        // 请实现 
        return 0;
    }譬如：输入5 ，5的二进制为101，输出2
 
	知识点：位运算
	输  入：输入一个整数
	输  出：计算整数二进制中1的个数
 * @author guanxiangqing
 *
 */
public class FindTheNumberOfInputOfBinaryOne {
	public static void main(String[] args) {
		// 输入整数转换为二进制数后其中1的个数
		Scanner scan = new Scanner(System.in);
		byte s = scan.nextByte();
		int counter = 0;
		String s2b = Integer.toBinaryString(s);
		char[] s2ba = s2b.toCharArray();
		for (int i = 0; i < s2ba.length; i++) {
			if (s2ba[i] == '1')
				counter++;
		}
		System.out.println(counter);
	}
}
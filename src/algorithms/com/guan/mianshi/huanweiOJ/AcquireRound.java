package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
	知识点：函数
	输  入：输入一个浮点数值
	输  出：输出该数值的近似整数值
 * @author 
 *
 */
public class AcquireRound {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float f = s.nextFloat();
		System.out.print(Math.round(f));
	}

}
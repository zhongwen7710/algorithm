package algorithms.com.guan.mianshi.huanweiOJ;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 问题描述：
	•计算一个数字的立方根，不使用库函数
	详细描述：
	•接口说明
	原型：
	public static double getCubeRoot(double input)
	输入:double 待求解参数
	返回值:double  输入参数的立方根
	知识点：循环
	输  入：待求解参数 double类型
	输  出：输入参数的立方根 也是double类型
 * @author guanxiangqing
 *
 */
public class ToSolveTheProb {

	public static String getCubeRoot(double input) {
		if (input == 0)
			return "";
		double x0, x1;
		x0 = input;
		x1 = (2 * x0 / 3) + (input / (x0 * x0 * 3));// 利用迭代法求解
		while (Math.abs(x1 - x0) > 0.000001) {
			x0 = x1;
			x1 = (2 * x0 / 3) + (input / (x0 * x0 * 3));
		}

		DecimalFormat dec = new DecimalFormat("0.0");
		return dec.format(x1);

		// return x1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(getCubeRoot(d));
		sc.close();

	}
}
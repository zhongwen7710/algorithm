package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	Jessi初学英语，为了快速读出一串数字，编写程序将数字转换成英文：
	如22：twenty two，123：one hundred and twenty three。
	 
	说明：
	数字为正整数，长度不超过十位，不考虑小数，转化结果为英文小写；
	输出格式为twenty two；
	非法数据请返回“error”；
	关键字提示：and，billion，million，thousand，hundred。
	 
	方法原型：public static String parse(long num)
	知识点： 语言基础,字符串,循环,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
	输  入： 输入一个long型整数
	输  出： 输出相应的英文写法
 * @author guanxiangqing
 *
 */
public class LearnEnglish {
	public static String parse(long n) {
		String s = "error";
		if (n < 0) {
			s = "error";
		} else if (n < 20) {
			switch ((int) n) {
			case 0:
				s = "zero";
				break;
			case 1:
				s = "one";
				break;
			case 2:
				s = "two";
				break;
			case 3:
				s = "three";
				break;
			case 4:
				s = "four";
				break;
			case 5:
				s = "five";
				break;
			case 6:
				s = "six";
				break;
			case 7:
				s = "seven";
				break;
			case 8:
				s = "eight";
				break;
			case 9:
				s = "nine";
				break;
			case 10:
				s = "ten";
				break;
			case 11:
				s = "eleven";
				break;
			case 12:
				s = "twelve";
				break;
			case 13:
				s = "thirteen";
				break;
			case 14:
				s = "fourteen";
				break;
			case 15:
				s = "fifteen";
				break;
			case 16:
				s = "sixteen";
				break;
			case 17:
				s = "seventeen";
				break;
			case 18:
				s = "eighteen";
				break;
			case 19:
				s = "nineteen";
				break;
			default:
				s = "error";
				break;
			}
		} else if (n < 100) // 21-99
		{
			if (n % 10 == 0) // 20,30,40,...90的输出
			{
				switch ((int) n) {
				case 20:
					s = "twenty";
					break;
				case 30:
					s = "thirty";
					break;
				case 40:
					s = "forty";
					break;
				case 50:
					s = "fifty";
					break;
				case 60:
					s = "sixty";
					break;
				case 70:
					s = "seventy";
					break;
				case 80:
					s = "eighty";
					break;
				case 90:
					s = "ninety";
					break;
				default:
					s = "error";
					break;
				}
			} else {
				s = parse(n / 10 * 10) + ' ' + parse(n % 10);
			}

		} else if (n < 1000) // 100-999
		{
			if (n % 100 == 0) {
				s = parse(n / 100) + " hundred";
			} else {
				s = parse(n / 100) + " hundred and " + parse(n % 100);
			}
		} else if (n < 1000000) // 1000-999999 百万以下
		{
			if (n % 1000 == 0) {
				s = parse(n / 1000) + " thousand";
			} else {
				s = parse(n / 1000) + " thousand " + parse(n % 1000);
			}
		} else if (n < 1000000000) // 十亿以下
		{
			if (n % 1000000 == 0) {
				s = parse(n / 1000000) + " million";
			} else {
				s = parse(n / 1000000) + " million " + parse(n % 1000000);
			}
		}
		return s;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		scanner.close();
		System.out.println(parse(num));
	}
}

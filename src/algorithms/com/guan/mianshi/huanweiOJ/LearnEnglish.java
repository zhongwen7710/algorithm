package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	Jessi��ѧӢ�Ϊ�˿��ٶ���һ�����֣���д��������ת����Ӣ�ģ�
	��22��twenty two��123��one hundred and twenty three��
	 
	˵����
	����Ϊ�����������Ȳ�����ʮλ��������С����ת�����ΪӢ��Сд��
	�����ʽΪtwenty two��
	�Ƿ������뷵�ء�error����
	�ؼ�����ʾ��and��billion��million��thousand��hundred��
	 
	����ԭ�ͣ�public static String parse(long num)
	֪ʶ�㣺 ���Ի���,�ַ���,ѭ��,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
	��  �룺 ����һ��long������
	��  ���� �����Ӧ��Ӣ��д��
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
			if (n % 10 == 0) // 20,30,40,...90�����
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
		} else if (n < 1000000) // 1000-999999 ��������
		{
			if (n % 1000 == 0) {
				s = parse(n / 1000) + " thousand";
			} else {
				s = parse(n / 1000) + " thousand " + parse(n % 1000);
			}
		} else if (n < 1000000000) // ʮ������
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

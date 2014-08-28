package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 

     * 统计出英文字母字符的个数。
     * 
     * @param str 需要输入的字符串
     * @return 英文字母的个数

    public static int getEnglishCharCount(String str)
    {
        return 0;
    }
    

     * 统计出空格字符的个数。
     * 
     * @param str 需要输入的字符串
     * @return 空格的个数

    public static int getBlankCharCount(String str)
    {
        return 0;
    }
    

     * 统计出数字字符的个数。
     * 
     * @param str 需要输入的字符串
     * @return 英文字母的个数

    public static int getNumberCharCount(String str)
    {
        return 0;
    }
    

     * 统计出其它字符的个数。
     * 
     * @param str 需要输入的字符串
     * @return 英文字母的个数

    public static int getOtherCharCount(String str)
    {
        return 0;
    }
 * @author guanxiangqing
 * 
 */
public class StatisticsTheNumberOfSpacesAndNumbersAndCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char chars[] = input.toCharArray();
		int num = 0;
		int word = 0;
		int space = 0;
		int other = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 65 && chars[i] <= 90 || chars[i] >= 97
					&& chars[i] <= 122) {
				word++;
			} else if (chars[i] >= 48 && chars[i] <= 57) {
				num++;
			} else if (chars[i] == ' ') {
				space++;
			} else {
				other++;
			}
		}

		System.out.println(word + "\n" + space + "\n" + num + "\n" + other);
	}

}
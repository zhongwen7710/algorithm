package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

/**
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 

     * ͳ�Ƴ�Ӣ����ĸ�ַ��ĸ�����
     * 
     * @param str ��Ҫ������ַ���
     * @return Ӣ����ĸ�ĸ���

    public static int getEnglishCharCount(String str)
    {
        return 0;
    }
    

     * ͳ�Ƴ��ո��ַ��ĸ�����
     * 
     * @param str ��Ҫ������ַ���
     * @return �ո�ĸ���

    public static int getBlankCharCount(String str)
    {
        return 0;
    }
    

     * ͳ�Ƴ������ַ��ĸ�����
     * 
     * @param str ��Ҫ������ַ���
     * @return Ӣ����ĸ�ĸ���

    public static int getNumberCharCount(String str)
    {
        return 0;
    }
    

     * ͳ�Ƴ������ַ��ĸ�����
     * 
     * @param str ��Ҫ������ַ���
     * @return Ӣ����ĸ�ĸ���

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
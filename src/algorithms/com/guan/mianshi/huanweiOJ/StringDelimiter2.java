package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringDelimiter2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		if ((!(str1 == null)) && (!str1.equals("")))
			fenge(str1);
		if ((!(str2 == null)) && (!str2.equals("")))
			fenge(str2);
	}

	public static void fenge(String str) {
		if (str.length() == 8)
			System.out.println(str);

		if (str.length() < 8) {
			System.out.println(Buling(str));
		}
		String[] strArray = new String[str.length() / 8 + 1];
		if (str.length() > 8) {
			if (str.length() % 8 != 0) {
				str = Buling(str);
			}

			char[] c = str.toCharArray();
			strArray[0] = str.substring(0, 8);

			for (int i = 1; i < str.length() / 8; i++) {
				strArray[i] = str.substring(8 * i, (i + 1) * 8);
			}
			for (int i = 0; i < strArray.length; i++) {
				System.out.println(strArray[i]);
			}
		}
	}

	public static String Buling(String str) {
		StringBuffer str1 = new StringBuffer();
		if (str.length() < 8) {
			str1.append(str);
			while (str1.length() < 8) {
				str1.append("0");
			}
		}
		if (str.length() > 8) {
			str1.append(str);
			while (str1.length() % 8 != 0) {
				str1.append("0");
			}
		}

		String result = str1.substring(0, str1.length());
		return result;
	}
}
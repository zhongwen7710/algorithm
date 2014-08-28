package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class DigitalRepresentation2 {

	public static void main(String[] args) {
		//  自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(MarkNum(str));

	}

	private static String MarkNum(String pInStr) {
		String pMarkNum = "";
		for (int i = 0; i < pInStr.length(); i++) {
			char c = pInStr.charAt(i);
			if (isDigtal(c)) {
				pMarkNum += "*" + c + "*";
			} else {
				pMarkNum += c;
			}
		}
		pMarkNum = pMarkNum.replaceAll("\\*\\*", "");
		return pMarkNum;
	}

	private static boolean isDigtal(char c) {
		if (Character.isDigit(c)) {
			return true;
		}
		return false;
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TheLengthOfTheLastWordFromAString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		if (inputStr.length() > 128) {
			inputStr = inputStr.substring(0, 128);
		}
		sc.close();
		String[] str = inputStr.split(" ");
		System.out.println(str[str.length - 1].length());
	}

}
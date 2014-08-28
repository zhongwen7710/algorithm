package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class DigitalRepresentation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String newStr = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] <= '9' && ch[i] >= '0') {
				newStr += "*" + String.valueOf(ch[i]) + "*";
			} else {
				newStr += String.valueOf(ch[i]);
			}
		}

		newStr = newStr.replace("**", "");
		input.close();
		System.out.print(newStr);

	}
}
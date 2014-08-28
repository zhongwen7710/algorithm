package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class LegalIP2 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String buffer[] = cin.nextLine().split("\\.");
		String result = "YES";

		if (buffer.length != 4) {
			result = "NO";
		} else {
			for (int i = 0; i < buffer.length; i++) {
				int m = Integer.parseInt(buffer[i]);
				if ((m <= 255) && (m >= 0)) {

				} else {
					result = "NO";
					break;
				}
			}
		}
		cin.close();
		System.out.println(result);
	}
}
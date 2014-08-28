package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ConversionOfNumberSystems3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inStr = sc.nextLine();
		System.out.print(scaleTrans(inStr));
	}

	private static String scaleTrans(String hex) {
		if (hex == " ")
			return " ";
		int dec = Integer.parseInt(hex.substring(2, hex.length()), 16);
		return dec + "";
	}
}
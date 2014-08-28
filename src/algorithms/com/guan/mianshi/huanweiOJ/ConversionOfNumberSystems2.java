package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ConversionOfNumberSystems2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try {
			String str1 = str.substring(2);
			String str2 = str.substring(2);
			int n = Integer.parseInt(str2, 16);
			String m = String.valueOf(n);
			System.out.println(m);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
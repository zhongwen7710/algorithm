package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StatisticalCapitalLettersNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr1 = sc.nextLine();
		sc.close();
		System.out.println(CalcCapital(mStr1));
	}

	public static int CalcCapital(String str) {
		int num = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z')
				num++;
		}
		return num;
	}
}
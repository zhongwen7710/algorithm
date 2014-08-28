package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class ForMaximumContinuousBitNumber2 {

	public static int getMax(byte b) {
		int n = b;
		int count = 0;
		int max = 0;
		String str = Integer.toBinaryString(n);
		// System.out.println(str);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '1') {
				count++;
				if (max < count) {
					max = count;
				}
			} else {
				if (max < count) {
					max = count;
				}
				count = 0;
				continue;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();

		System.out.println(getMax(b));
		sc.close();

	}
}
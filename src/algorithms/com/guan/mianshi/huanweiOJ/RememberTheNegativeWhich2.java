package algorithms.com.guan.mianshi.huanweiOJ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RememberTheNegativeWhich2 {
	public static void main(String args[]) {
		test15();
	}

	public static void test15() {
		Scanner in = new Scanner(System.in);
		int sumNum = in.nextInt();
		// System.out.println(sc);
		double sum = 0;
		int count = 0;
		double countZ = 0;
		for (int i = 0; i < sumNum; i++) {
			int num = in.nextInt();
			if (num < 0) {
				count++;
			}
			if (num > 0) {
				countZ++;
				sum = sum + num;
			}
		}
		DecimalFormat df2 = new DecimalFormat("#.0");
		String output = df2.format(sum / countZ);
		int index = output.indexOf(".");
		if (output.charAt(index + 1) == '0') {
			int avg = (int) (sum / countZ);
			System.out.println(count + " " + avg);
		} else {
			System.out.println(count + " " + df2.format(sum / countZ));
		}

	}
}
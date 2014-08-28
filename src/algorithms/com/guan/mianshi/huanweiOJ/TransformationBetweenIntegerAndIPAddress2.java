package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TransformationBetweenIntegerAndIPAddress2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ipString = scanner.nextLine().trim();
		String numString = scanner.nextLine().trim();
		scanner.close();
		String[] strings = ipString.split("\\.");
		int[] nums = new int[strings.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.valueOf(strings[i]);
		}
		System.out.println(getDec(nums));
		System.out.print(getIp(Long.valueOf(numString)));
	}

	private static long getDec(int[] num) {
		long result = 0;
		for (int i = num.length - 1; i >= 0; i--) {
			int j = num.length - 1 - i;
			while (j > 0) {
				num[i] *= 256;
				j--;
			}
			result += num[i];
		}
		return result;
	}

	private static String getIp(long num) {
		String result = "";
		int[] ips = new int[4];
		for (int i = ips.length - 1; i >= 0; i--) {
			ips[i] = (int) (num % 256);
			num /= 256;
		}
		for (int i = 0; i < ips.length - 1; i++) {
			result = result + ips[i] + ".";
		}
		result += ips[ips.length - 1];
		return result;
	}
}
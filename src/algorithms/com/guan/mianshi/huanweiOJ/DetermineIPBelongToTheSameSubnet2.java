package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class DetermineIPBelongToTheSameSubnet2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mask = scan.nextLine();
		String ip1 = scan.nextLine();
		String ip2 = scan.nextLine();
		System.out.println(checkNetSegment(mask, ip1, ip2));
		// main.printf();
		scan.close();
	}

	public static boolean isRightIp(String ip) {
		for (int i = 0; i < ip.length(); i++) {
			if (!(ip.charAt(i) >= '0' || ip.charAt(i) <= '9' || ip.charAt(i) == '.'))
				return false;
		}

		String ips[] = ip.split("[.]");

		if (ips.length != 4)
			return false;

		for (int i = 0; i < 4; i++) {
			if (ips[i] == null)
				return false;
			else {
				int n = Integer.parseInt(ips[i]);
				if (!(n >= 0 && n < 256))
					return false;
			}
		}

		return true;

	}

	public static int ip2int(String ip) {
		String[] ips = ip.split("[.]");
		int[] ipn = new int[4];
		for (int i = 0; i < 4; i++) {
			ipn[i] = Integer.parseInt(ips[i]);
		}
		return (ipn[3] << 24 | ipn[2] << 16 | ipn[1] << 8 | ipn[0]) & 0xFFFFFFFF;
	}

	public static int checkNetSegment(String mask, String ip1, String ip2) {
		if (!(isRightIp(mask) && isRightIp(ip1) && isRightIp(ip2)))
			return 1;
		int mask1 = ip2int(mask) & ip2int(ip1);
		int mask2 = ip2int(mask) & ip2int(ip2);
		if (mask1 != mask2)
			return 2;
		else
			return 0;
	}

}

package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyEffectiveIPAddressAndMask2 {
	static int[] count = new int[7];

	public static void check(String s, String s2) {
		Pattern p = Pattern
				.compile("(255|254|252|248|240|224|192|128).0.0.0|255.(255|254|252|248|240|224|192|128).0.0|255.255.(255|254|252|248|240|224|192|128).0|255.255.255.(255|254|252|248|240|224|192|128)");
		Matcher m = p.matcher(s2);
		String[] sp = s.split("\\.");
		int[] np = new int[sp.length];
		if (!m.matches()) {
			count[5]++;
			return;
		}
		for (int i = 0; i < np.length; i++) {
			try {
				np[i] = Integer.parseInt(sp[i]);
			} catch (NumberFormatException e) {
				count[5]++;
				return;
			}
		}
		if (np[0] == 0 || np[0] == 127) {
			count[5]++;
			return;
		}
		for (int j = 0; j < np.length; j++) {
			if (np[j] < 0 || np[j] > 255) {
				count[5]++;
				return;
			}
		}
		if (np[0] >= 1 && np[0] <= 126) {
			if (np[0] == 10)
				count[6]++;
			count[0]++;
		} else if (np[0] >= 128 && np[0] <= 191) {
			if (np[0] == 172 && (np[1] >= 16 && np[1] <= 31))
				count[6]++;
			count[1]++;
		} else if (np[0] >= 192 && np[0] <= 223) {
			if (np[0] == 192 && np[1] == 168)
				count[6]++;
			count[2]++;
		} else if (np[0] >= 224 && np[0] <= 239) {
			count[3]++;
		} else if (np[0] >= 240 && np[0] <= 255) {
			count[4]++;
		} else if (np[0] <= 0 || np[0] > 255) {
			count[5]++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> als = new ArrayList<String>();
		while (s.hasNext()) {
			als.add(s.nextLine());
		}
		String[][] sal = new String[als.size()][];
		for (int i = 0; i < als.size(); i++) {
			sal[i] = als.get(i).split("~");
			check(sal[i][0], sal[i][1]);
		}
		for (int k = 0; k < count.length - 1; k++)
			System.out.print(count[k] + " ");
		System.out.print(count[6]);
	}
}
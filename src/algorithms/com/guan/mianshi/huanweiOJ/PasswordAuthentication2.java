package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordAuthentication2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List strArray = new ArrayList();
		int i = 0;
		while (input.hasNext()) {
			strArray.add(input.nextLine());
		}
		for (int i1 = 0; i1 < strArray.size(); i1++) {
			boolean bol1 = changdu((String) strArray.get(i1));
			boolean bol2 = Leixing((String) strArray.get(i1));
			boolean bol3 = chongfu((String) strArray.get(i1));
			if (bol1 && bol2 && bol3)
				System.out.println("OK");
			else
				System.out.println("NG");

		}
	}

	private static boolean changdu(String str) {
		boolean flag = false;
		if (str.length() > 8)
			flag = true;
		return flag;
	}

	private static boolean Leixing(String str) {
		boolean flag = false;
		char[] c = str.toCharArray();
		int countd = 0;
		int countD = 0;
		int counts = 0;
		int counto = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z')
				countd++;
			if ((c[i] >= 'A' && c[i] <= 'Z'))
				countD++;
			if (c[i] >= '0' && c[i] <= '9')
				counts++;
		}
		counto = c.length - countd - countD - counts;
		if (countd > 0 && countD > 0 && counts > 0)
			flag = true;
		if (countd > 0 && counto > 0 && counts > 0)
			flag = true;
		if (counto > 0 && countD > 0 && counts > 0)
			flag = true;
		if (countd > 0 && countD > 0 && counto > 0)
			flag = true;
		return flag;
	}

	private static boolean chongfu(String str) {
		boolean flag = true;
		// char[] c=str.toCharArray();
		label: {
			for (int i = 0; i < str.length() - 3; i++) {
				String substr = str.substring(i, i + 2);
				for (int j = i + 1; j < str.length() - 2; j++) {
					String tempstr = str.substring(j, j + 2);
					if (substr.equals(tempstr)) {
						flag = false;
						break label;
					}
				}
			}
		}
		return flag;

	}
}

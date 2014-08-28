package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.Vector;

public class StringSplit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if (num == 0)
			return;

		String[] strs = new String[num];
		for (int i = 0; i < num; i++) {
			strs[i] = sc.nextLine();
		}

		Vector<String> vec = new Vector<String>();
		int div = 0;
		String ss = null;
		int len = 0;
		for (int i = 0; i < num; i++) {
			if (strs[i].length() % 8 == 0)
				div = strs[i].length() / 8;
			else
				div = strs[i].length() / 8 + 1;
			for (int k = 0; k < div; k++) {
				if ((k + 1) * 8 < strs[i].length()) {
					vec.add(strs[i].substring(k * 8, (k + 1) * 8));
				} else {
					ss = strs[i].substring(k * 8);
					len = ss.length();
					for (int p = 0; p < 8 - len; p++) {
						ss += "0";
					}
					vec.add(ss);
				}
			}
		}
		if (vec.size() == 0) // È«²¿Îª¿Õ×Ö·û´®
			return;
		for (int i = 0; i < vec.size() - 1; i++) {
			System.out.println(vec.get(i));
		}
		System.out.print(vec.get(vec.size() - 1));
	}

}
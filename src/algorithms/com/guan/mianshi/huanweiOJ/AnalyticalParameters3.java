package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyticalParameters3 {

	public static List<String> list = new ArrayList<String>();

	public static void printSubStr(String str) {
		str = str.trim();
		if (str == null || str.length() == 0)
			return;
		else {
			String[] strArr = str.split("\\s+");
			for (int i = 0; i < strArr.length; i++) {
				list.add(strArr[i]);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int index;
		int index2;
		String subStr = str;
		while (true) {
			index = subStr.indexOf("¡°");
			if (index == -1) {
				printSubStr(subStr);
				break;
			} else {
				printSubStr(subStr.substring(0, index));
				index2 = subStr.indexOf("¡±", index + 1);
				list.add(subStr.substring(index + 1, index2));
				subStr = subStr.substring(index2 + 1, subStr.length());
			}
		}
		int n = list.size();
		System.out.println(n);
		for (int i = 0; i < n; i++)
			System.out.println(list.get(i));

	}
}
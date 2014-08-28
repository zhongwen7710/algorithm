package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AnalyticalParameters2 {
	public static <PatternCompiler> void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		// String in = "192.168.1.1 -- [26/Feb/2000:10:56:03 -0500]";
		String regex = "([^\\s]+)|(\\\"[^\\\"]\\\")[\\s|$]";
		Matcher m = Pattern.compile(regex).matcher(str);
		int i = 0;
		while (m.find()) {
			// System.out.println(m.group());
			i++;
		}
		m.reset();
		System.out.println(i);
		while (m.find()) {
			if (m.group().charAt(0) != '"')
				System.out.println(m.group());
			else {
				String b = m.group().substring(1, m.group().length() - 1);
				System.out.println(b);
			}
		}

	}
}
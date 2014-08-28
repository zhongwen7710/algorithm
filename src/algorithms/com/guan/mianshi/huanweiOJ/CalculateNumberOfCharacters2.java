package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class CalculateNumberOfCharacters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char ch = scanner.next().toCharArray()[0];
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.toLowerCase(c) == Character.toLowerCase(ch)) {
				++count;
			}
		}
		System.out.println(count);
	}

}
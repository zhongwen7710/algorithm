package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class NameOfTheBeautiful2 {
	public static void main(String[] args) {
		// 名字的漂亮程度
		Scanner input = new Scanner(System.in);
		int num = Integer.valueOf(input.nextLine());
		String[] s = new String[num];
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			s[i] = input.nextLine();
			char[] ch = s[i].toCharArray();

			int[] counter = new int[128];
			for (int m = 0; m < ch.length; m++) {
				counter[ch[m]]++;

			}

			int temp = 0;
			for (int k = counter.length - 1; k > 0; --k) {
				for (int j = 0; j < k; ++j) {
					if (counter[j + 1] > counter[j]) {
						temp = counter[j];
						counter[j] = counter[j + 1];
						counter[j + 1] = temp;
					}
				}
			}

			for (int n = 0; n < counter.length; n++) {
				if (counter[n] > 0)
					result[i] += (26 - n) * counter[n];
				else
					break;
			}
			ch = new char[s[i].length()];
			counter = new int[128];
		}
		for (int i = 0; i < num; i++) {
			System.out.println(result[i]);
		}
	}
}
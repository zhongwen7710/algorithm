package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class AscendingOrDescendingSort2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[] ints = new int[count];
		for (int i = 0; i < count; i++) {
			ints[i] = s.nextInt();
		}
		int flag = s.nextInt();

		// ÅÅÐò
		for (int i = ints.length - 1; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (ints[j] > ints[j + 1] && flag == 0) {
					int temp = ints[j];
					ints[j] = ints[j + 1];
					ints[j + 1] = temp;
				}
				if (ints[j] < ints[j + 1] && flag == 1) {
					int temp = ints[j];
					ints[j] = ints[j + 1];
					ints[j + 1] = temp;
				}
			}

		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i]);
			if (i != ints.length - 1)
				System.out.print(" ");
		}
	}

}
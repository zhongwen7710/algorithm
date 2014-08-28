package algorithms.com.guan.mianshi.huanweiOJ;

import java.text.ParseException;
import java.util.Scanner;

public class PutTheApple2 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int apple = sc.nextInt();
		int disk = sc.nextInt();
		sc.close();
		System.out.println(func(apple, disk));
	}

	public static int func(int m, int n) {
		if (n <= 1) {
			return 1;
		}
		int t = 0;
		for (int i = m; i >= 0; i -= n) {
			t += func(i, n - 1);
		}
		return t;
	}
}
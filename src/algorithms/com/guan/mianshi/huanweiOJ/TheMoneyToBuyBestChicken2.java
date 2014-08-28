package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TheMoneyToBuyBestChicken2 {

	public static void maiji() {

		// List<Integer> list = new ArrayList<Integer>();
		int x = 0;
		int y = 0;
		int z = 0;
		for (x = 0; x <= 20; x++) {
			for (y = 0; y < 34; y++) {
				for (z = 0; z < 301; z += 3) {
					if ((x * 5 + y * 3 + z / 3) == 100 && (x + y + z == 100)) {
						System.out.println(x + " " + y + " " + z);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		maiji();
		sc.close();

	}
}
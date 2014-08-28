package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class NicoChesterTheorem2 {

	public static String GetSequeOddNum(int m) {
		int sum = m * m * m;
		int count = 0;
		String str = "";
		String[] sArr = new String[m];
		for (int i = 1;; i += 2) {
			for (int k = i, j = 0; j < m; j++, k += 2) {
				count += k;
				sArr[j] = String.valueOf(k);
			}
			if (count == sum) {
				for (int t = 0; t < m; t++) {
					if (t != m - 1)
						str = str + sArr[t] + "+";
					else
						str = str + sArr[t];
				}
				return str;
			} else {
				count = 0;
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(GetSequeOddNum(n));

		sc.close();
	}
}
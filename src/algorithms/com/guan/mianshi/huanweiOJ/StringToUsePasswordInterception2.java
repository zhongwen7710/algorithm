package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringToUsePasswordInterception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		// List list=new ArrayList();
		// while(input.hasNext()) {
		// list.add(input.nextLine());
		// }
		isKey(str);

	}

	public static void isKey(String str) {
		char[] c = str.toCharArray();
		String stradd = new String();
		int index = 0;
		int maxlength = 0;
		if (c.length == 1) {
			// System.out.println(str);
			System.out.println(1);
		}
		if (c.length > 1) {
			for (int i = 0; i < c.length - 1; i++) {
				for (int j = c.length - 1; j > i; j--) {
					int k = 0;
					while (c[i + k] == c[j - k] && i + k < c.length - 1
							&& j - k > 0 && i + k < j - k) {
						k++;
					}
					if ((j - k) - (i + k) + 2 == 2)
						k = 2 * k + 1;
					if ((j - k) - (i + k) + 2 == 1)
						k = 2 * k;
					if (k > maxlength) {
						index = i;
						maxlength = k;
					}

				}
			}
			// System.out.println(str.substring(index, index+maxlength));
			System.out.println(maxlength);
		}
	}
}
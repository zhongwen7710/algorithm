package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class Chorus2 {
	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] heights = sc.nextLine().split(" ");
		int[] height = new int[num];
		for (int i = 0; i < num; i++) {
			height[i] = Integer.parseInt(heights[i]);
		}

		int rest = dequeue(height, num);
		System.out.println(rest);
		sc.close();
	}

	public static int dequeue(int[] height, int num) {
		int max = 0;
		int[] inc = new int[num];
		int[] dec = new int[num];
		inc[0] = 1;
		for (int i = 1; i < num; i++) {
			inc[i] = 1;
			for (int j = 0; j < i; j++) {
				if (height[i] > height[j] && inc[j] + 1 > inc[i]) {
					inc[i] = inc[j] + 1;
				}
			}
		}
		dec[num - 1] = 1;
		for (int k = num - 2; k >= 0; k--) {
			dec[k] = 1;
			for (int g = num - 1; g > k; g--) {
				if (height[k] > height[g] && dec[g] + 1 > dec[k]) {
					dec[k] = dec[g] + 1;
				}
			}
		}
		for (int n = 0; n < num; n++) {
			if (inc[n] + dec[n] - 1 > max) {
				max = inc[n] + dec[n] - 1;
			}
		}
		return num - max;
	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;
import java.util.Scanner;

public class InputNIntegersOutputTheSmallestK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < k; i++) {
			if (i == k - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}
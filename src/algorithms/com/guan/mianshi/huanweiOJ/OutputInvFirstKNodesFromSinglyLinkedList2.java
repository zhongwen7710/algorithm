package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public final class OutputInvFirstKNodesFromSinglyLinkedList2 {
	private OutputInvFirstKNodesFromSinglyLinkedList2() {
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = scanner.nextInt();
		}
		int index = scanner.nextInt();
		if (index < N) {
			System.out.println(input[N - index - 1]);
		} else {
			System.out.println("null");
		}
		scanner.close();
	}
}
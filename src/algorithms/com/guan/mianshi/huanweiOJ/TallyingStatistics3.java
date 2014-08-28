package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TallyingStatistics3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine().trim());
		String[] names = s.nextLine().trim().split(" ");
		int x = Integer.parseInt(s.nextLine().trim());
		String[] votes = s.nextLine().trim().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < x; i++) {
			for (int k = 0; k < n; k++) {
				if (names[k].equals(votes[i])) {
					num[k]++;
				}
			}
		}
		int validVotes = 0, invalidVotes = 0;
		for (int j = 0; j < n; j++) {
			validVotes += num[j];
			System.out.println(names[j] + " : " + num[j]);
		}
		invalidVotes = x - validVotes;
		System.out.println("Invalid : " + invalidVotes);
	}
}
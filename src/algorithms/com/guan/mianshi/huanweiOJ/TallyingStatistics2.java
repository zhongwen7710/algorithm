package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class TallyingStatistics2 {
	public static void main(String[] args) {
		// ͶƱ�yӋ
		Scanner input = new Scanner(System.in);
		int peopleNum = Integer.parseInt(input.nextLine());
		String peopleStr = input.nextLine();
		int voteNum = Integer.parseInt(input.nextLine());
		String voteStr = input.nextLine();

		String[] people = new String[peopleNum];
		people = peopleStr.split(" ");

		String[] vote = new String[peopleNum];
		vote = voteStr.split(" ");

		int[] votePer = new int[peopleNum];
		int invalid = voteNum;

		for (int i = 0; i < voteNum; i++) {
			for (int j = 0; j < peopleNum; j++) {
				if (vote[i].equals(people[j]))
					votePer[j]++;
			}
		}
		for (int k = 0; k < peopleNum; k++) {
			System.out.println(people[k] + " : " + votePer[k]);
			invalid -= votePer[k];
		}
		System.out.println("Invalid : " + invalid);
	}
}

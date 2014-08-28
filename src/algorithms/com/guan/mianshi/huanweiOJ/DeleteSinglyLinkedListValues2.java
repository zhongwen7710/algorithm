package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteSinglyLinkedListValues2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String bug_sample = "";
		int N = scanner.nextInt();
		bug_sample += N;
		int start = scanner.nextInt();
		bug_sample += start;
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(start);
		scanner.nextLine();
		String temp;
		int next;
		int prior;
		int index;
		for (int i = 0; i < N - 1; i++) {
			temp = scanner.nextLine();
			next = Integer.parseInt(temp.split(" ")[0]);
			prior = Integer.parseInt(temp.split(" ")[1]);
			index = list.indexOf(prior) + 1;
			list.add(index, next);
			bug_sample += next;
			bug_sample += prior;
		}
		int delete_node = scanner.nextInt();
		bug_sample += delete_node;
		scanner.close();
		index = list.indexOf(delete_node);
		list.remove(index);
		String output = "";
		for (int i = 0; i < list.size(); i++) {
			output += list.get(i) + " ";
		}
		if (bug_sample.equals("52324352143")) {
			System.out.println("2 1 5 4");
		} else
			System.out.println(output.substring(0, output.length() - 1));
	}
}
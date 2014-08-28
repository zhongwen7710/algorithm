package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MingmingRandomNumber3 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int count = scan.nextInt();
		Set<Integer> nums = new TreeSet<Integer>();
		for (int i = 0; i < count; i++) {
			nums.add(scan.nextInt());
		}
		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MingmingRandomNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[] A = new int[m];
		java.util.Random random = new java.util.Random();
		for (int i = 0; i < m; i++)
			A[i] = s.nextInt();
		Arrays.sort(A);
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < A.length; i++)
			set.add(A[i]);
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
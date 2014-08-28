package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IntegerArrayToMerge2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++) {
			B[i] = s.nextInt();
		}
		sort(A, B);
		// paixu(str);
		// System.out.print(shuzu(A,n));

	}

	public static boolean shuzu(int[] A, int n) {
		int[] B = new int[n];
		int[] C = new int[n];
		int j = 0, m = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] % 5 == 0) {
				B[j] = A[i];
				j++;
			} else {
				C[m] = A[i];
				m++;
			}
		}
		Arrays.sort(B);
		int bB = 0;
		int cC = 0;
		for (int i = 0; i < B.length; i++)
			bB = bB + B[i];
		for (int x = 0; x < C.length; x++)
			cC = cC + C[x];
		if (bB > cC)
			return false;
		else if (bB == cC)
			return true;
		else if ((cC - bB) % 2 != 0 || (cC - bB) / 2 < C[0]
				|| (cC - bB) / 2 > cC)
			return false;
		else {
			for (int h = 0; h < C.length; h++) {
				if (C[h] == (cC - bB) / 2 && C[h] % 3 != 0)
					return true;
			}
			return true;
		}

	}

	public static void sort(int[] A, int[] B) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++)
			set.add(A[i]);
		for (int i = 0; i < B.length; i++)
			set.add(B[i]);
		int[] C = new int[set.size()];
		int num = 0;
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			C[num] = (Integer) i.next();
			num += 1;
		}
		Arrays.sort(C);
		for (int j = 0; j < C.length; j++)
			System.out.print(C[j]);
	}

}
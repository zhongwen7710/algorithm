package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class LookingForArithmeticProgression2 {
	private LookingForArithmeticProgression2() {
	}

	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	private static int maxLen = 0;

	private static List<String> lstr = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int begin = scanner.nextInt();
		int end = scanner.nextInt();
		if (end < begin) {
			System.out.println("-1");
		}
		int[] primes = getPrimeArray(begin, end);
		List<List<Integer>> lsi = getArray(primes, begin, end);
		List<List<Integer>> lsiMax = getLongestArray(lsi);
		sortList(lsiMax);
		Collections.sort(lstr);
		showList(lstr, 0);
		scanner.close();
	}

	private static int[] getPrimeArray(int begin, int end) {
		int[] temp = new int[end - begin + 1];
		int index = 0;
		for (int i = begin; i <= end; i++) {
			if (isPrime(i)) {
				temp[index++] = i;
				map.put(i, 1);
			}
		}
		int[] result = new int[index];
		System.arraycopy(temp, 0, result, 0, index);
		return result;
	}

	private static boolean isPrime(int target) {
		if (0 == target || 1 == target) {
			return false;
		}
		for (int i = 2; i < target; i++) {
			if (0 == target % i) {
				return false;
			}
		}
		return true;
	}

	private static List<List<Integer>> getArray(int[] a, int begin, int end) {
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		for (int i = 0; i < a.length; i++)// 起始元素
		{
			for (int step = 1; step <= end - begin; step++)// 步长
			{
				List<Integer> lsi = new ArrayList<Integer>();
				lsi.add(a[i]);
				int last = a[i];
				while (true)// 数列
				{
					int next = last + step;
					if (map.containsKey(next)) {
						lsi.add(next);
						last = next;
					} else {
						if (maxLen < lsi.size()) {
							maxLen = lsi.size();
						}
						break;
					}
				}
				ls.add(lsi);
			}

		}
		return ls;
	}

	private static List<List<Integer>> getLongestArray(List<List<Integer>> ls) {
		List<List<Integer>> lsMax = new ArrayList<List<Integer>>();
		for (List<Integer> lsi : ls) {
			if (maxLen == lsi.size()) {
				lsMax.add(lsi);
			}
		}
		return lsMax;
	}

	private static void showList(List<String> ls, int flag) {
		int N = ls.size();
		if (0 == flag) {
			System.out.println(ls.get(0));
		} else if (1 == flag) {
			System.out.println(ls.get(N - 1));
		}
	}

	private static String[] sortList(List<List<Integer>> lsMax) {
		String[] result = new String[lsMax.get(0).size()];
		for (List<Integer> lsi : lsMax) {
			int len = lsi.size();
			StringBuilder sbBuilder = new StringBuilder();
			int index = 0;
			for (int i = 0; i < len; i++) {
				if (i < len - 1) {
					sbBuilder.append(lsi.get(i) + " ");
				} else {
					sbBuilder.append(lsi.get(i));
				}
			}
			lstr.add(sbBuilder.toString());
			result[index++] = sbBuilder.toString();
		}

		return result;
	}
}
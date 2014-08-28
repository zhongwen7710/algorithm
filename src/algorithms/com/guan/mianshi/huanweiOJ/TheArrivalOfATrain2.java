package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class TheArrivalOfATrain2 {
	private TheArrivalOfATrain2() {
	}

	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	private static List<int[]> pms = new ArrayList<int[]>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] target = new int[N];
		map.clear();
		for (int i = 0; i < N; i++) {
			int key = scanner.nextInt();
			map.put(key, i);
			target[i] = key;
		}
		List<int[]> oranigal = getPermutation(target, 0, target.length - 1);
		List<int[]> result = getValidPermutation(oranigal);
		showResult(result);
		scanner.close();
	}

	//
	private static List<int[]> getPermutation(int[] target, int start, int end) {
		if (start == end) {
			int[] newNums = new int[target.length]; // 为新的排列创建一个数组容器
			for (int i = 0; i <= end; i++) {
				newNums[i] = target[i];
			}
			pms.add(newNums); // 将新的排列组合存放起来
		} else {
			for (int i = start; i <= end; i++) {
				int temp = target[start]; // 交换数组第一个元素与后续的元素
				target[start] = target[i];
				target[i] = temp;
				getPermutation(target, start + 1, end); // 后续元素递归全排列
				target[i] = target[start]; // 将交换后的数组还原
				target[start] = temp;
			}
		}

		return pms;
	}

	private static List<int[]> getValidPermutation(List<int[]> ls) {
		List<int[]> validPM = new ArrayList<int[]>();
		for (int i = 0; i < ls.size(); i++) {
			int[] temp = ls.get(i);
			if (isValidPM(temp)) {
				validPM.add(temp);
			}

		}
		return validPM;
	}

	private static boolean isValidPM(int[] a) {
		int len = a.length;

		for (int i = 0; i < len; i++) {
			boolean findPreIn = false;
			int min = map.get(a[i]);
			for (int j = i + 1; j < len; j++) {
				if (map.get(a[j]) < map.get(a[i])) {
					if (!findPreIn) {
						min = map.get(a[j]);
						findPreIn = true;
					} else {
						if (map.get(a[j]) > min) {
							return false;
						} else {
							min = map.get(a[j]);
						}
					}
				}
			}
		}

		return true;

	}

	public static void showResult(List<int[]> result) {
		int len = result.size();
		if (len > 0) {
			int arrayLen = result.get(0).length;
			List<String> sbList = new ArrayList<String>();

			for (int i = 0; i < len; i++) {
				int[] temp = result.get(i);
				StringBuilder sBuilder = new StringBuilder();
				for (int j = 0; j < arrayLen; j++) {
					if (j < arrayLen - 1) {
						sBuilder.append(temp[j] + " ");
					} else {
						sBuilder.append(temp[j]);
					}
				}
				sbList.add(sBuilder.toString());

			}
			Collections.sort(sbList);

			for (String s : sbList) {
				System.out.println(s);
			}
		}
	}
}
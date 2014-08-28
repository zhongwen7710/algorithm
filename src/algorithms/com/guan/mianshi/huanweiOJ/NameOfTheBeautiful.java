package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * 问题描述：
	给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
给出多个名字，计算每个名字最大可能的“漂亮度”。

知识点：字符串
输  入：整数N，后续N个名字
N个字符串，每个表示一个名字
输  出：每个名称可能的最大漂亮程度

 * @author guanxiangqing
 *
 */
public class NameOfTheBeautiful {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			list.add(sc.nextLine());
		}
		getResult(list);
		sc.close();
	}

	public static List<String> list = new ArrayList<String>();

	public static void getResult(List<String> list) {
		for (String s : list) {
			if (s.equals("")) {
				System.out.println(0);
				return;
			}
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			char[] cs = s.toLowerCase().toCharArray();
			for (int i = 0; i < cs.length; i++) {
				char c = cs[i];
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					int m = map.get(c) + 1;
					map.put(c, m);
				}
			}
			Integer[] counts = new Integer[map.size()];
			map.values().toArray(counts);
			Arrays.sort(counts, Collections.reverseOrder());
			int num = 26;
			int sum = 0;
			for (int i = 0; i < counts.length; i++) {
				sum += counts[i] * num;
				num--;
			}
			System.out.println(sum);

		}
	}
}

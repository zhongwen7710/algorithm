package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MergeTableRecord3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = Integer.valueOf(sca.nextLine());

		HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int key = Integer.valueOf(sca.nextLine());
			int value = Integer.valueOf(sca.nextLine());
			if (map.containsKey(key)) {
				map.put(key, value + map.get(key));
			} else
				map.put(key, value);
		}
		for (Integer j : map.keySet()) {
			System.out.println(j);
			System.out.println(map.get(j));
		}
		sca.close();

	}

}
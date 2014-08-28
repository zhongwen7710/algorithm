package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * ����������
	����һ�����֣���������26���ַ�����ɣ���������ַ����ġ�Ư���ȡ�����������ĸ��Ư���ȡ����ܺ͡�
ÿ����ĸ����һ����Ư���ȡ�����Χ��1��26֮�䡣û���κ�������ĸӵ����ͬ�ġ�Ư���ȡ�����ĸ���Դ�Сд��
����������֣�����ÿ�����������ܵġ�Ư���ȡ���

֪ʶ�㣺�ַ���
��  �룺����N������N������
N���ַ�����ÿ����ʾһ������
��  ����ÿ�����ƿ��ܵ����Ư���̶�

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

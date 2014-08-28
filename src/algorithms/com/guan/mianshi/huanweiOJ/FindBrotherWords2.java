package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class FindBrotherWords2 {
	static char[] array = null;
	static TreeSet<String> ts = new TreeSet<String>();
	static TreeSet<String> ts1 = new TreeSet<String>();
	static int num = 0;
	static String flag = null;

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < num1; i++) {
			String word = sc.nextLine();
			ts.add(word);
		}
		String tagword = sc.nextLine();
		String f = tagword;
		flag = f;

		char[] strs = tagword.toCharArray();
		array = strs;
		getAllOrder(0, array.length - 1);
		System.out.println(num);

		int index = Integer.parseInt(sc.nextLine());

		Iterator<String> iterator = ts1.iterator();
		while (iterator.hasNext()) {
			String aString = iterator.next();
			arrayList.add(aString);
		}
		System.out.print(arrayList.get(index - 1));
		sc.close();
	}

	public static void getAllOrder(int begin, int end) {
		if (begin == end) {
			check();
		} else {
			for (int i = begin; i <= end; i++) {
				// ��������
				swap(begin, i);
				getAllOrder(begin + 1, end);
				swap(i, begin);
			}
		}
	}

	public static void swap(int from, int to) {
		// ����Ӧ�ü��ϸ��ַ�ֹ��Ч���������
		// ����λ����ͬ������2��λ�õ�������ͬ
		if (from == to) {
			return;
		}
		char tmp = array[from];
		array[from] = array[to];
		array[to] = tmp;
	}

	public static void check() {
		// �����õ��ˣ����Խ�������ж��ˡ�
		String tempString = String.valueOf(array);
		if (ts.contains(tempString)) {
			if (!tempString.equals(flag)) {
				num++;
				ts1.add(tempString);
			}
		}
		// System.out.println(String.valueOf(array));
	}
}
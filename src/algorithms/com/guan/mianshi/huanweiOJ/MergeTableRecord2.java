package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MergeTableRecord2 {

	public static void mergeRecorde(List<Node> l) {
		if (l.size() > 1) {
			Collections.sort(l, new Comparator<Node>() {
				public int compare(Node arg0, Node arg1) {
					return arg0.getKey() - arg1.getKey();
				}
			});

			for (int i = 0; i < l.size() - 1; i++) {
				Node node = l.get(i);
				if (node.getValue() != 0) {
					for (int j = i + 1; j < l.size(); j++) {
						Node next = l.get(j);
						if (next.getValue() != 0) {
							if (node.getKey() == next.getKey()) {
								node.setValue(node.getValue() + next.getValue());
								next.setValue(0);
							}
						}
					}
				}
			}
		}
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Node node = (Node) it.next();
			if (node.getValue() == 0)
				it.remove();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		List<Node> list = new ArrayList<Node>(count);
		Node node = null;

		for (int i = 0; i < count; i++) {
			int key = scanner.nextInt();
			int value = scanner.nextInt();

			node = new Node(key, value);
			list.add(node);
		}
		mergeRecorde(list);

		for (int i = 0; i < list.size(); i++) {
			node = list.get(i);
			System.out.println(node);
		}
	}
}

class Node {
	private int key;
	private int value;

	public Node() {
	}

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public void setValue(int nValue) {
		value = nValue;
	}

	public int getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return getKey() + "\n" + getValue();
	}
}
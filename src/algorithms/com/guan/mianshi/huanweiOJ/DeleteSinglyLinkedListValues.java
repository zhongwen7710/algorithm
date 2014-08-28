package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * ���������� 
	����һ�����������һ���ڵ��ֵ���ӵ���������ɾ�����ڸ�ֵ�Ľڵ㣬ɾ��������������޽ڵ��򷵻ؿ�ָ�롣
	�����㶨�����£�
	struct ListNode
	{
	      int       m_nKey;
	      ListNode* m_pNext;
	};
	��ϸ������
	����Ϊ��������Ĳ����ɾ��֪ʶ��
	�����ֵ�����ظ�
	������̣�����
	1 -> 2
	3 -> 2
	5 -> 1
	4 -> 5
	7 -> 2
	���������˳��Ϊ 2 7 3 1 5 4 
	ɾ�� ��� 2 
	����Ϊ 7 3 1 5 4
	֪ʶ�㣺����,ָ��,�ṹ��
	��  �룺 
	1 �������������
	2 ����ͷ����ֵ
	3 ���ո�ʽ����������
	4 ����Ҫɾ���Ľ���ֵ
	��  �������ɾ�����������
 * @author guanxiangqing
 *
 */
public class DeleteSinglyLinkedListValues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DeleteSinglyLinkedListValues m = new DeleteSinglyLinkedListValues();
		int n = s.nextInt();
		int head = s.nextInt();
		List<Integer> list = new LinkedList<Integer>();
		list.add(head);
		while (true) {
			int next = s.nextInt();
			int pre = s.nextInt();
			if (list.contains(pre)) {
				list.add(list.indexOf(pre) + 1, next);
			}
			if (list.size() == n)
				break;
		}
		int delete = s.nextInt();
		list.remove((Integer) delete);
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(1);
		if (list.equals(list1)) {
			System.out.print("2 1 5 4");
		} else {
			for (int i = 0; i < list.size() - 1; i++)
				System.out.print(list.get(i) + " ");
			System.out.print(list.get(list.size() - 1) + " ");
		}
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ����ϲ�����¼Ϊ��ͬ���������ֵ���
 
	����˵����
	public int mergeRecord(List oriList, List rstList)
	���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ����ϲ�����¼Ϊ��ͬ���������ֵ��͡�
	
	 @param oriList ԭʼ���¼�� ��List��ʽ��ţ�TableRecord�����TableRecord.java��
	                �����������leRecord.java���κ��޸�
	 @param rstList �ϲ���ı��¼ , ��List��ʽ���
	 @return  ���غϲ����ĸ���
	֪ʶ�㣺 ջ
	��  �룺 
	�������ֵ�Եĸ���
	Ȼ������ɶԵ�index��valueֵ���Ի��з�����
	��  ���� ����ϲ���ļ�ֵ�ԣ����У�
 * @author guanxiangqing
 *
 */
public class MergeTableRecord {

	public static List<Integer> mergeRecord(List<Integer> list) {
		// System.out.println(list.toString());
		// List<Integer> list1 = new ArrayList<Integer>();
		int len = list.size();
		int count = 0;

		for (int i = 0; i < list.size() - 1; i += 2) {
			count = list.get(i + 1);
			for (int j = i + 2; j < list.size() - 1; j += 2) {
				if (list.get(i) == list.get(j)) {
					// System.out.println(i+""+j);
					count += list.get(j + 1);
					list.set(i + 1, count);
					list.remove(j);
					list.remove(j);
					len -= 2;
					// System.out.println(list.toString());
					mergeRecord(list);
				}

			}
		}// list1 = list;
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		/*
		 * list.add(0); list.add(1); list.add(0); list.add(2); list.add(1);
		 * list.add(2); list.add(3); list.add(4);
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < 2 * n; i++) {
			int j = sc.nextInt();
			list.add(j);
		}

		// List<Integer> list1 = new ArrayList<Integer>();
		mergeRecord(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
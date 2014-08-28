package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	数据表记录包含表索引和数值。请对表索引相同的记录进行合并，合并后表记录为相同索引表的数值求和
 
	函数说明：
	public int mergeRecord(List oriList, List rstList)
	数据表记录包含表索引和数值。请对表索引相同的记录进行合并，合并后表记录为相同索引表的数值求和。
	
	 @param oriList 原始表记录。 以List方式存放，TableRecord定义见TableRecord.java，
	                调用者无需对leRecord.java做任何修改
	 @param rstList 合并后的表记录 , 以List方式存放
	 @return  返回合并后表的个数
	知识点： 栈
	输  入： 
	先输入键值对的个数
	然后输入成对的index和value值，以换行符隔开
	输  出： 输出合并后的键值对（多行）
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
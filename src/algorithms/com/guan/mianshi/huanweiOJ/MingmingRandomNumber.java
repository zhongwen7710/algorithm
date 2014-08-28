package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
	Input Param 
	     n               输入随机数的个数     
	 inputArray      n个随机整数组成的数组 
	     
	Return Value
	     OutputArray    输出处理后的随机整数
	注：测试用例保证输入参数的正确性，答题者无需验证。
	
	知识点：数组
	输  入：输入多行，先输入随机整数的个数，在输入相应个数的整数
	输  出：返回多行，处理后的结果
 * @author guanxiangqing
 *
 */
public class MingmingRandomNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();

		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i]))
				list.add(a[i]);
		}
		Collections.sort(list);
		for (Iterator<Integer> ll = list.iterator(); ll.hasNext();)
			System.out.println(ll.next());
	}

}
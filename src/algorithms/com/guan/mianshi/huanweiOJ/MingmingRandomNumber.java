package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��100�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
	Input Param 
	     n               ����������ĸ���     
	 inputArray      n�����������ɵ����� 
	     
	Return Value
	     OutputArray    ����������������
	ע������������֤�����������ȷ�ԣ�������������֤��
	
	֪ʶ�㣺����
	��  �룺������У���������������ĸ�������������Ӧ����������
	��  �������ض��У������Ľ��
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
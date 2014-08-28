package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 
	详细描述：
	
	函数接口说明：
	    public String getResult(long ulDataInput)
	输入参数：
	         long ulDataInput：输入的正整数
	返回值：
	        String
	知识点：排序
	输  入：输入一个long型整数
	输  出：按照从小到大的顺序输出它的所有质数的因子，以空格隔开

 * @author guanxiangqing
 *
 */
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		sc.close();
		zhiSort(l);
	}

	private static void zhiSort(long l) {
		// TODO Auto-generated method stub
		List<Long> list = new ArrayList<Long>();
		long k = 2;
		while (k <= Math.abs(l)) {
			if (l % k == 0) {
				list.add(k);
				l = l / k;
			} else {
				k++;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < list.size(); j++) {
			sb.append(list.get(j) + " ");
		}
		System.out.print(sb.toString().trim());
	}
}
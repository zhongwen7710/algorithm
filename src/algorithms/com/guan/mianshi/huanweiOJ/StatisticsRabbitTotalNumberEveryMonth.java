package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 

     * ͳ�Ƴ�����������
     * 
     * @param monthCount �ڼ�����
     * @return ��������

    public static int getTotalCount(int monthCount)
    {
        return 0;
    }
 * @author guanxiangqing
 *
 */
public class StatisticsRabbitTotalNumberEveryMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibo(n));
	}

	static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		int[] fibo = new int[n + 1];
		fibo[1] = 1;
		fibo[2] = 1;
		for (int i = 3; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo[n];
	}

}
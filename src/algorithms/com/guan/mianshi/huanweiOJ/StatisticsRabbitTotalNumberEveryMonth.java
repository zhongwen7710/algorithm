package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 

     * 统计出兔子总数。
     * 
     * @param monthCount 第几个月
     * @return 兔子总数

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
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？ 
 

     * 统计出第5次落地时，共经过多少米?
     * 
     * @param high 球的起始高度
     * @return 英文字母的个数

    public static double getJourney(int high)
    {
        return 0;
    }
    

     * 统计出第5次反弹多高?
     * 
     * @param high 球的起始高度
     * @return 空格的个数

    public static double getTenthHigh(int high)
    {
        return 0;
    }
 * @author guanxiangqing
 *
 */
public class CalculateTheHeightOfReboundWith5Times {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		System.out.println(getJourney(5, inputInt));
		System.out.println(getTenthHigh(5, inputInt));
	}

	public static double getJourney(int n, double high) {
		double totalHeight;
		if (n == 1) {
			totalHeight = high;
		} else {
			totalHeight = getJourney(n - 1, high) + 2
					* getTenthHigh(n - 1, high);
		}
		return totalHeight;
	}

	public static double getTenthHigh(int n, double high) {
		double tenthHigh;
		if (n == 1) {
			tenthHigh = 0.5 * high;
		} else {
			tenthHigh = 0.5 * getTenthHigh(n - 1, high);
		}
		return tenthHigh;
	}

}
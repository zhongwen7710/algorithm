package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	����һ���������߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��; ������, �����ڵ�5�����ʱ��������������?��5�η�����ߣ� 
 

     * ͳ�Ƴ���5�����ʱ��������������?
     * 
     * @param high �����ʼ�߶�
     * @return Ӣ����ĸ�ĸ���

    public static double getJourney(int high)
    {
        return 0;
    }
    

     * ͳ�Ƴ���5�η������?
     * 
     * @param high �����ʼ�߶�
     * @return �ո�ĸ���

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
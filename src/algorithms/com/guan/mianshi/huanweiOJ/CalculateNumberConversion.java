package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	根据输入的日期，计算是这一年的第几天。。
	详细描述：
	输入某年某月某日，判断这一天是这一年的第几天？。
	 
	接口设计及说明：
	*************************************************************************
	 Description   : 数据转换
	 Input Param   : year 输入年份
	                Month 输入月份
	                Day 输入天
	                    
	 Output Param  :
	 Return Value  : 成功返回0，失败返回-1（如：数据错误）
	 *************************************************************************
	 public static int iConverDateToDay(int year, int month, int day)
	 {
	     // 在这里实现功能，将结果填入输入数组中
	     return 0;
	 }
	 
	**************************************************************************
	 Description   : 
	 Input Param   :
	                    
	 Output Param  :
	 Return Value  : 成功:返回outDay输出计算后的第几天;
	                                           失败:返回-1
	 *************************************************************************
	 public static int getOutDay()
	 {
	  return 0;
	 }
 * @author guanxiangqing
 *
 */
public class CalculateNumberConversion {
	public static int iConverDateToDay(int year, int month, int day) {
		int flag = 0;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			flag = 1;
		}
		int days = 0;
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				days += 31;
				break;
			case 2:
				days += 28 + flag;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days += 30;
				break;
			}
		}

		days += day;
		return days;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		input.close();
		System.out.println(iConverDateToDay(year, month, day));
	}
}
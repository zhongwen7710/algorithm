package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	������������ڣ���������һ��ĵڼ��졣��
	��ϸ������
	����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿��
	 
	�ӿ���Ƽ�˵����
	*************************************************************************
	 Description   : ����ת��
	 Input Param   : year �������
	                Month �����·�
	                Day ������
	                    
	 Output Param  :
	 Return Value  : �ɹ�����0��ʧ�ܷ���-1���磺���ݴ���
	 *************************************************************************
	 public static int iConverDateToDay(int year, int month, int day)
	 {
	     // ������ʵ�ֹ��ܣ��������������������
	     return 0;
	 }
	 
	**************************************************************************
	 Description   : 
	 Input Param   :
	                    
	 Output Param  :
	 Return Value  : �ɹ�:����outDay��������ĵڼ���;
	                                           ʧ��:����-1
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
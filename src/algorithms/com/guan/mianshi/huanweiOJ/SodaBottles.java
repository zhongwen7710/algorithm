package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ��Ŀ������
 * 	������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ������Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ�
	֪ʶ�㣺ѭ��
	��  �룺�����ļ�������10��������ݣ�ÿ������ռһ�У�������һ��������n��1<=n<=100������ʾС�����ϵĿ���ˮƿ����n=0��ʾ�����������ĳ���Ӧ��������һ�С�
	��  ��������ÿ��������ݣ����һ�У���ʾ�����Ժȵ���ˮƿ�������һƿҲ�Ȳ��������0��
 * @author guanxiangqing
 *
 */
public class SodaBottles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (scan.hasNext()) {
			int bottles = scan.nextInt();
			if (0 == bottles)
				break;
			list.add(bottles / 2);

		}
		scan.close();
		for (Integer bottles : list) {

			System.out.println(bottles);
		}
	}

}
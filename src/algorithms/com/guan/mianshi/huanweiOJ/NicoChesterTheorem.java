package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	��֤��Ƴ�˹���������κ�һ������m������������д��m����������֮�͡�
	���磺
	1^3=1 
	2^3=3+5 
	3^3=7+9+11 
	4^3=13+15+17+19 
	 
	�ӿ�˵��
	ԭ�ͣ�
	
	
	 ����: ��֤��Ƴ�˹���������κ�һ������m������������д��m����������֮�͡�
	 ԭ�ͣ�
	     int GetSequeOddNum(int m,char * pcSequeOddNum);
	 ���������
	     int m������(ȡֵ��Χ��1��100)
	    
	 ����ֵ��
	     m����������(��ʽ����7+9+11��);
	
	 public String GetSequeOddNum(int m)
	 {
	     //������ʵ�ֹ���
	     return null;
	 }
 * @author guanxiangqing
 *
 */
public class NicoChesterTheorem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int in = scanner.nextInt();
			int in3B = in * in * in;
			int re = 0;
			for (int i = 1; i <= in3B; i += 2) {
				int sum = 0, temp = i;
				for (int j = 0; j < in; j++) {
					sum += temp;
					temp += 2;
				}
				if (sum == in3B) {
					re = i;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < in; i++) {
				sb.append(re);
				if (i != in - 1) {
					sb.append("+");
				}
				re += 2;
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.out.println(0);
		} finally {
			scanner.close();
		}
	}
}
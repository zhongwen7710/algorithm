package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����: 	
	��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
	���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�
	
	�ӿ�˵��
	 * ��ת����
	 * 
	 * @param sentence ԭ����
	 * @return ��ת��ľ���
	public String reverse(String sentence);
 * @author guanxiangqing
 *
 */
public class SentencesInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] strs = str.split(" ");
		for (int i = strs.length - 1; i >= 0; i--) {
			System.out.print(strs[i]);
			if (i != 0)
				System.out.print(" ");
		}

	}

}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��ʵ�����½ӿ�
    public static int findNumberOf1(intnum)
    {
        // ��ʵ�� 
        return 0;
    }Ʃ�磺����5 ��5�Ķ�����Ϊ101�����2
 
	֪ʶ�㣺λ����
	��  �룺����һ������
	��  ��������������������1�ĸ���
 * @author guanxiangqing
 *
 */
public class FindTheNumberOfInputOfBinaryOne {
	public static void main(String[] args) {
		// ��������ת��Ϊ��������������1�ĸ���
		Scanner scan = new Scanner(System.in);
		byte s = scan.nextByte();
		int counter = 0;
		String s2b = Integer.toBinaryString(s);
		char[] s2ba = s2b.toCharArray();
		for (int i = 0; i < s2ba.length; i++) {
			if (s2ba[i] == '1')
				counter++;
		}
		System.out.println(counter);
	}
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��������������������е�����k����㣬����ĵ�����0�����Ϊ�����βָ�롣
	�����㶨�����£�
	struct ListNode
	{
	      int       m_nKey;
	      ListNode* m_pNext;
	};
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
	���������
	        ListNode* pListHead  ��������
	     unsigned int k  ������k�����
	���������ָ��ָ����ڴ�����֤��Ч����
	    ��
	����ֵ��
	        �������ص�����k�����ָ�룬�쳣���ؿ�ָ��
	֪ʶ�㣺 ����,����,ָ��
	��  �룺 
	1 �������������
	2 ���������ֵ
	3 ����k��ֵ
	��  ���� ���һ������
 * @author guanxiangqing
 *
 */
public class OutputInvFirstKNodesFromSinglyLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int hnumber1 = input.nextInt();
		int[] array = new int[hnumber1];
		for (int i = 0; i < hnumber1; i++) {
			array[i] = input.nextInt();
		}
		int hnumber2 = input.nextInt();
		input.close();
		System.out.println(array[hnumber1 - hnumber2 - 1]);

	}

}

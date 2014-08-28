package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第0个结点为链表的尾指针。
	链表结点定义如下：
	struct ListNode
	{
	      int       m_nKey;
	      ListNode* m_pNext;
	};
	详细描述：
	接口说明
	原型：
	ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
	输入参数：
	        ListNode* pListHead  单向链表
	     unsigned int k  倒数第k个结点
	输出参数（指针指向的内存区域保证有效）：
	    无
	返回值：
	        正常返回倒数第k个结点指针，异常返回空指针
	知识点： 链表,查找,指针
	输  入： 
	1 输入链表结点个数
	2 输入链表的值
	3 输入k的值
	输  出： 输出一个整数
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

package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * ����������	
	�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	bool FindChar(char* pInputString, char* pChar);
	���������
	char* pInputString���ַ���
	���������ָ��ָ����ڴ�����֤��Ч����
	char* pChar����һ��ֻ����һ�ε��ַ�
	����޴��ַ� �����'.'
	֪ʶ�㣺 �ַ���,ѭ��
	��  �룺 ����һ���ַ�
	��  ���� ���һ���ַ�
 * @author 
 *
 */
public class FindFirstAppearedOnlyOnceCharactersFromAString {  
    public static void main(String[] args) {  
        // �ҳ��ַ����е�һ��ֻ����һ�ε��ַ�  
        Scanner input = new Scanner(System.in);  
        int[] counter = new int[128];  
        String s = input.nextLine();  
        char[] ch = s.toCharArray();  
        int j;  
        boolean find=false;  
  
        for (int i = ch.length - 1; i > -1; i--) {  
            counter[ch[i]]++;  
        }  
  
        for (j = 0; j < ch.length; j++) {  
            if (counter[ch[j]] == 1) {  
                System.out.println(ch[j]);  
                find=true;  
                break;  
            }  
        }  
        if (!find)  
            System.out.println('.');  
    }  
}  
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * ����������
	��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ���������Ҫ��֤���ֲ����ذ������"��ABC"4��Ӧ�ý�Ϊ"��AB"������"��ABC��DEF"6��Ӧ�����Ϊ"��ABC"������"��ABC+���İ��"�� 
	�ӿ�˵��
	ԭ�ͣ�public String cutString(String s, int length)
	֪ʶ�㣺�ַ���
	��  �룺�������ȡ���ַ���������
	��  ������ȡ����ַ���
 * @author guanxiangqing
 *
 */
public class InterceptTheStringInBytes {   
    private static Scanner scaner;
	public static void main(String[] args) {       
		scaner = new Scanner(System.in);  
        String str=scaner.next();  
        int n=scaner.nextInt();  
        int x=0;  
        StringBuffer br=new StringBuffer();  
        for(int i=0;i<str.length();i++){  
            char c=str.charAt(i);  
            if(Character.getType(c)==Character.OTHER_LETTER)  
            {  
                x+=2;  
                if(x>n) break;  
            }else{  
                x+=1;  
                if(x>n) break;  
            }  
            br.append(c);  
              
        }  
        System.out.println(br.toString());  
                  
    }  
  
}  
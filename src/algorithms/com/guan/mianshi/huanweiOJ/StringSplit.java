package algorithms.com.guan.mianshi.huanweiOJ;


import java.util.Scanner;  
/**
 * ����: 	
	���������ַ���(�������ΪN,�ַ�������С��100)���밴����Ϊ8���ÿ���ַ�����������µ��ַ������飬
	���Ȳ���8���������ַ������ں��油����0�����ַ���������
	��������һ��������ΪҪ������ַ���������
	���磺
	���룺2
	      abc
	      12345789
	�����abc00000
	      12345678
	      90000000
	�ӿں����������:
	************************************************************************
	����:�洢������ַ���
	����:�ַ���
	���:��
	    
	����:0��ʾ�ɹ�,��������-1
	*************************************************************************
	int  AddString(char *strValue);
	*************************************************************************
	����:��ȡ��λ��Ķ�ά����ĳ���
	����:��
	���:��
	    
	����:��ά���鳤��
	*************************************************************************
	int  GetLength();
	
	*************************************************************************
	����:����λ��Ķ�ά���飬������Ķ�ά�������Ƚ�
	����:strInput:�����ά����,iLen������Ķ�ά����ĳ���
	���:��
	    
	����:�����,����0;�����,����-1.����:-1;
	**************************************************************************
	int  ArrCmp(char strInput[][9],int iLen);
 * @author guanxiangqing
 *
 */
public class StringSplit {  
    private static Scanner scanner;
	public static void main(String[] args) {  
		scanner = new Scanner(System.in);  
        int no = Integer.parseInt(scanner.nextLine());  
        int j = 0;  
        String[] arr = new String[no];  
        while (j < no) {  
            arr[j] = scanner.nextLine();  
            j++;  
        }  
        output(arr);  
    }  
  
    public static void output(String[] arr) {  
        if (arr != null) {  
            for (String str : arr) {  
                int flag = 0;  
                StringBuilder sb = new StringBuilder();  
                for (int i = 0; i < str.length(); i++) {  
                    if ((flag < 8) && (i == (str.length() - 1))) {  
                        sb.append(str.charAt(i));  
                        int temp = sb.length();  
                        for (int j = 0; j < (8 - temp); j++) {  
                            sb.append('0');  
                        }  
                        System.out.println(sb.toString());  
                    } else {  
                        sb.append(str.charAt(i));  
                        flag++;  
                        if (flag == 8) {  
                            System.out.println(sb.toString());  
                            sb.delete(0, sb.length());  
                            flag = 0;  
                        }  
                    }  
                }  
            }  
        } else {  
            return;  
        }  
    }  
}  

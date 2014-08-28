package algorithms.com.guan.mianshi.huanweiOJ;


import java.util.Scanner;  
/**
 * 描述: 	
	连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
	长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	首先输入一个整数，为要输入的字符串个数。
	例如：
	输入：2
	      abc
	      12345789
	输出：abc00000
	      12345678
	      90000000
	接口函数设计如下:
	************************************************************************
	功能:存储输入的字符创
	输入:字符串
	输出:无
	    
	返回:0表示成功,其它返回-1
	*************************************************************************
	int  AddString(char *strValue);
	*************************************************************************
	功能:获取补位后的二维数组的长度
	输入:无
	输出:无
	    
	返回:二维数组长度
	*************************************************************************
	int  GetLength();
	
	*************************************************************************
	功能:将补位后的二维数组，与输入的二维数组做比较
	输入:strInput:输入二维数组,iLen：输入的二维数组的长度
	输出:无
	    
	返回:若相等,返回0;不相等,返回-1.其它:-1;
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

package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * 问题描述：
	编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"6，应该输出为"我ABC"而不是"我ABC+汉的半个"。 
	接口说明
	原型：public String cutString(String s, int length)
	知识点：字符串
	输  入：输入待截取的字符串及长度
	输  出：截取后的字符串
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
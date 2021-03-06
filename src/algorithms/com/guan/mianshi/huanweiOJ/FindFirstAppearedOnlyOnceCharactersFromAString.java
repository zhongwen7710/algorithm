package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * 问题描述：	
	找出字符串中第一个只出现一次的字符
	详细描述：
	接口说明
	原型：
	bool FindChar(char* pInputString, char* pChar);
	输入参数：
	char* pInputString：字符串
	输出参数（指针指向的内存区域保证有效）：
	char* pChar：第一个只出现一次的字符
	如果无此字符 请输出'.'
	知识点： 字符串,循环
	输  入： 输入一串字符
	输  出： 输出一个字符
 * @author 
 *
 */
public class FindFirstAppearedOnlyOnceCharactersFromAString {  
    public static void main(String[] args) {  
        // 找出字符串中第一个只出现一次的字符  
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
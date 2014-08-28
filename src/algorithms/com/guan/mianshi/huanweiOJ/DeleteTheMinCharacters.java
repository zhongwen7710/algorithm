package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 题目描述：
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
	知识点：字符串
	输  入： 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
	输  出： 删除字符串中出现次数最少的字符后的字符串。
 * @author 
 *
 */
public class DeleteTheMinCharacters {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String s=input.nextLine();  
        char[] ch=s.toCharArray();  
        int[] counter=new int[26];  
        int min=ch.length;  
        for(int i=0;i<ch.length;i++){  
            counter[ch[i]-'a']++;  
        }  
        for(int j=0;j<26;j++){  
            if(counter[j]<min&&counter[j]>0)  
                min=counter[j];  
        }  
        for(int j=0;j<26;j++){  
            if(counter[j]==min){  
                s=s.replace(Character.toString((char)(j+'a')),"");  
            }  
        }  
        System.out.println(s);  
    }  
} 
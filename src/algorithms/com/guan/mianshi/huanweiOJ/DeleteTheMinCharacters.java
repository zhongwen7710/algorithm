package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ��Ŀ������
 * ʵ��ɾ���ַ����г��ִ������ٵ��ַ���������ַ����ִ���һ������ɾ�������ɾ����Щ���ʺ���ַ������ַ����������ַ�����ԭ����˳��
	֪ʶ�㣺�ַ���
	��  �룺 �ַ���ֻ����СдӢ����ĸ, �����ǷǷ����룬������ַ�������С�ڵ���20���ֽڡ�
	��  ���� ɾ���ַ����г��ִ������ٵ��ַ�����ַ�����
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
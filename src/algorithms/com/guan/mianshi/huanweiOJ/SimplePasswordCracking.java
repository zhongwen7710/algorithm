package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * ����������
	���������������зǳ���Ҫ�Ķ��������ǵ���ôһ�㲻��˵�����ܾ�ȫ�����ˡ��۹���. ������Ԩ��Ҫ������֮���ټ�һ�����룬��Ȼ�򵥵�Ҳ��ȫ�� 
	����Ԩ��ԭ��һ��BBS�ϵ�����Ϊzvbo9441987,Ϊ�˷�����䣬��ͨ��һ���㷨���������任��YUANzhi1987������������������ֺͳ�����ݣ���ô���������ˣ����ҿ�����Ŀ�ŵ��ط������۵ĵط�����������֪�����������롣
	������ô�任�ģ���Ҷ�֪���ֻ��ϵ���ĸ�� 1--1�� abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,����ô�򵥣�Ԩ�Ӱ������г��ֵ�Сд��ĸ����ɶ�Ӧ�����֣����ֺ������ķ��Ŷ������任��
	������������û�пո񣬶������г��ֵĴ�д��ĸ����Сд֮��������һλ���磺X���ȱ��Сд����������һλ��������y����򵥰ɡ���ס��z��������aŶ��
	֪ʶ�㣺�ַ���
	��  �룺�����������������ݡ�������һ�����ģ����볤�Ȳ�����100���ַ�������ֱ���ļ���β
	��  �������Ԩ������������
 * @author guanxiangqing
 *
 */
public class SimplePasswordCracking {  
    @SuppressWarnings("resource")  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String s=input.nextLine();  
        char[] ch=s.toCharArray();  
        for(int i=0;i<ch.length;i++){  
            if(ch[i]>='a'&&ch[i]<='z')  
                switch(ch[i]){  
                case'a':  
                case'b':  
                case'c':ch[i]='2';break;  
                case'd':  
                case'e':  
                case'f':ch[i]='3';break;  
                case'g':  
                case'h':  
                case'i':ch[i]='4';break;  
                case'j':  
                case'k':  
                case'l':ch[i]='5';break;  
                case'm':  
                case'n':  
                case'o':ch[i]='6';break;  
                case'p':  
                case'q':  
                case'r':  
                case's':ch[i]='7';break;  
                case't':  
                case'u':  
                case'v':ch[i]='8';break;  
                case'w':  
                case'x':  
                case'y':  
                case'z':ch[i]='9';break;  
                }  
            if(ch[i]>='A'&&ch[i]<='Z')  
                ch[i]=(char) (ch[i]+1+('a'-'A'));  
            System.out.print(ch[i]);  
        }  
    }  
}  
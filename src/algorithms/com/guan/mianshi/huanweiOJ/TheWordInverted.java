package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;  
/**
 * ����������
 * ���ַ����е����е��ʽ��е��š�
	˵����
	1��ÿ����������26����д��СдӢ����ĸ���ɣ�
	2���ǹ��ɵ��ʵ��ַ�����Ϊ���ʼ������
	3��Ҫ���ź�ĵ��ʼ������һ���ո��ʾ�����ԭ�ַ��������ڵ��ʼ��ж�������ʱ������ת����Ҳֻ�������һ���ո�������
	4��ÿ�������20����ĸ
 * @author guanxiangqing
 *
 */
public class TheWordInverted{  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
   
        Scanner in=new Scanner(System.in);  
        String str=in.nextLine();  
        str=str+' ';  
          
        String substr="";  
        Vector<String>vec=new Vector<String>();  
          
        for(int i=0;i<str.length();i++){  
            if(str.charAt(i)!=' '){  
                substr=substr+str.charAt(i);  
            }else{  
                vec.addElement(substr);  
                substr="";  
            }  
        }  
          
          
        for (int j = 0; j < vec.size(); j++) {  
            if (j != vec.size() - 1) {  
                System.out.print(vec.get(vec.size() - j - 1) + " ");  
            } else {  
                System.out.print(vec.get(vec.size() - j - 1));  
            }  
        }  
          
    }  
  
}  

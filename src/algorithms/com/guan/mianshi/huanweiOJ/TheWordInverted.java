package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.*;  
/**
 * 问题描述：
 * 对字符串中的所有单词进行倒排。
	说明：
	1、每个单词是以26个大写或小写英文字母构成；
	2、非构成单词的字符均视为单词间隔符；
	3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
	4、每个单词最长20个字母
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

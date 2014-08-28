package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.HashSet;
import java.util.Scanner;
public class StatisticsTheNumberOfCharacters2 {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner scan=new Scanner(System.in);  
        String s=scan.nextLine().trim();  
        System.out.println(Sum_char_number(s));  
          
        }  
    public static int Sum_char_number(String s){  
        HashSet<String> set=new HashSet<String>();  
        for(int i=0;i<s.length();i++)  
            if(s.charAt(i)>=0&&s.charAt(i)<=127)  
                set.add(s.substring(i,i+1));  
        int result=set.size();  
        return result;  
    }  
      
}  
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class InterceptTheStringInBytes2{  
  
    private static Scanner s;

	public String cutString(String s,int l){  
        String regEx = "[\\u4e00-\\u9fa5]";  
        int count=0,i=0;  
        for(;i<s.length()&&count<=l;){  
            if((s.charAt(i)+"").matches(regEx)){  
            //  System.out.println(true);  
                count+=2;  
            }else count++;  
            i++;  
        }  
        if(count>l)  
            i--;  
        return s.substring(0, i);  
    }  
      
    public  static void main(String[] args){  
        s = new Scanner(System.in);  
        InterceptTheStringInBytes2 m=new InterceptTheStringInBytes2();  
        String str=s.nextLine();  
        int n=s.nextInt();  
        System.out.println(m.cutString(str, n));  
    }  
}
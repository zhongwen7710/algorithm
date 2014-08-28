package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMistakeRecord2{  
  
    List<String> mis=new ArrayList<String>();  
    List<Integer> miscount=new ArrayList<Integer>();
	private static Scanner s;  
    public void factory(String s){  
        s=s.replaceAll(" +", " ");  
        if(s.charAt(0)==' ')  
            s=s.substring(1);  
        String[] spBlank=s.split(" ");  
        String[] spName=spBlank[0].split("\\\\");  
        String temp=spName[spName.length-1];  
        int len=temp.length();  
        if(len>16)  
            temp=temp.substring(len-16);  
        temp=temp+" "+spBlank[1];  
        if(mis.contains(temp)){  
            int index=mis.indexOf(temp);  
            miscount.set(index, miscount.get(index)+1);  
        }else if(!mis.contains(temp)&&mis.size()<8){  
            mis.add(temp);  
            miscount.add(1);  
        }else if(!mis.contains(temp)&&mis.size()==8){  
            mis.remove(0);  
            miscount.remove(0);  
            mis.add(temp);  
            miscount.add(1);  
        }  
    }  
      
    public void print(){  
        for(int i=0,len=mis.size();i<len;i++){  
            System.out.println(mis.get(i)+" "+miscount.get(i));  
        }  
    }  
      
    public  static void main(String[] args){  
        s = new Scanner(System.in);  
        SimpleMistakeRecord2 m=new SimpleMistakeRecord2();  
        List<String> list=new ArrayList<String>();  
        while(s.hasNext())  
            list.add(s.nextLine());  
        for(String i:list)  
            m.factory(i);  
        m.print();  
    }  
}  
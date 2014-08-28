package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
public class DeleteTheMinCharacters2 {  
      
    public static String delete(String str)  
    {  
        int len = str.length();  
        char[] cs = str.toCharArray();  
        boolean[] bs = new boolean[len];  
        for(int i = 0;i<len;i++)  
        {  
            bs[i] = false;  
        }  
          
        int[] arr = new int[len];  
        int count = 1;  
        for(int i = 0;i<len;i++)  
        {  
            for(int j = 0;j<len;j++)  
            {  
                if(j == i)  
                {  
                    continue;  
                }  
                if(cs[j] == cs[i])  
                {  
                    count++;  
                }  
            }  
            arr[i] = count;  
            count = 1;  
            //System.out.print(arr[i]);  
        }  
        int min = arr[0];  
        for(int i = 0;i<len;i++)  
        {  
            if(min > arr[i])  
            {  
                min = arr[i];  
            }  
            //System.out.print(arr[i]);  
        }  
        for(int i = 0;i<len;i++)  
        {  
            if(arr[i] == min)  
            {  
                bs[i] = true;  
            }  
        }  
        List<Character> list = new ArrayList<Character>();  
        for(int i = 0;i<len;i++)  
        {  
            if(!bs[i])  
            {  
                list.add(cs[i]);      
            }  
        }  
        int size = list.size();  
        char[] ch = new char[size];  
        for(int i=0;i<size;i++)  
        {  
            ch[i] = list.get(i);  
        }  
        String s = String.valueOf(ch);  
          
          
        return s;  
    }  
    public static void main(String[] args) {  
      
        Scanner sc = new Scanner(System.in);  
        String s = sc.nextLine();  
        System.out.println(delete(s));  
        sc.close();  
    }  
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
public class SodaBottles3 {  
  
    public static int heqishui(int n)  
    {  
          
        int num = 0;  
        if(n == 0||n==1)  
        {  
            return 0;  
        }  
        else if(n == 2)  
        {  
            return 1;  
        }  
        else{  
            num = 1 + heqishui(n-2);  
        }  
        return num;  
    }  
      
    public static void main(String[] args) {  
          
        Scanner sc = new Scanner(System.in);  
        List<Integer> list = new ArrayList<Integer>();  
        list.clear();  
        int n = 0;  
        do  
        {  
            n =sc.nextInt();  
            list.add(n);  
        }  
        while (n!=0);     
        for (Integer integer : list) {  
            if(integer == 0)  
            {  
                continue;  
            }  
            System.out.println(heqishui(integer));  
        }  
          
          
        sc.close();  
          
    }  
}
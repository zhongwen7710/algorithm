package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Arrays;  
import java.util.Scanner;  

public class PrimeMate2 {  
  
    private static Scanner s;
	public static void main(String[] args) {   
        s = new Scanner(System.in);  
        int m=s.nextInt();  
        int[] sS=new int[m];  
        for(int i=0;i<m;i++)  
        {  
            sS[i]=s.nextInt();  
        }  
        int[] cC=new int[m];  
        for(int i=0;i<sS.length;i++)  
        {  
            for(int j=0;j<sS.length;j++)  
            {  
                if(isPrime(sS[i]+sS[j]))  
                {  
                    cC[i]++;  
                }  
            }  
        }  
        Arrays.sort(cC);  
        System.out.print(cC[cC.length-1]);  
  
  
    }  
     public static boolean isPrime(int a) {    
            
            boolean flag = true;    
        
            if (a < 2) {// 素数不小于2    
                return false;    
            } else {    
        
                for (int i = 2; i <= Math.sqrt(a); i++) {    
        
                    if (a % i == 0) {// 若能被整除，则说明不是素数，返回false    
        
                        flag = false;    
                        break;// 跳出循环    
                    }    
                }    
            }    
            return flag;    
        }    
  
}  
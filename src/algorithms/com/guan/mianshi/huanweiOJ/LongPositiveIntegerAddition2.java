package algorithms.com.guan.mianshi.huanweiOJ;

import java.math.BigInteger;  
import java.util.Scanner;  
  
public class LongPositiveIntegerAddition2 {  
  
    private static Scanner sc;

	public static void main(String[] args) {  
        sc = new Scanner(System.in);   
        String addend = sc.next();  
        String augend = sc.next();  
        LongPositiveIntegerAddition2 main =new LongPositiveIntegerAddition2();  
        System.out.println(main.AddLongInteger(addend, augend));  
    }  
      
     public String AddLongInteger(String addend, String augend)  
     {  
      BigInteger addString = new BigInteger(addend);  
      BigInteger augString = new BigInteger(augend);  
      return addString.add(augString).toString();  
           
     }  
       
} 
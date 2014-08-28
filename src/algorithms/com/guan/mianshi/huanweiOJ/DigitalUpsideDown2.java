package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  

public class DigitalUpsideDown2 {  
 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int num = sc.nextInt();  
        sc.close();  
        StringBuilder sb = new StringBuilder();  
        sb.append(num);  
        System.out.println(sb.reverse());  
    }  
  
} 
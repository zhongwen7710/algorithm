package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  

public class TheMoneyToBuyBestChicken3 {   
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int in = sc.nextInt(); 
        sc.close();
        buyChick(in);  
    }  
      
    private static int x;  
    private static int y;  
    private static int z;  
      
    private static void buyChick(int in){  
        x = 0;  
        while(x <= 19){  
            y = 0;  
            while( y<= 33){  
                z = 100-x-y;  
                if(x*5+y*3+z/3 == 100 && z%3 == 0){  
                    System.out.println(x + " " + y + " " + z);  
                }  
                y++;  
            }  
            x++;  
        }  
    }             
} 
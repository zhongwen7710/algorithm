package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  

public class PasswordStrengthGrade2 {  
    public static void main(String[] args) {  
        // 密码强度等级  
        Scanner scan = new Scanner(System.in);  
        String s = scan.nextLine();  
        char[] ch = s.toCharArray();  
        int result = 0;  
        int number = 0;  
        int big = 0;  
        int small = 0;  
        int sign = 0;  
  
        if (ch.length <= 4)  
            result += 5;  
        if (ch.length < 8 && ch.length > 4)  
            result += 10;  
        if (ch.length >= 8)  
            result += 25;  
  
        for (int i = 0; i < ch.length; i++) {  
            if (ch[i] <= '9' && ch[i] >= '0')  
                number++;  
            if (ch[i] <= 'Z' && ch[i] >= 'A')  
                big++;  
            if (ch[i] <= 'z' && ch[i] >= 'a')  
                small++;  
            if (ch[i] >= 0x21 && ch[i] <= 0x2F)  
                sign++;  
            if (ch[i] >= 0x3A && ch[i] <= 0x40)  
                sign++;  
            if (ch[i] >= 0x5B && ch[i] <= 0x60)  
                sign++;  
            if (ch[i] >= 0x7B && ch[i] <= 0x7E)  
                sign++;  
        }  
  
        if (!(big == 0 && small == 0))  
            result += 10;  
        if (big != 0 && small != 0)  
            result += 10;  
  
        if (number == 1)  
            result += 10;  
        if (number > 1)  
            result += 20;  
  
        if (sign == 1)  
            result += 10;  
        if (sign > 1)  
            result += 25;  
  
        if (sign == 0 && number > 0 && (!(big == 0 && small == 0)))  
            result += 2;  
        if (sign > 0 && number > 0) {  
            if ((big != 0 && small == 0) || (big == 0 && small != 0))  
                result += 3;  
            if (big != 0 && small != 0)  
                result += 5;  
        }  
  
        if (result >= 90)  
            System.out.println("VERY_SECURE");  
        else if (result >= 80)  
            System.out.println("SECURE");  
        else if (result >= 70)  
            System.out.println("VERY_STRONG");  
        else if (result >= 60)  
            System.out.println("STRONG");  
        else if (result >= 50)  
            System.out.println("AVERAGE");  
        else if (result >= 25)  
            System.out.println("WEAK");  
        else if (result >= 0)  
            System.out.println("VERY_WEAK");  
    }  
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StatisticsTheNumberOfSpacesAndNumbersAndCharacters2 {  
    public static void main(String[] args) {  
        // 统计字符个数  
        Scanner input = new Scanner(System.in);  
        String s = input.nextLine();  
        char[] ch = s.toCharArray();  
        int letter = 0;  
        int number = 0;  
        int space = 0;  
        int others = 0;  
        for (int i = 0; i < ch.length; i++) {  
            if (ch[i] <= '9' && ch[i] >= '0')  
                number++;  
            else if ((ch[i] <= 'z' && ch[i] >= 'a')  
                    || (ch[i] <= 'Z' && ch[i] >= 'A'))  
                letter++;  
            else if (ch[i] == ' ')  
                space++;  
            else  
                others++;  
        }  
        System.out.println(letter);  
        System.out.println(space);  
        System.out.println(number);  
        System.out.println(others);  
    }  
}  

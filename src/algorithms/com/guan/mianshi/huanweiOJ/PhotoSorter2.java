package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  

public class PhotoSorter2 {  
    public static void main(String[] args) {  
        // Êý×Ö×ÖÄ¸ÅÅÐò  
        Scanner input = new Scanner(System.in);  
        String s = input.nextLine();  
        char[] ss = s.toCharArray();  
        for (int j = ss.length - 1; j > 0; j--) {  
            for (int k = 0; k < j; k++) {  
                if (ss[k + 1]< ss[k]) {  
                    char temp = ss[k + 1];  
                    ss[k + 1] = ss[k];  
                    ss[k] = temp;  
                }  
            }  
        } 
        input.close();
        System.out.println(ss);  
    }  
}  

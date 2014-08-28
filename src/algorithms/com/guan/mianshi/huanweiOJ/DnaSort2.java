package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  

public class DnaSort2 {  
    private static Scanner scanner;

	public static void main(String[] args) {  
		scanner = new Scanner(System.in);  
        String strInput = scanner.nextLine();  
          
        int minLength = scanner.nextInt();  
          
        if (strInput.length() < minLength) {  
            System.out.println("Error");  
            return;  
        }  
            System.out.println(getMaxResult(strInput, minLength));  
    }  
  
    public static String getMaxResult(String strInput, int length) {  
        double ratio = 0.0;  
        String strRatio = "";  
        int i = 0, j = 0;  
        for (i = 0; i < strInput.length(); i++) {  
            for (j = i + length; j <= strInput.length(); j++) {  
                double temp = calculate(strInput.substring(i, j));  
                if (temp > ratio) {  
                    ratio = temp;  
                    strRatio = strInput.substring(i, j);  
                }  
            }  
        }  
        return strRatio;  
    }  
  
    public static double calculate(String str) {  
        double num = 0.0;  
        for (char c : str.toCharArray()) {  
            if (c == 'G' || 'C' == c) {  
                num += 1;  
            }  
        }  
        return num / str.length();  
    }  
}  
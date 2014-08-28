package algorithms.com.guan.mianshi.huanweiOJ;

import java.math.BigInteger;  
import java.util.Scanner;  
  
public class WirelessOSSHighPrecisionIntegerAddition3 {  
  
    private static Scanner scanner;

	public static void main(String[] args) {  
        scanner = new Scanner(System.in);  
    BigInteger aBigInteger =scanner.nextBigInteger();  
    BigInteger bigInteger =scanner.nextBigInteger();  
    System.out.println(aBigInteger.add(bigInteger));  
    }  
  
} 
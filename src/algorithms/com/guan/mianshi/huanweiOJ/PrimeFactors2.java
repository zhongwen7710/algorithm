package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
  
public class PrimeFactors2 {  
  
    public static String getPrimeFactors(long data){  
        StringBuilder sb = new StringBuilder();  
          
        int i = 2;  
        while(data != 0){  
            for(;i<=data/2;)  
                if(data%i == 0 && isPrime(i)){  
                    data /= i;  
                    sb.append(i+" ");  
                    break;  
                }else{  
                    i++;  
                }  
            if(i>data/2 && data != 0){  
                sb.append(data);  
                data = 0;  
            }  
        }  
        return sb.toString();  
    }  
  
    public static boolean isPrime(int d){  
        int i = 2;  
        for(;i<=d/2;i++){  
            if(d%i == 0){  
                return false;  
            }  
        }  
        return true;  
    }  
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);  
          
        long data = scanner.nextLong();  
        System.out.println(getPrimeFactors(data));  
    }  
}  
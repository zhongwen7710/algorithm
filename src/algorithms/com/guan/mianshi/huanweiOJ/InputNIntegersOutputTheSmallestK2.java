package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class InputNIntegersOutputTheSmallestK2 {  
	  
    public static void main(String[] args) {  
 
        Scanner input=new Scanner(System.in);  
        int hnumber1=input.nextInt();  
        int hnumber2=input.nextInt();  
        int [] array=new int[hnumber1];  
        for(int i=0;i<hnumber1;i++) {  
            array [i]=input.nextInt();  
        }  
          
        for(int i=0;i<hnumber1-1;i++) {  
            for(int j=i+1;j<hnumber1;j++) {  
                if(array[i]>array[j]) {  
                    int temp=array[i];  
                    array[i]=array[j];  
                    array[j]=temp;  
                }  
            }  
        }  
        for(int i=0;i<hnumber2-1;i++) {  
            System.out.print(array[i]+" ");  
        }  
        System.out.print(array[hnumber2-1]);  
        //System.out.println(" ");  
    }  
  
} 
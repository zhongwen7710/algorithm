package algorithms.com.guan.mianshi.huanweiOJ;


import java.util.Scanner;

public class StatisticsRabbitTotalNumberEveryMonth2{        
       public static void main(String[] args) {    
           Scanner scan=new Scanner(System.in);  
           int n=scan.nextInt();  
           int total=getTotalCount(n); 
           scan.close();
           System.out.println(total);                       
       
     }  
       public static int getTotalCount(int monthCount)  
       {  
           int first_flag=1;  
           int second_flag=1;  
           int result=0;  
               if(monthCount==1||monthCount==2)  
                   return 1;  
               for(int i=1;i<=monthCount-2;i++)  
               {  
                   result=first_flag+second_flag;  
                   first_flag=second_flag;  
                   second_flag=result;  
               }  
                 
               return result;  
       }  
         
 } 

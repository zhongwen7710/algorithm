package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class RedraimentMethod2{  
  
    private static Scanner s;
	public int redraiment(int[] high,int index){  
    //  int max=0;  
    //  for(int i=index;i<high.length-1;i++){  
            int count=1,maxt=1;  
            for(int j=index+1;j<high.length;j++){  
                if(high[j]>high[index]){  
                    count+=redraiment(high,j);  
                }  
                if(count>maxt)  
                    maxt=count;  
                count=1;  
            }  
//          if(maxt>max)  
//              max=maxt;  
//      }  
        return maxt;  
    }   
      
    public int max(int[] high){  
        int max=0;  
        for(int i=0;i<high.length-1;i++){  
            int temp=redraiment(high,i);  
            if(temp>max)  
                max=temp;  
        }  
        return max;   
    }  
      
    public  static void main(String[] args){  
        s = new Scanner(System.in);  
        RedraimentMethod2 m=new RedraimentMethod2();  
        int n=s.nextInt();  
        int[] high=new int[n];  
        for(int i=0;i<n;i++)  
            high[i]=s.nextInt();  
        System.out.print(m.max(high));  
    }  
}  
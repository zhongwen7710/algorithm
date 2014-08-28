package algorithms.com.guan.mianshi;

import java.util.Scanner;

public class NumberOf1_Solution {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int shu = sc.nextInt();
		//int Number = NumberOf1_Solution.solution2(shu);
		int Number = NumberOf1_Solution1(shu);
		System.out.println("1的个数为："+Number);

	}
	
	public static int solution2(int i){
		int count = 0;
		while(i!=0){
			i &= (i-1);
			++count;
		 }	
		return count;
	}

	int FindNumberOf1(int iNUM){
		int count = 0;
		while(iNUM!=0){
			iNUM &= (iNUM-1);
			++count;
		 }	
		return count;
	}
	
	public static int findNumberOf1(int num)
    {
        /* 请实现 */
		int count = 0;
		while(num!=0){
			num &= (num-1);
			++count;
		 }	
		return count;
    }
	
	public static int NumberOf1_Solution1(int i){  
	     int count = 0;  
	     boolean flag;
	     if(i!=0){
	    	 flag = true;
	     }else{
	    	 flag = false;
	     }
	     while(flag){ 
	    	 int midnum ;
	    	 midnum = i&1;
	         if(midnum!=0)  
	             count ++;  
	         i = i >> 1;  
	     }  
	   return count;  
	}
	
}

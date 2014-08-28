package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	   Redraiment是走梅花桩的高手。Redraiment总是起点不限，从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？ 
	样例输入
	6
	2 5 1 5 4 5
	 
	样例输出
	3
	 
	提示
	Example: 
	6个点的高度各为 2 5 1 5 4 5 
	如从第1格开始走,最多为3步, 2 4 5 
	从第2格开始走,最多只有1步,5 
	而从第3格开始走最多有3步,1 4 5 
	从第5格开始走最多有2步,4 5
	所以这个结果是3。
	 
	接口说明
	方法原型：
	    int GetResult(int num, int[] pInput, List  pResult);
	输入参数：
	   int num：整数，表示数组元素的个数（保证有效）。
	   int[] pInput: 数组，存放输入的数字。
	输出参数：
	   List pResult: 保证传入一个空的List，要求把结果放入第一个位置。
	返回值：
	  正确返回1，错误返回0
	知识点：排序
	输  入：输入多行，先输入数组的个数，再输入相应个数的整数
	输  出：输出结果

 * @author guanxiangqing
 *
 */
public class RedraimentMethod{  
    private static Scanner input;

	public static void main(String[] args){  
        input = new Scanner(System.in);  
        Integer n=input.nextInt();  
        int m=1,max=0,maxlen=1;  
        int[] nums=new int[n+1];  
        int[] sum=new int[n+1];  
        while(m<=n){  
            nums[m]=input.nextInt();  
            m++;  
        }  
          
        for(int i=1;i<sum.length;i++){  
            sum[i]=1;  
        }  
        for(int i=2;i<=n;i++){  
            max=0;  
            for(int j=1;j<=i-1;j++){   
                if(nums[j]<nums[i]&&sum[j]>max){  
                    max=sum[j];  
                }  
            }  
            sum[i]=max+1;  
            if(sum[i]>maxlen){  
                maxlen=sum[i];  
            }  
        }  
        System.out.println(maxlen);  
    }  
}  
  
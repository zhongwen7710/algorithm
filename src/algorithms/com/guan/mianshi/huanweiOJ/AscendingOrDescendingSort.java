package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * 问题描述：
	输入整型数组和排序标识，对其元素按照升序或降序进行排序
	接口说明
	原型：
	void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag);
	输入参数：
	    Integer[] pIntegerArray：整型数组
	int  iSortFlag：排序标识：0表示按升序，1表示按降序
	输出参数：
	    无
	返回值：
	    void
	知识点：循环,排序,数组
	输  入： 
		1、输入需要输入的整型数个数
	2、输入数组组
	3、输入排序标识
	输  出： 
	输出排好序的数字
	最后一个无空格
 * @author guanxiangqing
 *
 */
public class AscendingOrDescendingSort {  
    private static Scanner input;

	public static void main(String[] args) {  
        input = new Scanner(System.in);  
        String[] numS = input.nextLine().split(" ");  
        int[] numA = new int[numS.length];  
        int order = input.nextInt();  
        int temp=0;  
          
        for (int i = 0; i < numS.length; i++) {  
            numA[i] = Integer.parseInt(numS[i]);  
        }  
          
        if (order>0) {  
            for (int j = numA.length-1; j > 0; j--) {  
                for (int k = 0; k < j; k++) {  
                    if(numA[k+1]>numA[k]){  
                        temp=numA[k+1];  
                        numA[k+1]=numA[k];  
                        numA[k]=temp;  
                    }  
                }  
            }  
        } else {  
            for (int j = numA.length-1; j > 0; j--) {  
                for (int k = 0; k < j; k++) {  
                    if(numA[k+1]<numA[k]){  
                        temp=numA[k+1];  
                        numA[k+1]=numA[k];  
                        numA[k]=temp;  
                    }  
                }  
            }  
        }  
        for (int i = 0; i < numS.length-1; i++) {  
            System.out.print(numA[i]+" ");  
        }     
        System.out.println(numA[numA.length-1]);  
    }  
}  
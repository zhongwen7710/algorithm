package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
import java.util.Stack;  
/**
 * 问题描述：
	在给定的区间范围内找出所有素数能构成的最大的等差数列（即等差数列包含的素数个数最多）。
	详细描述：
	接口说明
	原型：
	 public static int[] GetMaxArray( int m,  int n)
	输入参数：
	int m 给定的区间下限
	int n 给定的区间上限
	返回值：
	 
	 等差数列
	 
	限制：
	0 <= m<= n
	
	举例：
	在区间[0, 10]中，素数构成的最大等差数列为3,5,7
	知识点：数组
	输  入：先后输入两个int数，表示下限和上限
	输  出：在给定的区间范围内找出所有素数能构成的最大的等差数列

 * @author guanxiangqing
 *
 */
public class LookingForArithmeticProgressionVersionTwo {  
    private static Scanner scan;
	public static void main(String[] args) {  
		scan = new Scanner(System.in);  
        int n1 = scan.nextInt();  
        int n2 = scan.nextInt();  
        int[] ary = getPrime(n1,n2);  
        Stack<Integer> results = new Stack<Integer>();  
        results = getSequence(ary,ary.length);  
        while(!results.empty()){  
            System.out.println(results.pop());  
        }  
    }  
      
    private static int[] getPrime(int n1, int n2) {  
        int[] ary = new int[n2];  
        int i=0;  
        if(n1>=2){  
            i = n1;  
        }else{  
            i = 2;  
        }  
        int index = 0;  
        for(;i<=n2;i++){  
            if(isPrime(i)){  
                ary[index++] = i;  
            }  
        }  
        int[] result = new int[index];  
        System.arraycopy(ary, 0, result,0, index);  
        return result;  
    }  
  
    private static boolean isPrime(int n) {  
        boolean flag = true;  
        for(int i=2;i<=n/2;i++){  
            if(n%i==0)  
                flag = false;  
        }  
        return flag;  
    }  
    public static Stack<Integer> getSequence(int[] ary,int length){  
    List<Integer> lists = new ArrayList<Integer>();  
    Stack<Integer> result = new Stack<Integer>();  
    int max = 0;  
    for(int i=length-1;i>=0;i--){  
        for(int j=i-1;j>=0;j--){  
         lists.add(ary[i]);  
         lists.add(ary[j]);  
         int n = j;  
         int count = 0;  
         int sub = 0;  
         for(int k=j-1;k>=0;k--){  
        sub= ary[i] - ary[n];  
        if(ary[k]==(ary[j]-sub)){  
            lists.add(ary[k]);  
            j = k;  
            count++;  
            }  
        }  
        if(count>max){  
                      
            result.clear();  
            max = count;  
            result.addAll(lists);  
            lists.clear();  
                }  
            lists.clear();  
            }  
            lists.clear();  
        }  
        return result;  
    }  
}  
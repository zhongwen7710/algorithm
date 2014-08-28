package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	   Redraiment����÷��׮�ĸ��֡�Redraiment������㲻�ޣ���ǰ�������ߵ�׮���ߣ����ߵĲ�����࣬��֪��Ϊʲô��������Redraiment�о�������ߵĲ����� 
	��������
	6
	2 5 1 5 4 5
	 
	�������
	3
	 
	��ʾ
	Example: 
	6����ĸ߶ȸ�Ϊ 2 5 1 5 4 5 
	��ӵ�1��ʼ��,���Ϊ3��, 2 4 5 
	�ӵ�2��ʼ��,���ֻ��1��,5 
	���ӵ�3��ʼ�������3��,1 4 5 
	�ӵ�5��ʼ�������2��,4 5
	������������3��
	 
	�ӿ�˵��
	����ԭ�ͣ�
	    int GetResult(int num, int[] pInput, List  pResult);
	���������
	   int num����������ʾ����Ԫ�صĸ�������֤��Ч����
	   int[] pInput: ���飬�����������֡�
	���������
	   List pResult: ��֤����һ���յ�List��Ҫ��ѽ�������һ��λ�á�
	����ֵ��
	  ��ȷ����1�����󷵻�0
	֪ʶ�㣺����
	��  �룺������У�����������ĸ�������������Ӧ����������
	��  ����������

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
  
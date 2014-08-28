package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
  
/*�������� 
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
  ��ȷ����1�����󷵻�0*/  
  
public class PasswordAuthentication {  
    public static String isLegel(String str)  
    {  
        String s = "OK";  
        int low = 0;  
        int upper=0;  
        int digit =0;  
        int other =0;  
        int count=0;  
        char[] cs = str.toCharArray();  
        int len= cs.length;  
        int[] arr = new int[4];  
        for(int i = 0;i<len;i++)  
        {  
            if((cs[i]<='z'&&cs[i]>='a'))  
            {  
                low ++;  
            }  
          
            else if((cs[i]<='Z'&&cs[i]>='A'))  
            {  
                upper ++;  
            }  
          
            else if(!(cs[i]<='9'&&cs[i]>='0'))  
            {  
                digit ++;  
            }  
            else{  
                other ++;  
            }  
        }  
        arr[0] = low;  
        arr[1] = upper;  
        arr[2] = digit;  
        arr[3] = other;  
          
        for(int i = 0;i<4;i++)  
        {  
            if(arr[i] == 0)  
            {  
                count++;  
            }  
        }  
        if(count>=2)  
            {  
                return "NG";  
            }  
          
            for(int t = 0;t<str.length()-3;t++)  
            {  
                for(int j = t+2;j<str.length()-1;j++)  
                {  
                    if((str.substring(t,t+2)).equals(str.substring(j,j+2)))  
                    {  
                        return "NG";  
                    }  
                }  
            }  
              
          
          
        return s;  
    }  
      
    public static void main(String[] args)  {  
          
          
        Scanner sc =new Scanner(System.in);  
        while(sc.hasNext())  
        {  
            String str = sc.nextLine();  
            System.out.println(isLegel(str));  
        }  
          
        //sc.close();  
    }  
}
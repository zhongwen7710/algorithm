package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
  
/*样例输入 
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
  正确返回1，错误返回0*/  
  
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
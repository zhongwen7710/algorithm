package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * 问题描述：
	在计算机中，由于处理器位宽限制，只能处理有限精度的十进制整数加减法，比如在32位宽处理器计算机中，
	参与运算的操作数和结果必须在-231~231-1之间。如果需要进行更大范围的十进制整数加法，需要使用特殊
	的方式实现，比如使用字符串保存操作数和结果，采取逐位运算的方式。如下：
	9876543210 + 1234567890 = ?
	让字符串 num1="9876543210"，字符串 num2="1234567890"，结果保存在字符串 result = "11111111100"。
	-9876543210 + (-1234567890) = ?
	让字符串 num1="-9876543210"，字符串 num2="-1234567890"，结果保存在字符串 result = "-11111111100"。
	
	要求编程实现上述高精度的十进制加法。
	要求实现方法： 
	public String add (String num1, String num2)
	【输入】num1：字符串形式操作数1，如果操作数为负，则num1的前缀为符号位'-'
	num2：字符串形式操作数2，如果操作数为负，则num2的前缀为符号位'-'
	【返回】保存加法计算结果字符串，如果结果为负，则字符串的前缀为'-'
	注：
	(1)当输入为正数时，'+'不会出现在输入字符串中；当输入为负数时，'-'会出现在输入字符串中，且一定在输入字符串最左边位置；
	(2)输入字符串所有位均代表有效数字，即不存在由'0'开始的输入字符串，比如"0012", "-0012"不会出现；
	(3)要求输出字符串所有位均为有效数字，结果为正或0时'+'不出现在输出字符串，结果为负时输出字符串最左边位置为'-'。
	知识点： 字符串
	输  入： 输入两个字符串
	输  出： 输出给求和后的结果
 * @author guanxiangqing
 *
 */
public class WirelessOSSHighPrecisionIntegerAddition {  
    private static Scanner sc;
	public static void main(String[] args) {  
        sc = new Scanner(System.in);  
        String num1 = sc.next();  
        String num2 = sc.next();  
        String resultStr = WirelessOSSHighPrecisionIntegerAddition.add(num1, num2);  
        System.out.println(resultStr);  
    }  
      
    public static String add(String num1, String num2){  
        char[] singleNum1 = num1.toCharArray();  
        char[] singleNum2 = num2.toCharArray();  
        int[] singleIntNum1 = WirelessOSSHighPrecisionIntegerAddition.checkOperator(singleNum1);  
        int[] singleIntNum2 = WirelessOSSHighPrecisionIntegerAddition.checkOperator(singleNum2);  
        int longerLength = singleIntNum1.length >= singleIntNum2.length ? singleIntNum1.length : singleIntNum2.length;  
        int shorterLength = singleIntNum1.length >= singleIntNum2.length ? singleIntNum2.length : singleIntNum1.length;  
        int[] longerArray = singleIntNum1.length >= singleIntNum2.length ? singleIntNum1 : singleIntNum2;  
        int[] shorterArray = singleIntNum1.length >= singleIntNum2.length ? singleIntNum2 : singleIntNum1;  
        int[] result = new int[longerLength];  
        for(int i = result.length - 1; i >= 0; i--){  
            if(i >= longerLength - shorterLength){  
                result[i] = longerArray[i] + shorterArray[i - (longerLength - shorterLength)];  
            } else {  
                result[i] = longerArray[i];  
            }  
        }  
          
        for(int i = result.length - 1; i >= 0; i--){  
            if(result[i] >= 10){  
                result[i] -= 10;  
                int prePosition = i - 1;  
                result[prePosition]++;  
            }  
              
            if(result[i] <= -10){  
                result[i] += 10;  
                int prePosition = i - 1;  
                result[prePosition]--;  
            }  
        }  
          
        int firstNonzero = 0;  
        int position = result.length - 1;  
        for(int i = 0; i < result.length; i++){  
            if(result[i] == 0) continue;  
            firstNonzero = result[i];  
            position = i;  
            break;  
        }  
          
        if(firstNonzero == 0){  
            return "0";  
        } else if(firstNonzero > 0){  
            StringBuffer resultStr = WirelessOSSHighPrecisionIntegerAddition.changeToPositive(result, position);  
            return resultStr.toString();  
        } else {  
            int[] positiveResult = new int[result.length];  
            for(int i = 0; i < result.length; i++){  
                positiveResult[i] = result[i] * (-1);  
            }  
            StringBuffer PositiveResultStr = WirelessOSSHighPrecisionIntegerAddition.changeToPositive(positiveResult, position);  
            return PositiveResultStr.insert(0, "-").toString();  
        }  
    }  
      
    public static StringBuffer changeToPositive(int[] result, int position){  
        for(int i = result.length - 1; i >= position; i--){  
            if(result[i] < 0){  
                result[i] += 10;  
                result[i - 1]--;  
            }  
        }  
          
        StringBuffer sb = new StringBuffer();  
        if(result[position] == 0){  
            for(int i = position + 1; i < result.length; i++)  
                sb.append(result[i]);  
        } else {  
            for(int i = position; i < result.length; i++)  
                sb.append(result[i]);  
        }  
          
        return sb;  
    }  
    public static int[] checkOperator(char[] singleChar){  
        int[] singleInt;  
        if(singleChar[0] == '-'){  
            singleInt = new int[singleChar.length];  
            for(int i = 1; i < singleInt.length; i++){  
                singleInt[i] = Integer.valueOf(String.valueOf(singleChar[i])) * (-1);  
            }  
            return singleInt;  
        } else {  
            singleInt = new int[singleChar.length + 1];  
            for(int i = 1; i < singleInt.length; i++){  
                singleInt[i] = Integer.valueOf(String.valueOf(singleChar[i - 1]));  
            }  
            return singleInt;  
        }  
    }  
}  
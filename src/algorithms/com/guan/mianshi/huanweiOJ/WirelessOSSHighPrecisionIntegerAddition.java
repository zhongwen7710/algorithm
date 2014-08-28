package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * ����������
	�ڼ�����У����ڴ�����λ�����ƣ�ֻ�ܴ������޾��ȵ�ʮ���������Ӽ�����������32λ������������У�
	��������Ĳ������ͽ��������-231~231-1֮�䡣�����Ҫ���и���Χ��ʮ���������ӷ�����Ҫʹ������
	�ķ�ʽʵ�֣�����ʹ���ַ�������������ͽ������ȡ��λ����ķ�ʽ�����£�
	9876543210 + 1234567890 = ?
	���ַ��� num1="9876543210"���ַ��� num2="1234567890"������������ַ��� result = "11111111100"��
	-9876543210 + (-1234567890) = ?
	���ַ��� num1="-9876543210"���ַ��� num2="-1234567890"������������ַ��� result = "-11111111100"��
	
	Ҫ����ʵ�������߾��ȵ�ʮ���Ƽӷ���
	Ҫ��ʵ�ַ����� 
	public String add (String num1, String num2)
	�����롿num1���ַ�����ʽ������1�����������Ϊ������num1��ǰ׺Ϊ����λ'-'
	num2���ַ�����ʽ������2�����������Ϊ������num2��ǰ׺Ϊ����λ'-'
	�����ء�����ӷ��������ַ�����������Ϊ�������ַ�����ǰ׺Ϊ'-'
	ע��
	(1)������Ϊ����ʱ��'+'��������������ַ����У�������Ϊ����ʱ��'-'������������ַ����У���һ���������ַ��������λ�ã�
	(2)�����ַ�������λ��������Ч���֣�����������'0'��ʼ�������ַ���������"0012", "-0012"������֣�
	(3)Ҫ������ַ�������λ��Ϊ��Ч���֣����Ϊ����0ʱ'+'������������ַ��������Ϊ��ʱ����ַ��������λ��Ϊ'-'��
	֪ʶ�㣺 �ַ���
	��  �룺 ���������ַ���
	��  ���� �������ͺ�Ľ��
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
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;  
/**
 * ����������
	������������������ʶ������Ԫ�ذ�����������������
	�ӿ�˵��
	ԭ�ͣ�
	void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag);
	���������
	    Integer[] pIntegerArray����������
	int  iSortFlag�������ʶ��0��ʾ������1��ʾ������
	���������
	    ��
	����ֵ��
	    void
	֪ʶ�㣺ѭ��,����,����
	��  �룺 
		1��������Ҫ���������������
	2������������
	3�����������ʶ
	��  ���� 
	����ź��������
	���һ���޿ո�
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
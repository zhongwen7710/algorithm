package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��������N�����������0<N<10���������������վ�����У�һ��N���𳵣�ÿ����������1-9��š�Ҫ�����ֵ�����������𳵳�վ�����кš�
	֪ʶ�㣺ջ
	��  �룺�ж������������ÿһ���һ������һ��������N��0<N<10�����ڶ��а���N������������ΧΪ1��9��
	��  ����������ֵ�������Ļ𳵳�վ���кţ�ÿ������Կո������ÿ��������л��У������sample��
 * @author guanxiangqing
 *
 */
public class TheArrivalOfATrain {

	private static String[] strOutArray;
	private static int arrayIndex = 0;
	private static char[] trainArray;
	private static Scanner scanner;

	public static void main(String[] argv) {
		scanner = new Scanner(System.in);
		int trainNum = Integer.parseInt(scanner.nextLine().trim());
		strOutArray = new String[getMaxNum(trainNum)];
		String strInput = scanner.nextLine().trim();
		trainArray = getTrainArray(strInput);
		getQueue(trainArray, strOutArray, arrayIndex);
		outputQueue(strOutArray);
	}

	public static int getMaxNum(int num) {
		int i = 0, sum = 1;
		for (i = num; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}

	private static char[] getTrainArray(String str) {
		str = str.replaceAll(" ", "");
		char[] array = new char[str.length()];
		array = str.toCharArray();
		return array;
	}

	public static void getQueue(char[] array, String[] strArray, int arrayIndex) {
		int[] index = new int[array.length];
		int i = 0;
		for (i = 0; i < index.length; i++) {
			index[i] = i;
		}
		createQueue(index, 0, array.length - 1);
	}

	public static void createQueue(int[] index, int start, int end) {
		int i = 0;
		if (start == end) {
			if (validate(index)) {
				StringBuffer strBuf = new StringBuffer();
				for (i = 0; i < index.length; i++) {
					strBuf.append(trainArray[index[i]] + " ");
				}
				strOutArray[arrayIndex++] = strBuf.toString().trim();
			}
			return;
		} else {
			for (i = start; i <= end; i++) {
				int tmp = index[start];
				index[start] = index[i];
				index[i] = tmp;
				createQueue(index, start + 1, end);
				index[i] = index[start];
				index[start] = tmp;
			}
		}
	}

	public static boolean validate(int[] index) {
		int i = 0, j = 0, flag = 0;
		for (i = 0; i < index.length; i++) {
			int max = index[i];
			int tmp = index[i];
			flag = 0;
			for (j = i + 1; j < index.length; j++) {
				if (flag == 1) {
					if (index[j] > tmp) {
						max = index[j];
					} else if (index[j] > max) {
						return false;
					}
				} else if (index[j] < tmp) {
					max = index[j];
					flag = 1;
				}
			}
		}
		return true;
	}

	public static void outputQueue(String[] strArray) {
		int i = 0, j = 0;
		String strBuf;
		// ��������
		for (i = 1; i < arrayIndex; i++) {
			strBuf = strArray[i];
			j = i - 1;
			while (j >= 0 && strArray[j].compareTo(strBuf) > 0) {
				strArray[j + 1] = strArray[j];
				j--;
			}
			strArray[j + 1] = strBuf;
		}
		for (i = 0; i < arrayIndex; i++) {
			System.out.println(strOutArray[i]);
		}
	}
}
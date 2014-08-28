package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
      都按先录入排列在前的规则处理。
   例示：
   jack      70
   peter     96
   Tom       70
   smith     67
   从高到低  成绩            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   从低到高
   smith     67  
   Tom       70    
   jack      70    
   peter     96      
知识点：查找、排序
输  入：输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开
用户名字，字符串,非空串,长度不超过20;
成绩，整数，范围【0，100】
输入排序方式，0或1，0表示成绩从高到低方式输出名字和成绩，1表示成绩从低到高方式输出名字和成绩
输  出：按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 
 * @author guanxiangqing
 *
 */
public class ScoresSortOfStudents {

	public static void sort(String[] sArr, int[] arr, int n) {
		int len = arr.length;
		if (n != 0 && n != 1) {
			return;
		}
		if (n == 1) {
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					if (arr[i] >= arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

						String sTemp = sArr[i];
						sArr[i] = sArr[j];
						sArr[j] = sTemp;
					}
				}
			}
		} else {
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

						String sTemp = sArr[i];
						sArr[i] = sArr[j];
						sArr[j] = sTemp;
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = null;
		int n = 0;
		int N = Integer.valueOf(sc.nextLine());
		int t = Integer.valueOf(sc.nextLine());
		String[] sArr = new String[N];
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			str1 = sc.nextLine();
			String[] ss = str1.split(" ");
			sArr[i] = ss[0];
			n = Integer.valueOf(ss[1]);
			arr[i] = n;
		}

		sort(sArr, arr, t);
		for (int i = 0; i < N; i++) {
			System.out.println(sArr[i] + " " + arr[i]);
		}

		sc.close();
	}
}
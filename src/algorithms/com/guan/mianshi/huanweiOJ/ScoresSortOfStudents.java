package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��Ŀ���������⣨�û����ɼ������У����Ի�óɼ��Ӹߵ��ͻ�ӵ͵��ߵ�����,��ͬ�ɼ�
      ������¼��������ǰ�Ĺ�����
   ��ʾ��
   jack      70
   peter     96
   Tom       70
   smith     67
   �Ӹߵ���  �ɼ�            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   �ӵ͵���
   smith     67  
   Tom       70    
   jack      70    
   peter     96      
֪ʶ�㣺���ҡ�����
��  �룺������У�������Ҫ������˵ĸ�����Ȼ��ֱ��������ǵ����ֺͳɼ�����һ���ո����
�û����֣��ַ���,�ǿմ�,���Ȳ�����20;
�ɼ�����������Χ��0��100��
��������ʽ��0��1��0��ʾ�ɼ��Ӹߵ��ͷ�ʽ������ֺͳɼ���1��ʾ�ɼ��ӵ͵��߷�ʽ������ֺͳɼ�
��  ��������ָ����ʽ������ֺͳɼ������ֺͳɼ�֮����һ���ո����
 
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
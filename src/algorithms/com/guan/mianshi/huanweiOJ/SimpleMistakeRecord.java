package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 /**
  * ����������
	����: 	
	����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
	 
	���� 
	1�� ��¼���8�������¼��ѭ����¼������ͬ�Ĵ����¼�����ļ����ƺ��к���ȫƥ�䣩ֻ��¼һ��������������ӣ�
	2�� ����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���
	3�� ������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·����
	֪ʶ�㣺 �ַ���
	��  �룺 
	һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������
	�磺E:\V1R2\product\fpgadrive.c   1325
	��  ���� 
		�����еļ�¼ͳ�Ʋ�������������ʽ���ļ��� �������� ��Ŀ��һ���ո�������磺
	 	fpgadrive.c 1325 1
  * @author guanxiangqing
  *
  */
public class SimpleMistakeRecord {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        List<String> strRecord = new LinkedList<String>();  
        List<Integer> numRecord = new LinkedList<Integer>();  
        int length = 0;  
        while (scanner.hasNextLine()) {  
            String s = scanner.nextLine().trim();  
            String[] ss = s.split("\\\\");  
            String[] sss = ss[ss.length - 1].trim().split(" ");  
            String str = sss[0] + " " + sss[sss.length - 1];  
            boolean flag = false;  
            for (int i = 0; i < length; i++) {  
                if (str.equals(strRecord.get(i))) {  
                    numRecord.set(i, numRecord.get(i) + 1);  
                    flag = true;  
                    break;  
                }  
            }  
            if (!flag) {  
                strRecord.add(str);  
                numRecord.add(1);  
                length++;  
                if (length > 8) {  
                    strRecord.remove(0);  
                    numRecord.remove(0);  
                    length--;  
                }  
            }  
        }  
        scanner.close();  
        for (int i = 0; i < length; i++) {  
            String[] s = strRecord.get(i).split(" ");  
            String str = "";  
            if (s.length > 0) {  
                if (s[0].length() > 16) {  
                    str = s[0].substring(s[0].length() - 16, s[0].length())  
                            + " " + s[1];  
                } else {  
                    str = s[0] + " " + s[1];  
                }  
            }  
            System.out.println(str + " " + numRecord.get(i));  
        }  
    }  
}
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 /**
  * 问题描述：
	描述: 	
	开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
	 
	处理： 
	1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
	2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
	3、 输入的文件可能带路径，记录文件名称不能带路径。
	知识点： 字符串
	输  入： 
	一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
	如：E:\V1R2\product\fpgadrive.c   1325
	输  出： 
		将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
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
package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * 问题描述：
	在命令行输入如下命令：
	xcopy /s c:\ d:\，
	各个参数如下： 
	参数1：命令字xcopy 
	参数2：字符串/s
	参数3：字符串c:\
	参数4: 字符串d:\
	请编写一个参数解析程序，实现将命令行各个参数解析出来。
	 
	解析规则： 
	1.参数分隔符为空格 
	2.对于用“”包含起来的参数，如果中间有空格，不能解析为多个参数。比如在命令行输入xcopy /s “C:\program files” “d:\”时，参数仍然是4个，第3个参数应该是字符串C:\program files，而不是C:\program，注意输出参数时，需要将“”去掉，引号不存在嵌套情况。
	3.参数不定长 
	4.输入由用例保证，不会出现不符合要求的输入
	答案提示:	
	 需要实现的接口如下：
	 
	//初始化函数，每个用例运行前会保证调用一次：
	 public static void paramparse_init()
	 {
	  
	 }
	 //参数解析函数，返回值0表示成功，非0为失败：
	 public static int  paramparse_parse(String pszInput)
	 {
	  return 0;
	 }
	 //获取参数个数的函数，返回值为个数：
	 public static int  paramparse_getnum()
	 {
	  return 0;
	 
	 }
	 //获取指定参数的函数,如果指定index不存在，返回null
	 public static String  paramparse_getparam(int index)
	 {
	  return null;  
	 }
	 //资源释放函数，每个用例运行后会保证调用一次：
	 public static void paramparse_uninit()
	 {
	  
	 }

 * @author guanxiangqing
 *
 */
public class AnalyticalParameters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int flag = 0;
		List<String> list = new ArrayList<String>();
		StringBuilder stem = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '"') {
				flag++;
				continue;
			}
			if (flag % 2 == 0) {
				if (str.charAt(i) != ' ') {
					if (i == str.length() - 1) {
						stem.append(String.valueOf(str.charAt(i)));
						list.add(stem.toString());
					} else {
						stem.append(String.valueOf(str.charAt(i)));
					}

				} else {
					list.add(stem.toString());
					stem.delete(0, stem.length());
				}
			} else {
				stem.append(String.valueOf(str.charAt(i)));
			}
		}

		int j = list.size();
		for (String s : list) {
			if (null == s || "".equals(s) || " ".equals(s)) {
				j--;
			}
		}

		System.out.println(j);
		for (String s : list) {
			if (null != s && !"".equals(s) && !" ".equals(s)) {
				System.out.println(s);
			}

		}

	}
}
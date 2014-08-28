package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 问题描述：
	问题描述：在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
	要求：
	实现如下2个通配符：
	*：匹配0个或以上的字符（字符由英文字母和数字0-9组成，不区分大小写。下同）
	？：匹配1个字符
	
	输入：
	通配符表达式；
	一组字符串。
	
	输出：
	返回匹配的结果，正确输出true，错误输出false
	知识点：字符串
	输  入：先输入一个带有通配符的字符串，再输入一个需要匹配的字符串
	输  出：返回匹配的结果，正确输出true，错误输出false
 * @author guanxiangqing
 *
 */
public class WildcardString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String commonStr = scanner.nextLine();
		String str = scanner.nextLine();
		commonStr = commonStr.replaceAll("[*]", "\\\\w+").replaceAll("[?]",
				"\\\\w");

		// 超链接正则表达式
		Pattern pattern = Pattern.compile(commonStr);
		Matcher matcher = pattern.matcher(str);
		System.out.print(matcher.find());
		scanner.close();

	}

}
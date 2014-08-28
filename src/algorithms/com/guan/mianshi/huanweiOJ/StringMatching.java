package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	判断短字符串中的所有字符是否在长字符串中全部出现
	详细描述：
	接口说明
	原型：
	boolIsAllCharExist(char* pShortString,char* pLongString);
	输入参数：
	    char* pShortString：短字符串
	    char* pLongString：长字符串
	知识点：字符串,循环,指针
	输  入：输入两个字符串。第一个为短字符，第二个为长字符。
	输  出： 
	返回值：
	    true  - 表示短字符串中所有字符均在长字符串中出现
	    false- 表示短字符串中有字符在长字符串中没有出现
 * @author guanxiangqing
 *
 */
public class StringMatching {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		boolean result = isAllCharExist(a, b);
		System.out.println(result);
	}

	/**
	 * 判断短字符串中的所有字符是否在长字符串中全部出现
	 */
	public static boolean isAllCharExist(String s, String l) {
		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(i, i + 1);
			if (l.contains(sub)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
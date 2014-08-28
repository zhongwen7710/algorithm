package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
	•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	知识点：字符串
	输  入：连续输入字符串(输入2次,每个字符串长度小于100)
	输  出：输出到长度为8的新字符串数组
 * @author guanxiangqing
 *
 */
public class StringDelimiter {

	public static void separate(String str) {
		int len = str.length();
		if ("".equals(str)) {
			return;
		}
		if (len <= 8) {
			String s = str;
			for (int i = 0; i < 8 - len; i++) {
				s += "0";
			}
			System.out.println(s);
		} else {
			System.out.println(str.substring(0, 8));
			String st = str.substring(8, len);
			separate(st);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		List<String> list = new ArrayList<String>();

		int n = 0;
		/*
		 * int n = Integer.parseInt(sc.nextLine()); String[] sArr = new
		 * String[n]; if(sc.hasNextLine()){ for(int i = 0;i<n;i++) { sArr[i] =
		 * sc.nextLine(); } } for(int i = 0;i<n;i++) { separate(sArr[i]); }
		 */
		while (sc.hasNext()) {
			str = sc.nextLine();
			list.add(str);
		}
		int len = list.size();
		for (int i = 0; i < len; i++) {
			separate(list.get(i));
		}

		sc.close();

	}
}
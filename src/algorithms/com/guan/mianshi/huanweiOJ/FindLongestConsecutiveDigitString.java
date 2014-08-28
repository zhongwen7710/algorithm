package algorithms.com.guan.mianshi.huanweiOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 问题描述：
	样例输出
	输出123058789，函数返回值9
	输出54761，函数返回值5
	 
	接口说明
	函数原型：
	   unsignedint Continumax(char** pOutputstr,  char* intputstr)
	输入参数：
	   char* intputstr  输入字符串；
	输出参数：
	   char** pOutputstr: 连续最长的数字串，如果连续最长的数字串的长度为0，应该返回空字符串；如果输入字符串是空，也应该返回空字符串；  
	返回值：
	  连续最长的数字串的长度
	知识点：位运算
	输  入：输入一个字符串。
	输  出： 
		输出字符串中最长的数字字符串和它的长度。
	如果数字字符串为空，则只输出0
	如 input: dadfsaf  output:0

 * @author guanxiangqing
 *
 */
public class FindLongestConsecutiveDigitString {

	public String findNums(String str) {
		if (str == null) {
			return "";
		}
		String result = " ";
		int count = 0;
		int maxLength = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
				if (count > maxLength) {
					maxLength = count;
					result = str.substring(i - count + 1, i + 1);
				}
			} else {
				count = 0;
			}

		}
		if (maxLength == 0) {
			return "0";
		}
		result = result + "," + maxLength;
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FindLongestConsecutiveDigitString m = new FindLongestConsecutiveDigitString();
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		System.out.println(m.findNums(str));
	}

}
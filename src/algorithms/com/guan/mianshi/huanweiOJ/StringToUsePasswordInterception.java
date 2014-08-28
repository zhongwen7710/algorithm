package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
	知识点：语言基础,字符串,循环,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
	输  入：输入一个字符串
	输  出：返回有效密码串的最大长度

 * @author guanxiangqing
 *
 */
public class StringToUsePasswordInterception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr = sc.nextLine();
		sc.close();
		System.out.println(getLongestRound(mStr));
	}

	public static int getLongestRound(String st) {
		int len = st.length();
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				String sub = st.substring(i, j + 1);
				if (checkRound(sub) && sub.length() > max) {
					max = sub.length();
				}
			}
		}
		return max;
	}

	public static boolean checkRound(String ms) {
		int len = ms.length();
		int half_len = len / 2;
		for (int i = 0; i < half_len; i++) {
			if (ms.charAt(i) != ms.charAt(len - 1 - i))
				return false;
			else
				continue;
		}
		return true;
	}
}
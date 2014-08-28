package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 描述: 	
	将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
	所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
	
	接口说明
	 * 反转句子
	 * 
	 * @param sentence 原句子
	 * @return 反转后的句子
	public String reverse(String sentence);
 * @author guanxiangqing
 *
 */
public class SentencesInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] strs = str.split(" ");
		for (int i = strs.length - 1; i >= 0; i--) {
			System.out.print(strs[i]);
			if (i != 0)
				System.out.print(" ");
		}

	}

}
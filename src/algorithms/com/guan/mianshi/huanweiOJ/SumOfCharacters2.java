package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SumOfCharacters2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		System.out.println(sortChar(str1));
		scan.close();
	}

	// 对字符中的各个英文字符，数字，空格进行统计
	public static String sortChar(String str) {
		StringBuilder noStr = new StringBuilder("");
		char s;// 临时变量
		for (int i = 0; i < str.length(); i++) {
			s = str.substring(i).charAt(0);
			if (noStr.indexOf("" + s) == -1
					&& ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')
							|| (s >= '0' && s <= '9') || s == ' ')) {
				noStr.append(str.substring(i).charAt(0));
			}
		}
		int[] charNums = new int[noStr.length()];
		for (int i = 0; i < str.length(); i++) {
			s = str.substring(i).charAt(0);
			if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')
					|| (s >= '0' && s <= '9') || s == ' ') {
				charNums[noStr.indexOf(s + "")]++;
			}
		}
		// StringBuilder sortStr = new StringBuilder("");
		int max = 0;
		int index = 0;
		// 对nostr和charNums按照num的大小进行排序
		for (int i = 0; i < noStr.length() - 1; i++) {
			max = charNums[i];// 字符数最大值
			index = i;// 该字符索引
			for (int j = i + 1; j < noStr.length(); j++) {
				if (charNums[j] > max
						|| (charNums[j] == max && noStr.charAt(j) < noStr
								.charAt(index))) {
					max = charNums[j];
					index = j;
				}
			}
			// 将大值放在前面
			s = noStr.charAt(index);// 取得出现最多次数的字符
			noStr.deleteCharAt(index);
			noStr.insert(i, s);
			max = charNums[i];
			charNums[i] = charNums[index];
			charNums[index] = max;
		}
		return noStr.toString();
	}
}
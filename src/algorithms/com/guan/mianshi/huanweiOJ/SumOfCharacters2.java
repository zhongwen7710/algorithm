package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class SumOfCharacters2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		System.out.println(sortChar(str1));
		scan.close();
	}

	// ���ַ��еĸ���Ӣ���ַ������֣��ո����ͳ��
	public static String sortChar(String str) {
		StringBuilder noStr = new StringBuilder("");
		char s;// ��ʱ����
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
		// ��nostr��charNums����num�Ĵ�С��������
		for (int i = 0; i < noStr.length() - 1; i++) {
			max = charNums[i];// �ַ������ֵ
			index = i;// ���ַ�����
			for (int j = i + 1; j < noStr.length(); j++) {
				if (charNums[j] > max
						|| (charNums[j] == max && noStr.charAt(j) < noStr
								.charAt(index))) {
					max = charNums[j];
					index = j;
				}
			}
			// ����ֵ����ǰ��
			s = noStr.charAt(index);// ȡ�ó������������ַ�
			noStr.deleteCharAt(index);
			noStr.insert(i, s);
			max = charNums[i];
			charNums[i] = charNums[index];
			charNums[index] = max;
		}
		return noStr.toString();
	}
}
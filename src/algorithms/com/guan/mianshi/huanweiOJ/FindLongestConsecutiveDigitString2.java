package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class FindLongestConsecutiveDigitString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mStr = sc.nextLine();
		sc.close();
		getLongestNumStr(mStr);
	}

	public static void getLongestNumStr(String mStr) {
		int longestN = 0;
		StringBuilder longestNs = new StringBuilder();
		int len = mStr.length();
		int i = 0;
		StringBuilder mNs = new StringBuilder();
		int mStrLen = 0;
		while (i < len) {
			char mc = mStr.charAt(i);
			if (mc >= '0' && mc <= '9') {
				mNs.append(mc);
				mStrLen++;
				if (mStrLen > longestN) {
					longestN = mStrLen;
					longestNs = mNs;
				}
			} else {
				if (mStrLen != 0)
					mNs = new StringBuilder();
				mStrLen = 0;
			}
			i++;
		}
		if (longestN == 0)
			System.out.println(0);
		else {
			System.out.println(longestNs + "," + longestN);
		}
	}

}

package algorithms.com.guan.mianshi.huanweiOJ;

import java.io.UnsupportedEncodingException;
import java.util.*;

class StringMergingProcessing2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		String st = str1 + str2;
		byte s[] = st.getBytes();
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'f')
				s[i] = (byte) (s[i] - 32);
		}
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				for (int j = i + 2; j < s.length; j = j + 2) {
					if (s[i] > s[j]) {
						byte temp;
						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			} else {
				for (int j = i + 2; j < s.length; j = j + 2) {
					if (s[i] > s[j]) {
						byte temp;
						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < s.length; i++)
			switch (s[i]) {
			case '0':
				s[i] = '0';
				break;
			case '1':
				s[i] = '8';
				break;
			case '2':
				s[i] = '4';
				break;
			case '3':
				s[i] = 'C';
				break;
			case '4':
				s[i] = '2';
				break;
			case '5':
				s[i] = 'A';
				break;
			case '6':
				s[i] = '6';
				break;
			case '7':
				s[i] = 'E';
				break;
			case '8':
				s[i] = '1';
				break;
			case '9':
				s[i] = '9';
				break;
			case 'A':
				s[i] = '5';
				break;
			case 'B':
				s[i] = 'D';
				break;
			case 'C':
				s[i] = '3';
				break;
			case 'D':
				s[i] = 'B';
				break;
			case 'E':
				s[i] = '7';
				break;
			case 'F':
				s[i] = 'F';
				break;
			default:
				break;
			}
		String s1 = null;
		try {
			s1 = new String(s, "GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(s1);
	}
}
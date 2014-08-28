package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class StringEncryption2 {

	public static void encrypt(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp >= 'a' && temp < 'z') {
				temp = (char) (temp + 1 - 32);
			} else if (temp == 'z') {
				temp = 'A';
			} else if (temp >= 'A' && temp < 'Z') {
				temp = (char) (temp + 1 + 32);
			} else if (temp == 'Z') {
				temp = 'a';
			} else if (temp >= '0' && temp < '9') {
				temp = (char) (temp + 1);
			} else if (temp == '9') {
				temp = '0';
			}
			result = result + temp;
		}
		System.out.println(result);

	}

	public static void unencrypt(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp > 'a' && temp <= 'z') {
				temp = (char) (temp - 1 - 32);
			} else if (temp == 'a') {
				temp = 'Z';
			} else if (temp > 'A' && temp <= 'Z') {
				temp = (char) (temp - 1 + 32);
			} else if (temp == 'A') {
				temp = 'z';
			} else if (temp > '0' && temp <= '9') {
				temp = (char) (temp - 1);
			} else if (temp == '0') {
				temp = '9';
			}
			result = result + temp;
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		encrypt(str1);
		unencrypt(str2);
	}

}
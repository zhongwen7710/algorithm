package algorithms.com.guan.mianshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "";
		System.out.print("���룺");
		BufferedReader str = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			s = str.readLine();
		} catch (IOException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		System.out.print("�����");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}

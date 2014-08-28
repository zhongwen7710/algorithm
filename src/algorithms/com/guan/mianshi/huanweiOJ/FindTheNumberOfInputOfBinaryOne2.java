package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class FindTheNumberOfInputOfBinaryOne2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int count = 0;
		boolean b = true;
		while (m != 0) {
			m = m & (m - 1);
			count++;
			// if((m & 1)==1)
			// count++;
			// m=m>>1;
		}
		System.out.print(count);
	}

}

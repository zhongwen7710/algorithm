package algorithms.com.guan.mianshi;

public class FirstOnlyOnceFromString {

	public static void main(String[] args) {

		// String s = "xabb";
		// String s = "abaccdeff";
		String s = "asdfasdfoo";

//		char c = firstOne(s);
//		System.out.println(c);
		char c = firstOnlyCharacter(s) ;
		System.out.println(c);
		
	}

	public static char firstOne(String s) {
		char result = '0';
		char temp;
		int[] num = new int[52];
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (temp >= 'a' && temp <= 'z') {
				num[temp - 'a']++;
			} else if (temp >= 'A' && temp <= 'Z') {
				num[temp - 'A' + 26]++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				if (i >= 0 && i <= 26) {
					result = (char) (i + 'a');
				} else
					result = (char) (i - 26 + 'A');
				break;
			}
		}
		return result;
	}

	// if there is no such character in A, return 0 (null)
	public static char firstOnlyCharacter(String A) {
		int[] array = new int[256];

		// store the characters in A to array
		for (int i = 0; i < A.length(); i++) {
			array[A.charAt(i)] += 1;
		}

		// get the first charater with only one appearance in A
		for (int i = 0; i < A.length(); i++) {
			if (array[A.charAt(i)] == 1)
				return A.charAt(i);
		}

		return '.';
	}
}

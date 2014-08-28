package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * ����: 	
	���밴���¹�����мƷ֣������ݲ�ͬ�ĵ÷�Ϊ������а�ȫ�ȼ����֡�
	       һ�����볤��:
	       5 ��: С�ڵ���4 ���ַ�
	       10 ��: 5 ��7 �ַ�
	       25 ��: ���ڵ���8 ���ַ�
	       ������ĸ:
	       0 ��: û����ĸ
	       10 ��: ȫ����С����д��ĸ
	       20 ��: ��Сд�����ĸ
	       ��������:
	       0 ��: û������
	       10 ��: 1 ������
	       20 ��: ����1 ������
	       �ġ�����:
	       0 ��: û�з���
	       10 ��: 1 ������
	       25 ��: ����1 ������
	       �塢����:
	       2 ��: ��ĸ������
	       3 ��: ��ĸ�����ֺͷ���
	       5 ��: ��Сд��ĸ�����ֺͷ���
	       �������ֱ�׼:
	       >= 90: �ǳ���ȫ
	       >= 80: ��ȫ��Secure��
	       >= 70: �ǳ�ǿ
	       >= 60: ǿ��Strong��
	       >= 50: һ�㣨Average��
	       >= 25: ����Weak��
	       >= 0:  �ǳ���
	 
	��Ӧ���Ϊ��
	  VERY_WEAK,
	   WEAK,    
	   AVERAGE,    
	   STRONG,     
	   VERY_STRONG,
	   SECURE,     
	   VERY_SECURE 
	
	
	       ���������������ַ��������а�ȫ������
	       ע��
	       ��ĸ��a-z, A-Z
	       ���֣�-9
	       ���Ű������£� (ASCII��������UltraEdit�Ĳ˵�view->ASCII Table�鿴)
	       !"#$%&'()*+,-./     (ASCII�룺x21~0x2F)
	       :;<=>?@             (ASCII<=><=><=><=><=>�룺x3A~0x40)
	       [\]^_`              (ASCII�룺x5B~0x60)
	  {|}~                (ASCII�룺x7B~0x7E)
	�ӿ�������
	 
	 Input Param 
	      String pPasswordStr:    ���룬���ַ�����ʽ��š�
	 Return Value
	   ���ݹ��������İ�ȫ�ȼ���
	 
	 
	 public static Safelevel GetPwdSecurityLevel(String pPasswordStr)
	 {
	     //������ʵ�ֹ���
	  return null;
	 }
 * @author guanxiangqing
 *
 */
public final class PasswordStrengthGrade {
	private PasswordStrengthGrade() {
	}

	//
	private enum SafeLevel {
		VERY_WEAK, WEAK, AVERAGE, STRONG, VERY_STRONG, SECURE, VERY_SECURE
	};

	//
	private static Set<Character> symbols = new HashSet<Character>();
	static {
		for (int i = 33; i <= 47; i++) {
			symbols.add((char) i);
		}
		for (int j = 58; j <= 64; j++) {
			symbols.add((char) j);
		}
		for (int m = 91; m <= 96; m++) {
			symbols.add((char) m);
		}
		for (int k = 123; k <= 126; k++) {
			symbols.add((char) k);
		}
	}

	private static boolean hasNums = false;
	private static boolean hasUpper = false;
	private static boolean hasLower = false;
	private static boolean hasSymbol = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String password = scanner.next();
		int score = 0;
		score += getLenthScore(password);
		score += getNumLengthScore(password);
		score += getCharacterSocre(password);
		score += getSymbolScore(password);
		score += getExtScore();

		if (score >= 90) {
			System.out.println(SafeLevel.VERY_SECURE);
		} else if (score >= 80) {
			System.out.println(SafeLevel.SECURE);
		} else if (score >= 70) {
			System.out.println(SafeLevel.VERY_STRONG);
		} else if (score >= 60) {
			System.out.println(SafeLevel.STRONG);
		} else if (score >= 50) {
			System.out.println(SafeLevel.AVERAGE);
		} else if (score >= 25) {
			System.out.println(SafeLevel.WEAK);
		} else {
			System.out.println(SafeLevel.VERY_WEAK);
		}
		//

		scanner.close();
	}

	private static int getLenthScore(String password) {
		int len = password.length();
		int score = 0;
		if (len <= 4) {
			score += 5;
		} else if (len >= 5 && len <= 7) {
			score += 10;
		} else {
			score += 25;
		}

		return score;
	}

	private static int getCharacterSocre(String password) {
		int score = 0;
		int len = password.length();
		char[] chars = password.toCharArray();
		for (int i = 0; i < len; i++) {
			char ch = chars[i];
			if (Character.isLowerCase(ch)) {
				hasLower = true;
			} else if (Character.isUpperCase(ch)) {
				hasUpper = true;
			}
		}

		if (hasLower && hasUpper) {
			score += 20;
		} else if (hasLower) {
			score += 10;
		} else if (hasUpper) {
			score += 10;
		} else {
			score = 0;
		}
		return score;
	}

	private static int getNumLengthScore(String password) {
		int score = 0;
		int len = password.length();
		int cnt = 0;
		char[] chars = password.toCharArray();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(chars[i])) {
				cnt++;
			}
		}
		if (0 == cnt) {
			score = 0;
		} else if (1 == cnt) {
			hasNums = true;
			score += 10;
		} else {
			hasNums = true;
			score += 20;
		}
		return score;
	}

	private static int getSymbolScore(String password) {
		int score = 0;
		int len = password.length();
		char[] chars = password.toCharArray();
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			if (symbols.contains(chars[i])) {
				cnt++;
			}
		}
		if (0 == cnt) {
			score = 0;
		} else if (1 == cnt) {
			hasSymbol = true;
			score += 10;
		} else {
			hasSymbol = true;
			score += 25;
		}
		return score;
	}

	private static int getExtScore() {
		int score = 0;
		if (hasLower && hasNums && hasSymbol && hasUpper) {
			score += 5;
		} else if (hasLower && hasNums && hasSymbol || hasUpper && hasNums
				&& hasSymbol) {
			score += 3;
		} else if (hasLower && hasNums || hasUpper && hasNums) {
			score += 2;
		}
		return score;
	}

}
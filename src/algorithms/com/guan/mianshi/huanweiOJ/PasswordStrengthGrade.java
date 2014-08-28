package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 描述: 	
	密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
	       一、密码长度:
	       5 分: 小于等于4 个字符
	       10 分: 5 到7 字符
	       25 分: 大于等于8 个字符
	       二、字母:
	       0 分: 没有字母
	       10 分: 全都是小（大）写字母
	       20 分: 大小写混合字母
	       三、数字:
	       0 分: 没有数字
	       10 分: 1 个数字
	       20 分: 大于1 个数字
	       四、符号:
	       0 分: 没有符号
	       10 分: 1 个符号
	       25 分: 大于1 个符号
	       五、奖励:
	       2 分: 字母和数字
	       3 分: 字母、数字和符号
	       5 分: 大小写字母、数字和符号
	       最后的评分标准:
	       >= 90: 非常安全
	       >= 80: 安全（Secure）
	       >= 70: 非常强
	       >= 60: 强（Strong）
	       >= 50: 一般（Average）
	       >= 25: 弱（Weak）
	       >= 0:  非常弱
	 
	对应输出为：
	  VERY_WEAK,
	   WEAK,    
	   AVERAGE,    
	   STRONG,     
	   VERY_STRONG,
	   SECURE,     
	   VERY_SECURE 
	
	
	       请根据输入的密码字符串，进行安全评定。
	       注：
	       字母：a-z, A-Z
	       数字：-9
	       符号包含如下： (ASCII码表可以在UltraEdit的菜单view->ASCII Table查看)
	       !"#$%&'()*+,-./     (ASCII码：x21~0x2F)
	       :;<=>?@             (ASCII<=><=><=><=><=>码：x3A~0x40)
	       [\]^_`              (ASCII码：x5B~0x60)
	  {|}~                (ASCII码：x7B~0x7E)
	接口描述：
	 
	 Input Param 
	      String pPasswordStr:    密码，以字符串方式存放。
	 Return Value
	   根据规则评定的安全等级。
	 
	 
	 public static Safelevel GetPwdSecurityLevel(String pPasswordStr)
	 {
	     //在这里实现功能
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
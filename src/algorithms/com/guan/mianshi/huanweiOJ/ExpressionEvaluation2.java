package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluation2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(calculate(str));

	}

	public static boolean calculate(String inputString) {
		List<String> list = change(inputString);
		System.out.println(getResult(list));
		return true;
	}

	public static List<String> change(String inputString) {
		List<String> list = new ArrayList<String>();
		char ch = ' ';
		StringBuffer strbf = new StringBuffer();
		for (int i = 0; i < inputString.length(); i++) {
			ch = inputString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				strbf.append(ch);
			} else {
				if (strbf.length() != 0) {
					list.add(strbf.toString());
					strbf.delete(0, strbf.length());
				}
				list.add(ch + "");
			}
		}
		if (strbf.length() != 0) {
			list.add(strbf.toString());
		}
		return list;

	}

	public static int getResult(List<String> list) {
		Stack<Integer> num = new Stack<Integer>();
		Stack<String> op = new Stack<String>();
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			if (str.charAt(0) >= '0' && str.charAt(0) <= '9')// 数字进数字栈
			{
				num.push(Integer.parseInt(str));
			} else if (str.equals("(")) {
				op.push(str);
			} else if (!str.equals(")"))// 操作符
			{
				if (op.isEmpty())// 第一个操作符，直接进操作符栈
				{
					op.push(str);
				} else// 非第一个操作符,当前操作符与栈顶操作符比较
				{
					if (compareOp(op.peek(), str))// 栈顶优先级高于当前操作符优先级
					{
						int result = calculateResult(num.pop(), op.pop(),
								num.pop());
						num.push(result);
						op.push(str);

					} else// 栈顶优先级低于当前操作符优先级
					{
						op.push(str);
					}
				}
			} else// 右括号
			{
				while (!op.peek().equals("(")) {
					int result = calculateResult(num.pop(), op.pop(), num.pop());
					num.push(result);
				}
				op.pop();
			}
		}
		while (!op.isEmpty()) {
			int result = calculateResult(num.pop(), op.pop(), num.pop());
			num.push(result);
		}
		return num.pop();
	}

	public static int calculateResult(int second, String op, int first) {
		if (op.equals("+")) {
			return first + second;
		} else if (op.equals("-")) {
			return first - second;
		} else if (op.equals("*")) {
			return first * second;
		} else {
			return first / second;
		}

	}

	public static boolean compareOp(String ch1, String ch2) // peek（可能有(） str(为+
															// - * /)
	{
		if (ch1.equals("*") || ch1.equals("/")) {
			return true;
		}
		if ((ch2.equals("+") || ch2.equals("-")) && !ch1.equals("(")) {
			return true;
		}
		return false;
	}

}
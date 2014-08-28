package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 描述: 	
	给定一个字符串描述的算术表达式，计算出结果值。
	
	输入字符串长度不超过100，合法的字符包括”+, -, *, /, (, )”，”0-9”，字符串内容的合法性及表达式语法的合法性由做题者检查。本题目只涉及整型计算。
	
	
	    功能: 对输入的字符串表达式进行求值计算，并输出结果。
	 
	    输入:String inputString：表达式字符串   
	         
	    返回: int ：正常返回true，失败返回false
	 
	    public static boolean calculate(String inputString)
	    {
	        //在这里实现功能
	       return true;
	    }
	 
	获取计算结果（int型）
	    public static int getResult()
	    {
	        //在这里实现功能
	       return 0;
	    }
 * @author guanxiangqing
 *
 */
public class ExpressionEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		System.out.println(calculate(exp));
	}

	// 表达式求值
	public static boolean calculate(String exp) {
		Stack<Double> opN = new Stack<>();
		Stack<String> opC = new Stack<>();
		Matcher m = Pattern.compile("\\d+|\\D").matcher(exp);
		String tmp;
		while (m.find()) {
			tmp = m.group();
			if (tmp.equals("+") || tmp.equals("-") || tmp.equals("*")
					|| tmp.equals("/") || tmp.equals("(")) {
				while (!opC.isEmpty() && !greaterPriority(tmp, opC.peek())) {
					try {
						double op2 = opN.pop();
						double op1 = opN.pop();
						opN.push(calc(op1, op2, opC.pop()));
					} catch (EmptyStackException e) {
						// 表达式不合法
						return false;
					}
				}
				opC.push(tmp);
			} else if (tmp.equals(")")) {
				while (!opC.empty() && !opC.peek().equals("(")) {
					try {
						double op2 = opN.pop();
						double op1 = opN.pop();
						opN.push(calc(op1, op2, opC.pop()));
					} catch (EmptyStackException e) {
						// 表达式不合法
						return false;
					}
				}
				if (opC.empty()) {
					// 表达式不合法
					return false;
				} else {
					opC.pop();
				}
			} else {
				opN.push(Double.parseDouble(tmp));
			}
		}
		while (!opC.empty()) {
			if (opC.peek().equals("(")) {
				// 表达式不合法
				return false;
			}
			try {
				double op2 = opN.pop();
				double op1 = opN.pop();
				opN.push(calc(op1, op2, opC.pop()));
			} catch (EmptyStackException e) {
				// 表达式不合法
				return false;
			}
		}
		System.out.println(opN.pop().intValue());
		return true;
	}

	// op1为当前操作符，op2为栈顶操作符
	static boolean greaterPriority(String op1, String op2) {
		if (op1.equals("("))
			return true;
		if (op2.equals("("))
			return true;
		if (op1.equals("+") || op1.equals("-"))
			return false;
		if (op2.equals("*") || op2.equals("/"))
			return false;
		return true;
	}

	static double calc(double op1, double op2, String op) {
		if (op.equals("+"))
			return op1 + op2;
		if (op.equals("-"))
			return op1 - op2;
		if (op.equals("*"))
			return op1 * op2;
		if (op.equals("/"))
			return op1 / op2;
		return 0;
	}
}
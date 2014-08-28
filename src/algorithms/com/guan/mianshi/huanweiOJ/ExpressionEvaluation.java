package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����: 	
	����һ���ַ����������������ʽ����������ֵ��
	
	�����ַ������Ȳ�����100���Ϸ����ַ�������+, -, *, /, (, )������0-9�����ַ������ݵĺϷ��Լ����ʽ�﷨�ĺϷ����������߼�顣����Ŀֻ�漰���ͼ��㡣
	
	
	    ����: ��������ַ������ʽ������ֵ���㣬����������
	 
	    ����:String inputString�����ʽ�ַ���   
	         
	    ����: int ����������true��ʧ�ܷ���false
	 
	    public static boolean calculate(String inputString)
	    {
	        //������ʵ�ֹ���
	       return true;
	    }
	 
	��ȡ��������int�ͣ�
	    public static int getResult()
	    {
	        //������ʵ�ֹ���
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

	// ���ʽ��ֵ
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
						// ���ʽ���Ϸ�
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
						// ���ʽ���Ϸ�
						return false;
					}
				}
				if (opC.empty()) {
					// ���ʽ���Ϸ�
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
				// ���ʽ���Ϸ�
				return false;
			}
			try {
				double op2 = opN.pop();
				double op1 = opN.pop();
				opN.push(calc(op1, op2, opC.pop()));
			} catch (EmptyStackException e) {
				// ���ʽ���Ϸ�
				return false;
			}
		}
		System.out.println(opN.pop().intValue());
		return true;
	}

	// op1Ϊ��ǰ��������op2Ϊջ��������
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
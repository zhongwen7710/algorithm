package algorithms.com.guan.zoo.stackTest;

import algorithms.com.guan.algs4.LinkedStack;

public class Postfix {
	/**
	 * Task:创建一个后缀 表达式表示给定的中缀表达式
	 * @param infix 作为合法的中缀表达式的字符串
	 * @return	作为与infix等价的后缀表达式的字符串
	 */
	public static String convertToPostfix(String infix){
		StringBuffer postfix = new StringBuffer();
		LinkedStack<Character> operatorStack = new LinkedStack<Character>();
		int characterCount = infix.length();
		Character top;
		char topOperator;
		
		for(int index = 0; index < characterCount; index++){
			boolean done = false;
			char nextCharacter = infix.charAt(index);
			
			if(isVariable(nextCharacter)){
				postfix = postfix.append(nextCharacter);
			}else{
				switch(nextCharacter){
				case '^':
					operatorStack.push(new Character(nextCharacter));
					break;
				
				case '+': case '-': case '*': case '/':
					while(!done && !operatorStack.isEmpty()){
						top = operatorStack.peek();
						topOperator = top.charValue();
						
						if(getPrecedence(nextCharacter) <= getPrecedence(topOperator)){
							postfix = postfix.append(topOperator);
							operatorStack.pop();
						}else{
							done = true;
						}
						
						operatorStack.push(new Character(nextCharacter));
						break;
					}
				
				case '(':
					operatorStack.push(new Character(nextCharacter));
					break;
				
				case ')':
					top = operatorStack.pop();
					topOperator = top.charValue();
					while(topOperator != '('){
						postfix = postfix.append(topOperator);
						top = operatorStack.pop();
						topOperator = top.charValue();
					}
				break;
				
				default:
					break;
				}//end switch
			}//end if
		}//end for
		
		while(!operatorStack.isEmpty()){
			top = operatorStack.pop();
			postfix = postfix.append(top.charValue());
		}
		
		
		return postfix.toString();
	}

	private static int getPrecedence(char operator) {
		switch(operator){
		case '(': case ')':
			return 0;
		case '+': case '-':
			return 1;
		case '*': case '/':
			return 2;
		case '^':
			return 3;
			
		}//switch
		
		return -1;
	}//end getPrecedence

	private static boolean isVariable(char character) {
		return Character.isLetter(character);
	}//end isVariable

}//end Postfix

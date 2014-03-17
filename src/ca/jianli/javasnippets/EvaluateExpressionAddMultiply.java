package ca.jianli.javasnippets;

import java.util.Stack;

/**
 * Evaluate an arithmetic expression involving adding and multiplying. e.g. 3 +
 * 5 + 4 * 5 = 28
 * 
 * @author Jian Li
 * 
 */
public class EvaluateExpressionAddMultiply {
	public static int solution1(String expression) {

		// maintain a stack of numbers to be added

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c >= '0' && c <= '9')
				stack.push(c - '0');
			else {
				if (c == '*') {
					int product = stack.pop() * (expression.charAt(++i) - '0');
					stack.push(product);
				}
			}
		}
		int res = 0;
		for (int i : stack)
			res += i;
		return res;
	}
}

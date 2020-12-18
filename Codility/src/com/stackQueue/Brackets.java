package com.stackQueue;

import java.util.Stack;

public class Brackets {

	
	public static int solution(String S) {
		
		Stack<Character> s = new Stack<Character>();
		
		char[] Ch = S.toCharArray();
		for(char c : Ch) {
			if(s.isEmpty()) s.push(c);
			else {
				if((s.peek() == '(' && c == ')')||(s.peek() == '{' && c == '}')||s.peek() == '[' && c == ']')  s.pop();
				else s.push(c);
			}
			
		}
		if(s.isEmpty()) return 1;
		return 0;
		
	}
	public static void main(String[] args) {
		String S = "([)()]";
		System.out.println(solution(S));
	}
}

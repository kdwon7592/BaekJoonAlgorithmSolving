package com.problem2504;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		valueOfBracket(str);
	}

	public static void valueOfBracket(String str) {
		Stack<Character> stack = new Stack<Character>();//char형은 특정 범위를 초과시 오류발생
		Stack<Integer> num = new Stack<Integer>();//따라서 int형 스택 필요할듯.
		try {
			for (int n = 0; n < str.length(); n++) {
				char tmp = str.charAt(n);
				if (tmp == '(' || tmp == '[') {
					stack.push(tmp);
				} else if (tmp == ')') {
					int sum = 0;
					char v = stack.pop();
					while (v != '(') {
						if(v == '[') {
							System.out.println(0);
							return;
						}
						sum = sum + (v - '0');
						v = stack.pop();
					}if(sum == 0) {
						stack.push('2');
					}else {
						stack.push((char) (sum*2 + '0'));
					}
				}else if(tmp == ']') {
					int sum = 0;
					char v = stack.pop();
					while (v != '[') {
						if(v == '(') {
							System.out.println(0);
							return;
						}
						sum = sum + (v -'0');
						v = stack.pop();
				}if(sum == 0) {
						stack.push('3');
					}else {
						stack.push((char) (sum*3 + '0'));
					}
				}	
			}
			int sum = 0;
			int length = stack.size();
			for(int i =0; i<length; i++) {
				char tmp = stack.pop();
				if(tmp == '(' || tmp == ')' || tmp == '[' || tmp == ']') {
					System.out.println(0);
					return;
				}
				sum = sum + (tmp - '0');
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(0);
			return;
		}
	}
}

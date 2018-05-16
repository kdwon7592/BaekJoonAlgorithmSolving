package com.problem9012;

import java.util.Scanner;
import java.util.Stack;

/*public class Main {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			str = sc.next();
			System.out.println(checkVps(str));
		}
	}
	public static String checkVps(String str) {
		int cnt = 0;
		if(str.charAt(0)==')')
			return "NO";
		if(str.charAt(str.length()-1) == '(')
			return "NO";
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) == '(') {
				cnt++;
			}else {
				cnt--;
			}
			if(cnt < 0) {
				return "NO";
			}
		}
		if(cnt == 0)
			return "YES";
		else
			return "NO";
	}
}*/

/*
 * ±¦ÂúÀº ÄÚµå¶ó °¡Á®¿Íº½.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		scanner.nextLine();
		
		for(int a=0;a<num;a++) {
			String input = scanner.nextLine();
			if(isRight(input)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}
	public static boolean isRight(String input) {
		boolean isSuccess = true;
		Stack<Character> stack = new Stack<Character>();
		try {
			for(int a=0;a<input.length();a++) {
				char tmp = input.charAt(a);
				if(tmp == '(') {
					stack.push(tmp);
				}else {
					stack.pop();
				}
			}
		} catch(Exception e) {
			isSuccess = false;
		}
		
		return isSuccess && stack.empty();
	}

}

package com.problem9012;

import java.util.Scanner;

public class Main {
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
}

package com.problem1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int res = sc.nextInt();
		int cnt = 1;
		int idx = res;

		while (true) {
			int i = res / 10;
			int j = res % 10;
			int k = i + j;
			res = j * 10 + k % 10;
			if (res == idx)
				break;
			else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

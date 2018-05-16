package com.problem1874;

import java.util.Scanner;
/*
 * 생각보다 복잡한 문제 나중에 풀겠음 - 0516
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int std = 0;
		int top = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp > std) {
				for (int j = top; j < tmp; j++) {
					System.out.println("+");
					top++;
				}
				System.out.println("-");
			} else {
				for (int j = std; j > tmp; j--) {
					System.out.println("-");
				}
			}
			std = tmp;
		}

	}
}

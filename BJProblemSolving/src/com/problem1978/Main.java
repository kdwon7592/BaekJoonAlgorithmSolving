package com.problem1978;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int pivot = -1;
			int tmp = sc.nextInt();
			if(tmp ==3 || tmp == 2) {
				cnt++;
				continue;
			}
			if (tmp % 2 == 0 || tmp == 1) {
				continue;
			} else {
				for (int j = 3; j <= Math.round(Math.sqrt((double) tmp)); j += 2) {
					if (tmp % j == 0) {
						pivot = 1;
						break;
					}
				}
				if (pivot != 1) {
					cnt++;
			}
		}
		}
		System.out.println(cnt);
	}
}

package com.problem2581;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = -1;
		for (int i = m; i <= n; i++) {
			int pivot = 1;
			if (i == 1) {
				continue;
			} else if (i == 2) {
				min = i;
				sum = sum + i;
			} else if (i == 3) {
				if (min == -1) {
					min = i;
				}
				sum = sum + i;
			} else {
				if (i % 2 == 0) {
					continue;
				} else {
					for (int j = 3; j <= Math.sqrt((double) i); j += 2) {
						if (i % j == 0) {
							pivot = -1;
							break;
						}
					}
					if (pivot == 1) {
						sum = sum + i;
						if (min == -1) {
							min = i;
						}
					}
				}
			}
		}
		if (min == -1) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

package com.problem1929;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		while(true){
			m = sc.nextInt();
 			if(m == 0) {
				break;
			}
			int cnt = 0;
			for (int i = m+1; i <= 2 * m; i++) {
				int pivot = 1;
				if (i == 1) {
					continue;
				} else if (i == 2) {
					cnt++;
					continue;
				} else if (i == 3) {
					cnt++;
					continue;
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
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
 	}
}

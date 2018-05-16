package com.problem9020;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int T;
		int[] arr = new int[10001];

		arr = getPrime(arr);
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int tmp = sc.nextInt();
			int j = tmp / 2;
			int k = j;

			for (;j >= 0 && k <= tmp; j--, k++) {
				if(arr[j] ==1 && arr[k] ==1) {
					System.out.print(j + " " + k + "\n");
					break;
				}
			}

		}

	}

	public static int[] getPrime(int[] arr) {
		arr[2] = 1;
		arr[3] = 1;
		for (int i = 0; i < 10000; i++) {
			int pivot = -1;
			if (i % 2 == 0) {
				continue;
			} else {
				for (int j = 3; j <= Math.round(Math.sqrt((double) i)); j += 2) {
					if (i % j == 0) {
						pivot = 1;
						break;
					}
				}
				if (pivot != 1) {
					arr[i] = 1;
				}
			}
		}
		return arr;
	}
}

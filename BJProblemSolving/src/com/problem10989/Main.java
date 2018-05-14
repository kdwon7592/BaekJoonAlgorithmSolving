package com.problem10989;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		int n;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
//			int tmp = sc.nextInt();
			arr[tmp]++;
		}
		countingSort(arr);
	}

	public static void countingSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int tmp_sum = sum;
			while (arr[i] != 0) {
				arr[i] = arr[i] - tmp_sum;
				System.out.println(i);
				arr[i]--;
				sum++;
			}
		}
	}
}

package com.problem2108;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] number = new int[8001];
		int max, min, sum = 0;
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
			int tmp = input[i];
			if (tmp < 0) {
				number[tmp + 4000]++;
			} else {
				number[tmp + 4000]++;
			}
			sum = sum + tmp;
		}
		int s_max = 0;
		int s_max_idx = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > s_max) {
				s_max = number[i];
				s_max_idx = i;
			}
		}
		int cnt = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == s_max)
				cnt++;
			if (cnt == 2) {
				s_max_idx = i;
				break;
			}
		}
		Arrays.sort(input);
		System.out.println((int) Math.round((double) sum / (double) n));
		System.out.println(input[n / 2]);
		System.out.println(s_max_idx - 4000);
		System.out.println(input[input.length - 1] - input[0]);
	}
}

package com.problem2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int q;
		
		Scanner sc = new Scanner(System.in);
		
		q = sc.nextInt();
		
		func(q);
	}

	public static void func(int num) {
		int sum = 1;
		int index = 1;
		while (sum < num) {
			sum = sum + 6 * index++;
		}
		System.out.println(index);
	}
}
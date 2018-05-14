package com.problem1427;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();

		mySort(str);
	}

	public static void mySort(String str) {
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for (int i = 9; i >= 0; i--) {
			if(arr[i] != 0) {
				for(int j =0; j<arr[i];j++) {
					System.out.print(i);
				}
			}
		}
	}
}

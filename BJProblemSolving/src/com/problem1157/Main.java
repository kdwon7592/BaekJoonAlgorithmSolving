package com.problem1157;

import java.util.Arrays;
import java.util.Scanner;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

public class Main {
	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine().toUpperCase();

				
		most(input);

	}

	public static void most(String input) {
		char[] str = input.toCharArray();
		int[] array = new int[26];
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (Integer.valueOf(str[i]) == j + 65) {
					array[j]++;
				}
			}
		}
		int[] array1 = Arrays.copyOf(array, array.length);
		Arrays.sort(array1);
		if (array1[25] == array1[24]) {
			System.out.println("?");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array1[25] == array[i])
					System.out.printf("%c", i + 65);
			}
		}
	}
}

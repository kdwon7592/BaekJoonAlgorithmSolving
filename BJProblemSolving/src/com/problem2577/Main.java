package com.problem2577;

import java.util.Scanner;

/*세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 

A × B × C = 150 × 266 × 427 = 17037300 이 되고, 

계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.*/

public class Main {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int res = a * b * c;
		try {
			program(res);
			System.out.println(res);
			easy(res);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void program(int num) {
		String str = String.valueOf(num);
		String[] array = str.split("");
		int[] ans = new int[10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (Integer.valueOf(array[i]).equals(j)) {
					ans[j]++;
				}
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static void easy(int num) {
		int ans[] = new int[10];
		while(num != 0) {
			ans[num%10]++;
			num /= 10;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}

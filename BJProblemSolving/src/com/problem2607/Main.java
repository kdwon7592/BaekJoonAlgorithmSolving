package com.problem2607;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/*
 * 츌처 : https://m.blog.naver.com/occidere/221095055060
 * */

public class Main {
	public static HashMap<Character, Integer> origin, other;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		char ch;
		int i, j, len, cnt = 0, n = Integer.parseInt(in.readLine()) - 1;
		String word = in.readLine();
		len = word.length();

		origin = new HashMap<>(); // 기준 문자열 알파벳 기록
		other = new HashMap<>(); // 비교 문자열 알파벳 기록

		init(origin); // A ~ Z의 갯수를 0으로 초기화
		for (i = 0; i < len; i++) {
			ch = word.charAt(i);
			origin.replace(ch, origin.get(ch) + 1);
		}

		for (i = 0; i < n; i++) {
			init(other); // A ~ Z의 갯수를 0으로 초기화
			len = (word = in.readLine()).length();
			for (j = 0; j < len; j++) {
				ch = word.charAt(j);
				other.replace(ch, other.get(ch) + 1);
			}
			if (isSimilarTo(other))
				cnt++; // 유사하면 cnt++
		}

		out.write(cnt + "");
		out.close();
		in.close();
	}

	/* HashMap을 {대문자 알파벳, 0} 으로 채움 */
	private static void init(HashMap<Character, Integer> hm) {
		for (char ch = 'A'; ch <= 'Z'; ch++)
			hm.put(ch, 0);
	}

	/* 두 문자열의 알파벳 차이가 2 이하 && 길이 차이가 1 이하이면 유사하다 */
	private static boolean isSimilarTo(HashMap<Character, Integer> other) {
		int a, b, diff = 0, originLen = 0, otherLen = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			originLen += (a = origin.get(ch));
			otherLen += (b = other.get(ch));
			diff += Math.abs(a - b);
		}
		return diff <= 2 && Math.abs(originLen - otherLen) <= 1;
	}
}

/*
 * 
 * public class Main { public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int num;
 * 
 * num = sc.nextInt();
 * 
 * String[] input = new String[num];
 * 
 * for (int i = 0; i < num; i++) { input[i] = sc.next().toUpperCase(); }
 * 
 * solve(input, num); }
 * 
 * public static void solve(String[] input, int num) { int result = num -1;
 * int[] alpha1 = new int[26];
 * 
 * char[] first = input[0].toCharArray(); for (int s = 0; s < first.length; s++)
 * { alpha1[Integer.valueOf(first[s]) - 65]++; } System.out.print("기준  :"); for
 * (int i = 0; i < alpha1.length; i++) { System.out.print(alpha1[i] + " "); }
 * 
 * for (int i = 1; i < num; i++) { System.out.println(); char[] target =
 * input[i].toCharArray(); if(Math.abs(first.length - target.length) > 1) { //
 * 차이가 2이상인 것은 거름 break; } int[] alpha2 = new int[26];
 * 
 * for (int s = 0; s < target.length; s++) { alpha2[Integer.valueOf(target[s]) -
 * 65]++; } System.out.print((i) + "번째 :"); for (int k = 0; k < alpha2.length;
 * k++) { System.out.print(alpha2[k] + " "); } int cnt = 0; for(int j = 0; j
 * <26; j++) { if(Math.abs(alpha1[j]-alpha2[j])>=2) { result--; break; } else
 * if(alpha1[j] == alpha2[j]){ continue; } else { cnt++; } } if(cnt > 2)
 * result--; } System.out.println("\n" + result); } }
 */
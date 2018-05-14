package com.problem1181;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		HashSet<String> hs = new HashSet<String>();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}

		String[] str = new String[hs.size()];
				
		hs.toArray(str);
		Arrays.sort(str);
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for (String string : str) {
			System.out.println(string);
		}
	}
}

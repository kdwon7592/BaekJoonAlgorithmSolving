package com.problem4673;

public class Main2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String[] list = new String[10009];

		for (int i = 1; i <= 10000; i++) {
			list[i] = String.valueOf(i);
		}

		for (int i = 1; i <= 10000; i++) {
			int nonSelf = i;
			for (int j = 0; j < list[i].length(); j++) {
				nonSelf = nonSelf + (int) list[i].charAt(j);
			}
			if (nonSelf > 10000) {
				continue;
			} else {
				list[nonSelf] = "Non_Self_Num";

			}
		}
		for (int i = 1; i <= 10000; i++) {
			if (!"Non_Self_Num".equals(list[i])) {
				System.out.println(i);
			}
		}
	}
}

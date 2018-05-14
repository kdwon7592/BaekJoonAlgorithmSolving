package com.problem10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		countingSort(arr);
		br.close();
	}

	public static void countingSort(int[] arr) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		bw.close();

	}

}

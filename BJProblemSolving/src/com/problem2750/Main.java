package com.problem2750;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int[] arr = new int[2000];
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// arr = bubbleSort(arr, n);
		// arr = selectionSort(arr, n);
		// arr = insertionSort(arr, n);
		arr = mergeSort(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int index = i;
			for (int j = i; j < n; j++) {
				if (key > arr[j]) {
					key = arr[j];
					index = j;
				}
			}
			int tmp;
			tmp = arr[i];
			arr[i] = key;
			arr[index] = tmp;
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int index = i;
			while (index > 0 && arr[index - 1] > key) {
				arr[index] = arr[index - 1];
				index = index - 1;
			}
			arr[index] = key;
		}
		return arr;
	}

	public static int[] mergeSort(int[] arr, int n) {
		int length = n;

		if (length == 1)
			return arr;

		int[] arr_left = new int[length / 2];
		System.out.print("arr_left: ");
		for (int i = 0; i < arr_left.length; i++) {
			arr_left[i] = arr[i];
			System.out.print(arr_left[i] + " ");
		}
		System.out.println();
		int[] arr_right = new int[length - length / 2];
		System.out.print("arr_right: ");
		for (int i = 0; i < arr_right.length; i++) {
			arr_right[i] = arr[i + length / 2];
			System.out.print(arr_right[i] + " ");

		}
		System.out.println();

		int[] left = mergeSort(arr_left, length / 2);
		int[] right = mergeSort(arr_right, length - length / 2);

		int i = 0, j = 0, k = 0;
		int[] result = new int[n];

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}
		if (i != left.length) {
			for (;i < left.length; i++) {
				result[k++] = left[i];
			}
		}
		if (j != right.length) {
			for (; j < right.length; j++) {
				result[k++] = right[j];
			}
		}
		return result;
	}
}

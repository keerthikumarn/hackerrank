package com.hackerrank.samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftArrayRotation {

	// Complete the rotLeft function below.
	public static int[] rotLeft(int[] arr, int d) {
		int arrSize = arr.length;
		for (int i = 0; i < d; i++) {
			leftRotateByOneElement(arr, arrSize);
		}
		return arr;
	}

	private static void leftRotateByOneElement(int[] arr, int length) {
		int i;
		int n = arr.length - 1;
		int temp = arr[0];
		for (i = 0; i < n; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	private static void printLeftRotatedArray(int[] result, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] result = rotLeft(a, d);
		scanner.close();
		printLeftRotatedArray(result, result.length);
	}

}

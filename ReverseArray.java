package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (int a = arr.length - 1; a >= 0; a--) {
      System.out.print(arr[a] + " ");
    }
    in.close();

  }

}

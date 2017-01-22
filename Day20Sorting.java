package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Day20Sorting {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int a[] = new int[num];
    int swaps = 0;
    for (int a_i = 0; a_i < num; a_i++) {
      a[a_i] = in.nextInt();
    }
    for (int i = 0; i < num; i++) {

      for (int j = 0; j < num - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          swaps++;
        }

      }
    }
    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[num - 1]);

  }
}
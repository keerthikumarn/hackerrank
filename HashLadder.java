package com.keerthi.hackerrank.problems;

import java.util.Arrays;
import java.util.Scanner;

public class HashLadder {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    if (n > 0) {
      for (int i = 0; i <= n; i++) {
        for (int j = n - i; j >= 1; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
          System.out.print("#");
        }
        System.out.println(" ");
      }
    }

   /* char[] charArr = new char[n];
    Arrays.fill(charArr, ' ');
    int i = 0;
    for (i = 1; i <= n; i++) {
      charArr[n - i] = '#';
      System.out.println(charArr);
    }*/

  }
}

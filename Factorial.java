package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = factorial(n);
    System.out.println(result);
  }

  private static int factorial(final int num) {
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
  }

}

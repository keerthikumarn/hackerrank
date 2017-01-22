package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class SherlockSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfTests = sc.nextInt();
    for (int i = 0; i < noOfTests; i++) {
      long num1 = sc.nextLong();
      long num2 = sc.nextLong();
      getSquareCount(num1, num2);
    }

  }

  private static void getSquareCount(long num1, long num2) {
    if (num1 == 0) {
      num1++;
    }
    Double d1 = Math.sqrt(num1);
    Double d2 = Math.sqrt(num2);
    int count = 0;
    long numLong1 = d1.longValue();
    long numLong2 = d2.longValue();
    for (long i = numLong1; i <= numLong2; i++) {
      if ((i * i) <= num2 && (i * i) >= num1) {
        count++;
      }
    }
    System.out.println(count);
  }

}

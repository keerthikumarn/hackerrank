package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Binary {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int rem = 0;
    int sum = 0;
    int t = 0;

    while (num > 0) {
      rem = num % 2;
      num = num / 2;
      if (rem == 1) {
        sum++;
        if (sum >= t) {
          t = sum;
        }

      }
      else {
        sum = 0;
      }
    }

    System.out.println(t);
  }
}

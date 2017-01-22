package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Day25Prime {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int count = 0;
    int i = 2;
    while (num > 0) {
      int n = in.nextInt();
      while (i < Math.sqrt(n)) {
        if (n % i == 0) {
          count++;
        }
        i++;

      }
      if (count > 0) {
        System.out.println("Not prime");
      }
      else {
        System.out.println("Prime");
      }
      num--;
      count = 0;
      i = 2;
    }
  }

}

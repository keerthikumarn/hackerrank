package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class SherlockBeast {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      printResult(in);
    }
  }

  private static void printResult(Scanner in) {
    int num = in.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = num; i >= 0; i--)

    {
      if (i % 3 == 0 && (num - i) % 5 == 0) {
        int tmp = 0;
        for (tmp = 0; tmp < i; tmp++) {
          sb.append("5");
        }
        for (int k = tmp; k < num; k++) {
          sb.append("3");
        }
        break;

      }
    }
    if (sb.length() == 0) {
      System.out.println("-1");
    }
    else {
      System.out.println(sb);
    }
  }
}

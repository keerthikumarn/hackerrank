package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class UtopianTree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int c = sc.nextInt();
      System.out.println(CalcHeightOfUtopainTree(c));
    }
    sc.close();
  }

  private static int CalcHeightOfUtopainTree(int t) {
    int height = 1;
    if (t <= 0) {
      return 1; // no change in height
    }
    for (int i = 1; i <= t; i++) {
      if (i % 2 != 0) {
        height = 2 * height; // height doubles
      }
      else {
        height += 1; // increases by 1
      }
    }
    return height;
  }

}

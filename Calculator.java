package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    while (T-- > 0) {
      int n = in.nextInt();
      int p = in.nextInt();
      Calculator myCalculator = new Calculator();
      try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);

      }
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

  }

  public int power(int x, int y) throws Exception {
    if (x < 0 || y < 0) {
      throw new Exception("n and p should be non-negative");
    }
    return (int)Math.pow(x, y);
  }

}

package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class ScopeDay14 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    Difference D = new Difference(a);

    D.computeDifference();

    System.out.print(D.maximumDifference);
  }

}

package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class AngryProfessor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int count = 0;
      for (int j = 0; j < n; j++) {
        int temp = sc.nextInt();
        if (temp <= 0) {
          count++;
        }
      }
      if (count >= k) {
        System.out.println("NO");
      }
      else {
        System.out.println("YES");
      }
    }
  }
}

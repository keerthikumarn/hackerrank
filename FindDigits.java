package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class FindDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfTests = sc.nextInt();

    for (int i = 0; i < noOfTests; i++) {
      int n = sc.nextInt();
      String str = Integer.toString(n);
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        int temp = Character.getNumericValue(str.charAt(j));
        if (temp != 0 && n % temp == 0) {
          count++;
        }
      }
      System.out.println(count);
    }
    sc.close();
  }

}

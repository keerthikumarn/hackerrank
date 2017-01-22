package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class EvenNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
    String ans = "";
    try {
      int n = scan.nextInt();
      scan.close();

      if (n <= 0 && n >= 100) {
        ans = "Weird";
      }

      if (n % 2 == 1) {
        ans = "Weird";
      }
      else {
        if (n % 2 == 0) {
          if (n >= 2 && n <= 5) {
            ans = "Not Weird";
          }
        }
        if (n % 2 == 0) {
          if (n >= 6 && n <= 20) {
            ans = "Weird";
          }
        }
        if (n % 2 == 0) {
          if (n > 20) {
            ans = "Not Weird";
          }
        }
      }

    }
    catch (Exception e) {
      ans = "Weird";
    }
    System.out.println(ans);
  }
}

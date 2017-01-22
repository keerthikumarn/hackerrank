package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class ExceptionTest {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    try {
      int num = Integer.parseInt(S);
      System.out.println(num);

    }
    catch (Exception e) {
      System.out.println("Bad String");
    }
  }

}

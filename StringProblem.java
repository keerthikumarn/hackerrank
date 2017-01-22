package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class StringProblem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lines = sc.nextInt();
    sc.nextLine();
    String evenStr = "";
    String oddStr = "";
    for (int i = 0; i < lines; i++) {
      String str = sc.nextLine();
      for (int j = 0; j < str.length(); j++) {
        if (j % 2 == 0) {
          evenStr = evenStr + str.charAt(j);
        }
        else {
          oddStr = oddStr + str.charAt(j);
        }

    }
      System.out.println(evenStr + "  " + oddStr);
      evenStr = "";
      oddStr = "";
    }
  }

}

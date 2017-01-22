package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Multiply {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    printMutliples(num);
  }

  private static void printMutliples(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
  }

}

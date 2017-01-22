package com.keerthi.hackerrank.problems;

import java.util.Scanner;

class Day19 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();

    AdvancedArithmetic myCalculator = new Calculator1();
    int sum = myCalculator.divisorSum(n);
    System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
    System.out.println(sum);
  }
}

package com.keerthi.hackerrank.problems;

public class Calculator1 implements AdvancedArithmetic {

  @Override
  public int divisorSum(int num) {
    int sum = 0;
    if (num == 1) {
      return num;
    }
    for (int i = 1; i < num + 1; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

}

package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class SumOfIntegers {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    int n = Integer.parseInt(userInput.nextLine());
    long sum = 0;
    String[] array;
    String tempData = userInput.nextLine();
    array = tempData.split(" ");
    for (int i = 0; i < n; i++) {
      sum += Long.parseLong(array[i]);
    }
    System.out.println(sum);
  }

}

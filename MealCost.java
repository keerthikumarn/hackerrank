package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class MealCost {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mealCost = scan.nextDouble(); // original meal price
    int tipPercent = scan.nextInt(); // tip percentage
    int taxPercent = scan.nextInt(); // tax percentage
    scan.close();

    // Write your calculation code here.
    double tipPercentAmt = (mealCost * tipPercent / 100);
    double taxPercentAmt = (mealCost * taxPercent / 100);
    double totalPrice = mealCost + tipPercentAmt + taxPercentAmt;

    // cast the result of the rounding operation to an int and save it as totalCost
    int totalCost = (int)Math.round(totalPrice);

    // Print your result
    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }
}

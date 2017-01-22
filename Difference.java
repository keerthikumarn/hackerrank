package com.keerthi.hackerrank.problems;

public class Difference {
  private int[] elements;

  public int maximumDifference;

  public Difference(int[] arr) {
    this.elements = arr;
  }

  public void computeDifference() {
    int maxNum = 0;
    for (int i = 0; i < elements.length - 1; i++) {
      for (int j = i + 1; j < elements.length; j++) {
        int diff = Math.abs(elements[i] - elements[j]);
        if (diff > maxNum) {
          maxNum = diff;
        }
      }
    }
    maximumDifference = maxNum;
  }
}

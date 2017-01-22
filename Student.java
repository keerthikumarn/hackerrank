package com.keerthi.hackerrank.problems;

public class Student extends Person1 {

  private int[] scores;

  Student(String firstName, String lastName, int identification) {
    super(firstName, lastName, identification);
    scores = scores.clone();
  }

  public char calculate() {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum = sum + scores[i];
    }

    int avg = sum / scores.length;

    if (avg >= 90 && avg <= 100) {
      return 'O';
    }
    else if (avg >= 80 && avg < 90) {
      return 'E';
    }
    else if (avg >= 70 && avg < 80) {
      return 'A';
    }
    else if (avg >= 55 && avg < 70) {
      return 'P';
    }
    else if (avg >= 40 && avg < 55) {
      return 'D';
    }
    else {
      return 'T';
    }

  }

}

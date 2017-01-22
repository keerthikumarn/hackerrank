package com.keerthi.hackerrank.problems;

public class Person {

  private int age;

  public Person(int initialAge) {
    this.age = initialAge;
    if (age < 0) {
      age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    }
  }

  public void areYouOld() {
    String result = null;
    if (this.age < 13) {
      result = "You are young.";
    }
    else if (this.age < 18 && this.age >= 13) {
      result = "You are a teenager.";
    }
    else if (this.age >= 18) {
      result = "You are old.";
    }
    System.out.println(result);
  }

  public void yearPasses() {
    age++;
  }
}

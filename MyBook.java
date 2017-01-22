package com.keerthi.hackerrank.problems;

public class MyBook extends Book {

  private int price;

  MyBook(String t, String a, int price) {
    super(t, a);
    this.price = price;
  }

  @Override
  void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
  }

}

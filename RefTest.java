package com.keerthi.hackerrank.problems;

public class RefTest {

  protected void testPrimitive(int x) {
    x = 128;
    System.out.println("x(1) = " + x);
  }

  protected void testString(String s) {
    s += " The Great";
    System.out.println("s(1) = " + s);
  }

  protected void testObject1(Double e) {
    Double pi = new Double(3.14159265);
    e = pi;
    System.out.println("e(1) = " + pi);
  }

  protected void testObject2(StringBuilder sb) {
    sb.append(".net");
    System.out.println("sb(1) = " + sb);
  }

  public void testAll() {
    int x = 256;
    testPrimitive(256);
    System.out.println("x(2) = " + x);
    String s = "You";
    testString(s);
    System.out.println("s(2) = " + s);
    Double e = new Double(2.7182818);
    testObject1(e);
    System.out.println("e(2) = " + e);
    StringBuilder sb = new StringBuilder("CodeJava");
    testObject2(sb);
    System.out.println("sb(2) = " + sb);
  }

  public static void main(String[] args) {
    RefTest tester = new RefTest();
    tester.testAll();
  }

}

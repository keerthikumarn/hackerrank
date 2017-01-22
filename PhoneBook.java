package com.keerthi.hackerrank.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String name = in.next();
      int phone = in.nextInt();
      map.put(name, phone);
    }
    while (in.hasNext()) {
      String value = in.next();
      if (map.get(value) == null) {
        System.out.println("Not found");
      }
      else {
        System.out.println(value + "=" + map.get(value));
      }
    }
    in.close();
  }
}




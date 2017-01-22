package com.keerthi.hackerrank.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();
    char[] timeChar = time.toCharArray();
    char[] outputArr = Arrays.copyOfRange(timeChar, 0, 8);
    if (timeChar[8] == 'A' && time.substring(0, 2).intern().equals("12")) {
      outputArr[0] = '0';
      outputArr[1] = '0';
    }
    else if (timeChar[8] == 'P' && !time.substring(0, 2).intern().equals("12")) {
      String newTimeStr = "" + (Integer.parseInt(time.substring(0, 2)) + 12);
      char[] splitTime = newTimeStr.toCharArray();
      outputArr[0] = splitTime[0];
      outputArr[1] = splitTime[1];
    }
    System.out.println(outputArr);
  }

}

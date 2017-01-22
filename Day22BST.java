package com.keerthi.hackerrank.problems;

import java.util.Scanner;

public class Day22BST {

  public static int getHeight(BNode root) {
    int result = 0;
    if (root == null) {
      result = -1;
    }
    result = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    return result;
  }

  public static BNode insert(BNode root, int data) {
    if (root == null) {
      return new BNode(data);
    }
    BNode cur;
    if (data <= root.data) {
      cur = insert(root.left, data);
      root.left = cur;
    }
    else {
      cur = insert(root.right, data);
      root.right = cur;
    }
    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    BNode root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }

}

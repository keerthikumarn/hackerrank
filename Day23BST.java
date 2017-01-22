package com.keerthi.hackerrank.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BST {
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

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    BNode root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    levelOrder(root);
  }

  private static void levelOrder(BNode root) {
    Queue<BNode> myQueue = new LinkedList<BNode>();
    myQueue.add(root);
    while (!myQueue.isEmpty()) {
      BNode current = myQueue.remove();
      System.out.print(current.data + " ");
      if (current.left != null) {
        myQueue.add(current.left);
      }
      if (current.right != null) {
        myQueue.add(current.right);
      }
    }

  }
}

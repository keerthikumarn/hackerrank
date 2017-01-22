package com.keerthi.hackerrank.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueSolution {
  Stack<Character> stack = new Stack<Character>();

  Queue<Character> queue = new LinkedList<Character>();

  void pushCharacter(Character ch) {
      stack.push(ch);
  }

  void enqueueCharacter(char ch) {
      queue.add(ch);
  }

  char popCharacter(){
      return stack.pop();
  }

  char dequeueCharacter() {
      return queue.remove();
  }
}

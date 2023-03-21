package com.apexdev.algorithms.java.stack;

public class StackRunner {

  public static void main(String[] args) {
    // Implementation of stack with a fixed capacity
    Stack<String> gangOfFour = new ArrayStack<>(String.class, 4);
    gangOfFour.push("Erich");
    gangOfFour.push("Richard");
    gangOfFour.push("Ralph");

    gangOfFour.push("Eugene");
    System.out.println("Oops! Pop element: " + gangOfFour.pop());

    gangOfFour.push("John");
    System.out.println(gangOfFour);

    // Implementation of stack without fixed capacity
    Stack<Integer> leapYears = new LinkedStack<>();
    leapYears.push(2012);
    leapYears.push(2016);
    leapYears.push(2020);
    leapYears.push(2024);
    leapYears.push(2028);
    leapYears.push(2032);

    System.out.println(leapYears);
    System.out.println("Popped element: " + leapYears.pop());
    System.out.println("Peek top element: " + leapYears.peek());
  }
}

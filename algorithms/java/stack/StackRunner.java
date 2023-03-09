package com.apexdev.algorithms.java.stack;

public class StackRunner {

  public static void main(String[] args) {
    ArrayStack<String> gangOfFour = new ArrayStack<>(String.class, 4);
    gangOfFour.push("Erich");
    gangOfFour.push("Richard");
    gangOfFour.push("Ralph");

    gangOfFour.push("Eugene");
    gangOfFour.peek();
    gangOfFour.pop();

    gangOfFour.push("John");
  }
}

package com.apexdev.algorithms.java.stack;

public interface Stack<E> {

  void push(E element);

  E pop();

  E peek();

  boolean isEmpty();
}

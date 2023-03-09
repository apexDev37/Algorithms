package com.apexdev.algorithms.java.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
  private E[] elements;
  private int capacity;
  private int topOfStack = -1;    // Initialize default value

  private ArrayStack() {}

  public ArrayStack(Class<E> cls, int capacity) {
    this.capacity = capacity;
    @SuppressWarnings("unchecked")
    final E[] elements = (E[]) Array.newInstance(cls, capacity);
    this.elements = elements;
  }

  @Override
  public void push(E element) {
    if (topOfStack == elements.length - 1)
      throw new IllegalStateException("Stack capacity reached. Cannot add elements to stack.");

    topOfStack++;
    System.out.printf("Top of stack: %d%n", topOfStack);
    elements[topOfStack] = element;
    System.out.println("Stack: " + Arrays.toString(elements));
  }

  @Override
  public E pop() {
    if (isEmpty())
      throw new IllegalStateException("Empty stack: cannot return the last element.");
    E topElement = elements[topOfStack];
    elements[topOfStack] = null;
    topOfStack--;
    return topElement;
  }

  @Override
  public E peek() {
    System.out.println("Peek at top element: " + elements[topOfStack]);
    return elements[topOfStack];
  }

  @Override
  public boolean isEmpty() {
    return topOfStack == -1;
  }
}

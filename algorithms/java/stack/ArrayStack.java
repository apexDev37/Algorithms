package com.apexdev.algorithms.java.stack;

import java.lang.reflect.Array;
import java.util.Objects;

public class ArrayStack<E> implements Stack<E> {
  private final int capacity;
  private E[] elements;
  private int topOfStack = -1;    // Initialize default value

  public ArrayStack(Class<E> cls, int capacity) {
    this.capacity = capacity;
    initializeGenericArray(cls, capacity);
  }

  @SuppressWarnings("unchecked")
  private void initializeGenericArray(Class<E> cls, int capacity) {
    this.elements = (E[]) Array.newInstance(cls, capacity);
  }

  @Override
  public void push(E element) {
    if (topOfStack == capacity - 1)
      throw new IllegalStateException("Stack capacity reached. Cannot add element to stack.");
    pushToTop(element);
  }

  private void pushToTop(E element) {
    topOfStack++;
    elements[topOfStack] = element;
  }

  @Override
  public E pop() {
    if (isEmpty())
      throw new EmptyStackException("Cannot perform pop operation on empty stack");
    return popTopElement();
  }

  private E popTopElement() {
    E top = elements[topOfStack];
    deleteTopElement();
    return top;
  }

  private void deleteTopElement() {
    elements[topOfStack] = null;
    topOfStack--;
  }

  @Override
  public E peek() {
    if (isEmpty())
      throw new EmptyStackException("Cannot perform peek operation on empty stack");
    return elements[topOfStack];
  }

  @Override
  public boolean isEmpty() {
    return topOfStack == -1;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Stack { ");

    for (int index = capacity -1; index >= 0; index--) {
      if (Objects.nonNull(elements[index])) {
        builder.append(String.format("[%s], ", elements[index]));
      }
    }

    builder.setLength(builder.length() - 2);
    builder.append(" }");
    return builder.toString();
  }
}

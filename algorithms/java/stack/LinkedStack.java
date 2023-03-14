package com.apexdev.algorithms.java.stack;

public class LinkedStack<E> implements Stack<E> {
  private Node<E> head;
  private Node<E> topOfStack;
  private int size = 0;

  private static class Node<E> {
    E value;
    Node<E> next = null;

    Node(E value) { this.value = value; }
    void link(Node<E> next) { this.next = next; }
  }

  @Override
  public void push(E value) {
    if (isEmpty())
      updateTop(new Node<>(value));
    else pushToTop(new Node<>(value));
    size++;
  }

  private void pushToTop(Node<E> element) {
    element.link(head);
    updateTop(element);
  }

  private void updateTop(Node<E> element) {
    head = topOfStack = element;
  }

  @Override
  public E pop() {
    if (isEmpty())
      throw new EmptyStackException("Cannot perform pop operation on empty stack");
    return popTopElement();
  }

  private E popTopElement() {
    Node<E> top = topOfStack;
    deleteTopElement();
    return top.value;
  }

  private void deleteTopElement() {
    updateTop(head.next);
    size--;
  }

  @Override
  public E peek() {
    if (isEmpty())
      throw new EmptyStackException("Cannot perform peek operation on empty stack");
    return topOfStack.value;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Stack { ");

    Node<E> element = this.head;
    for (int location = 0; location < this.size - 1; location++) {
      builder.append(String.format("[%s], ", element.value));
      element = element.next;
    }

    builder.append(String.format("[%s] }", element.value));
    return builder.toString();
  }
}

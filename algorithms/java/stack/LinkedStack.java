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
      this.head = this.topOfStack = new Node<>(value);
    else {
      Node<E> element = new Node<>(value);
      element.link(this.head);
      head = topOfStack = element;
    }
    size++;
  }

  @Override
  public E pop() {
    // If stack is empty do not perform pop operation and throw new exception
    // Else if stack is not empty,
    // Store top element within the method scope
    // Delete the tOS
    // Return the stored value for the tOS

    Node<E> topElement;
    if (isEmpty())
      throw new IllegalStateException("Empty stack: cannot return the last element.");
    else {
      topElement = this.topOfStack;
      this.head = this.topOfStack = head.next;
      size--;
    }
    return topElement.value;
  }

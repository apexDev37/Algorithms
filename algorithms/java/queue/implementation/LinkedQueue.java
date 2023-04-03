package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.Queue;
import com.apexdev.algorithms.java.queue.exception.EmptyQueueException;

public class LinkedQueue<E> implements Queue<E> {
  private Node<E> front;
  private Node<E> back;
  private int size = 0;

  private static class Node<E> {
    E value;
    Node<E> next = null;

    Node(E value) {
      this.value = value;
    }

    void link(Node<E> next) {
      this.next = next;
    }
  }

  @Override
  public void enqueue(E element) {
    handleFirstEnqueue(element);
    back.link(new Node<>(element));
    size++;
  }

  private void handleFirstEnqueue(E element)
  { if (isEmpty())  front = back = new Node<>(element); }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    if (size == 1) back = null;
    return dequeueFrontElement();
  }

  private void handleEmptyQueue(String method) {
    if (isEmpty())
      throw new EmptyQueueException(String.format("Cannot perform %s operation on empty queue", method));
  }

  private E dequeueFrontElement() {
    E element = front.value;
    deleteFront();
    return element;
  }

  private void deleteFront()
  { front = front.next;   size--; }

  @Override
  public E peek() {
    handleEmptyQueue("peek");
    return front.value;
  }

  @Override
  public boolean isEmpty() {
    // force ensure all nodes in empty queue have no references,
    // compared to: size == 0
    return front == null && back == null;
  }

  @Override
  public boolean isFull() {
    return false;
  }
}

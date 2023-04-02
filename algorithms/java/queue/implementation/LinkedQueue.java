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
    if (isEmpty())
      front = back = new Node<>(element);
    back.link(new Node<>(element));
    size++;
  }

  @Override
  public E dequeue() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform dequeue operation on empty queue");
    E element = front.value;
    front = front.next;
    if (size == 1) back = null;
    size--;
    return element;
  }

  @Override
  public E peek() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform peek operation on empty queue");
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

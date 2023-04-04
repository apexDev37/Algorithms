package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.LinearDynamicQueue;

public class LinkedQueue<E> extends LinearDynamicQueue<E> {

  @Override
  public void enqueue(E element) {
    handleFirstEnqueue(element);
    back.link(new Node<>(element));
    size++;
  }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    if (size == 1) back = null;
    return dequeueFrontElement();
  }

  private E dequeueFrontElement() {
    E element = front.value;
    deleteFront();
    return element;
  }

  private void deleteFront()
    { this.front = front.next;   size--; }

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

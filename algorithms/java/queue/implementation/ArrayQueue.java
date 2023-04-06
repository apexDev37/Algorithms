package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.LinearStaticQueue;

import java.text.MessageFormat;
import java.util.Arrays;

class ArrayQueue<E> extends LinearStaticQueue<E> {

  public ArrayQueue(int capacity) {
    super(capacity);
  }

  @Override
  public void enqueue(E element) {
    handleFullQueue(element);
    enqueueToBack(element);
  }

  private void enqueueToBack(E element) {
    handleFirstEnqueue();
    elements[++back] = element;
  }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    return dequeueFrontElement();
  }

  private E dequeueFrontElement() {
    E element = elements[front];
    elements[front++] = null;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return back == -1 || front == capacity;
  }

  @Override
  public boolean isFull() {               // Disclaimer: returns true if queue reaches it's capacity and retains value
    return back == (capacity - 1);
  }

  @Override
  public String toString() {
    return MessageFormat.format(
            "Queue '{'\n\telements={0}\n'}'", Arrays.toString(elements));
  }
}

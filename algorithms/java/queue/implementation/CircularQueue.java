package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.LinearStaticQueue;

import java.text.MessageFormat;
import java.util.Arrays;

class CircularQueue<E> extends LinearStaticQueue<E> {

  public CircularQueue(int capacity) {
    super(capacity);
  }

  @Override
  public void enqueue(E element) {
    handleFullQueue(element);
    handleFirstEnqueue();
    nextBack();
    elements[back] = element;
  }

  private void nextBack() {
    this.back = (back + 1) == capacity ? 0 : back + 1;
  }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    return dequeFrontElement();
  }

  private E dequeFrontElement() {
    E element = elements[front];
    elements[front] = null;
    nextFront();
    return element;
  }

  private void nextFront() {
    this.front = (front + 1) == capacity ? 0 : front + 1;
  }

  @Override
  public boolean isEmpty() {
    return back == -1 && front == -1;
  }

  @Override
  public boolean isFull() {
    // front + (capacity - front) == capacity
    return (front == 0 && back == (capacity - 1))
            || (back + 1) == front;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
            "Queue '{'\n\telements={0}\n\tfront={1}\n'}'",
            Arrays.toString(elements),
            this.front);
  }
}

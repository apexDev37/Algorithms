package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.Queue;
import com.apexdev.algorithms.java.queue.exception.EmptyQueueException;

import java.text.MessageFormat;
import java.util.Arrays;

public class CircularQueue<E> implements Queue<E> {
  private final int capacity;
  private final E[] elements;
  private int front = -1;
  private int back = -1;

  @SuppressWarnings("uncheck")
  public CircularQueue(int capacity) {
    this.capacity = capacity;
    this.elements = (E[]) new Object[capacity];
  }

  @Override
  public void enqueue(E element) {
    if (isFull())
      throw new IllegalStateException(String.format("Queue at max capacity. Failed to add element: %s", element));
    manageCircularRotation();
    elements[back] = element;
  }

  private void manageCircularRotation() {
    this.front = front == -1 ? 0 : front;
    this.back = (back + 1) == capacity ? 0 : back + 1;
  }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    return dequeFrontElement();
  }

  private void handleEmptyQueue(String method) {
    if (isEmpty())
      throw new EmptyQueueException(String.format("Cannot perform %s operation on empty queue.", method));
  }

  private E dequeFrontElement() {
    E element = elements[front];
    elements[front++] = null;
    return element;
  }

  @Override
  public E peek() {
    handleEmptyQueue("peek");
    return elements[front];
  }

  @Override
  public boolean isEmpty() {
    return back == -1 || front == capacity;
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

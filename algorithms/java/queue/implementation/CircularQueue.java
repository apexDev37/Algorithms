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
    front = front == -1 ? 0 : front;
    if ((back + 1) == capacity)
      back = 0;
    else back++;
    elements[back] = element;
  }

  @Override
  public E dequeue() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform dequeue operation on empty queue.");
    E element = elements[front];
    elements[front++] = null;
    return element;
  }

  @Override
  public E peek() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform peek operation on empty queue.");
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
            "Queue '{'\n\telements={0}\n'}'", Arrays.toString(elements));
  }
}

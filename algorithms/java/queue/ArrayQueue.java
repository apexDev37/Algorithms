package com.apexdev.algorithms.java.queue;

public class ArrayQueue<E> implements Queue<E> {
  private final int capacity;
  private E[] elements;
  private int front;
  private int back;

  @SuppressWarnings("uncheck")
  public ArrayQueue(int capacity) {
    this.capacity = capacity;
    this.front = this.back = -1;
    this.elements = (E[]) new Object[capacity];
  }

  @Override
  public void enqueue(E element) {
    if (isFull())
      throw new IllegalStateException(String.format("Queue at max capacity. Failed to add element: %s", element));
    front = front == -1 ? 0 : front;
    back++;
    elements[back] = element;
  }

  @Override
  public E dequeue() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform dequeue operation on empty queue.");
    E element = elements[front];
    elements[front] = null;
    front++;
    return element;
  }

  @Override
  public E peek() {
    if (isEmpty())
      throw new EmptyQueueException("Cannot perform peek operation on empty queue.");;
    return elements[front];
  }

  @Override
  public boolean isEmpty() {
    return back == -1 || front == capacity;
  }

  @Override
  public boolean isFull() {               // Disclaimer: returns true if queue reaches it's capacity and retains value
    return back == (capacity - 1);
  }
}

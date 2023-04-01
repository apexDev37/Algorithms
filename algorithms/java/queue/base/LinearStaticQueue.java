package com.apexdev.algorithms.java.queue.base;

import com.apexdev.algorithms.java.queue.exception.EmptyQueueException;

/**
 * Abstract class for static queue implementations, that is,
 * queues with a fixed capacity.
 *
 * @param <E> generic type for queue elements.
 *
 * @author    Eugene Mwangi
 * @version   1.0
 * @since     04/01
 */
public abstract class LinearStaticQueue<E> implements Queue<E> {
  protected final int capacity;
  protected final E[] elements;
  protected int front = -1;
  protected int back = -1;

  @SuppressWarnings("unchecked")
  public LinearStaticQueue(int capacity) {
    this.capacity = capacity;
    this.elements = (E[]) new Object[capacity];
  }

  @Override
  public E peek() {
    handleEmptyQueue("peek");
    return elements[front];
  }

  /* Base utility functions common across various LSQ implementations */

  protected void handleEmptyQueue(String method) {
    if (isEmpty())
      throw new EmptyQueueException(String.format("Cannot perform %s operation on empty queue.", method));
  }

  protected void handleFullQueue(E element) {
    if (isFull())
      throw new IllegalStateException(String.format("Queue at max capacity. Failed to add element: %s", element));
  }
  protected void handleFirstEnqueue() {
    this.front = front == -1 ? 0 : front;
  }
}

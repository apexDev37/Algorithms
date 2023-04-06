package com.apexdev.algorithms.java.queue.base;

import com.apexdev.algorithms.java.queue.exception.EmptyQueueException;

/**
 * Abstract class for dynamic queue implementations, that is,
 * queues with no fixed capacity.
 *
 * @param <E> generic type for queue elements.
 *
 * @author    Eugene Mwangi
 * @version   1.0
 * @since     04/03
 */
public abstract class LinearDynamicQueue<E> implements Queue<E> {
  protected Node<E> front;
  protected Node<E> back;
  protected int size = 0;

  protected static class Node<E> {
    public E value;
    public Node<E> next = null;

    public Node(E value) { this.value = value; }

    public void link(Node<E> next) { this.next = next; }
  }

  @Override
  public E peek() {
    handleEmptyQueue("peek");
    return front.value;
  }

  /* Base utility functions common across various LSQ implementations */

  protected void handleFirstEnqueue(E element)
    { if (isEmpty())  front = back = new Node<>(element); }

  protected void handleEmptyQueue(String method) {
    if (isEmpty())
      throw new EmptyQueueException(String.format("Cannot perform %s operation on empty queue", method));
  }
}

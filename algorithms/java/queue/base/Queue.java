package com.apexdev.algorithms.java.queue.base;

public interface Queue<E> {

  void enqueue(E element);

  E dequeue();

  E peek();

  boolean isEmpty();

  boolean isFull();
}

package com.apexdev.algorithms.java.queue;

public interface Queue<E> {

  void enqueue(E element);

  E dequeue();

  E peek();

  boolean isEmpty();

  boolean isFull();
}

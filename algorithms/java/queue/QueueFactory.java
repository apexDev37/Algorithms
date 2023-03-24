package com.apexdev.algorithms.java.queue;

public final class QueueFactory {

  // Instantiate new linear queue with a fixed capacity
  public static <E> Queue<E> capacityOf(int capacity) {
    return new ArrayQueue<>(capacity);
  }
}

package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.Queue;

public final class QueueFactory {

  // Instantiate new linear queue with a fixed capacity
  public static <E> Queue<E> capacityOf(int capacity) {
    return new ArrayQueue<>(capacity);
  }

  // Instantiate new linear circular queue with a fixed capacity
  public static <E> Queue<E> newReusable(int capacity) {
    return new CircularQueue<>(capacity);
  }

  // Instantiate new linear queue with a variable size capacity
  public static <E> Queue<E> newDynamic() {
    return new LinkedQueue<>();
  }
}

package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.Queue;

public final class QueueFactory {

  // Instantiate new linear queue with a fixed capacity
  public static <E> Queue<E> capacityOf(int capacity) {
    return new ArrayQueue<>(capacity);
  }
}

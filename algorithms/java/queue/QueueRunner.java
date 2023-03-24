package com.apexdev.algorithms.java.queue;

public class QueueRunner {

  public static void main(String[] args) {

    // Instantiate queue with a fixed capacity
    Queue<String> primitives = QueueFactory.capacityOf(5);

    primitives.enqueue("char");
    primitives.enqueue("int");
    primitives.enqueue("boolean");
    primitives.enqueue("float");
    primitives.enqueue("double");

    System.out.println(primitives);
  }
}

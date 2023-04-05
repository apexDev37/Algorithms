package com.apexdev.algorithms.java.queue;

import com.apexdev.algorithms.java.queue.base.Queue;
import com.apexdev.algorithms.java.queue.implementation.QueueFactory;

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

    // Instantiate memory efficient queue with a fixed capacity
    Queue<String> faang = QueueFactory.newReusable(5);
    faang.enqueue("Facebook");
    faang.enqueue("Apple");
    faang.enqueue("Amazon");
    faang.enqueue("Netflix");
    faang.enqueue("Google");

    faang.dequeue();
    faang.enqueue("Meta");

    faang.dequeue();
    System.out.println(faang);

    // Instantiate queue without a capacity limit
    Queue<String> cloudVendors = new LinkedQueue<>();

    cloudVendors.enqueue("Heroku");
    cloudVendors.enqueue("AWS");
    cloudVendors.enqueue("GCP");
    cloudVendors.enqueue("Azure");
    cloudVendors.enqueue("Alibaba cloud");
    cloudVendors.enqueue("Digital Ocean");
    cloudVendors.enqueue("IBM cloud");

    cloudVendors.dequeue();
    System.out.println(cloudVendors);
  }
}

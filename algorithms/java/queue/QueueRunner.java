package com.apexdev.algorithms.java.queue;

public class QueueRunner {

  public static void main(String[] args) {
    Queue<String> vowels = new ArrayQueue<>(5);

    vowels.enqueue("a");
    vowels.enqueue("e");
    vowels.enqueue("i");
    vowels.enqueue("o");
    vowels.enqueue("u");


    vowels.dequeue();
    vowels.dequeue();
    vowels.dequeue();
    vowels.dequeue();

    vowels.dequeue();
  }
}

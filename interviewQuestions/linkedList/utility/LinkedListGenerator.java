package com.apexdev.interviewQuestions.linkedList.utility;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;

import java.util.Random;

public class LinkedListGenerator {
  private static SingleLinkedList linkedList;

  public static SingleLinkedList generate(int size) {
    create();
    insert(size);
    return linkedList;
  }

  private static void create() {
    linkedList = new SingleLinkedList();
    linkedList.createLinkedList(2);
  }

  private static void insert(int size) {
    for (int insertion = 0; insertion < size; insertion++)
      linkedList.insertNode(0, randomDigit(1, 9));
  }

  private static int randomDigit(int min, int max) {
    return new Random().nextInt((max - min) + 1) + min;
  }
}

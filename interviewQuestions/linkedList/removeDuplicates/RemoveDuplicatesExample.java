package com.apexdev.interviewQuestions.linkedList.removeDuplicates;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;

public class RemoveDuplicatesExample {

  public static void main(String[] args) {
    SingleLinkedList linkedList = generate();
    RemoveDuplicates.execute(linkedList);
  }

  private static SingleLinkedList generate() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.createLinkedList(2);
    insertInto(linkedList);
    return linkedList;
  }

  private static void insertInto(SingleLinkedList linkedList) {
    linkedList.insertNode(0, 2);
    linkedList.insertNode(1, 4);
    linkedList.insertNode(2, 1);
    linkedList.insertNode(3, 4);
  }
}

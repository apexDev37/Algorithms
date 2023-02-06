package com.apexdev.algorithms.java.circularDoublyLinkedList;

public class Main {

  public static void main(String[] args) {

    // Creation
    CircularDoublyLinkedList linkedList = new CircularDoublyLinkedList();
    linkedList.createLinkedList(3);

    // Insertion
    linkedList.insertNode(0, 5);
    linkedList.insertNode(1, 7);
    linkedList.insertNode(10, 9);
    linkedList.insertNode(2, 11);

    // Traversal
    linkedList.displayNodes();
    linkedList.displayReversedNodes();

    // Searching
    linkedList.searchNode(7);

    // Deletion
    linkedList.deleteNode(10);
    linkedList.displayNodes();
    linkedList.displayReversedNodes();
  }
}

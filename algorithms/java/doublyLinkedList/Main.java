package com.apexdev.algorithms.java.doublyLinkedList;

public class Main {

  public static void main(String[] args) {

    // Creation
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.createLinkedList(3);

    // Insertion
    linkedList.insertNode(-1, 5);
    linkedList.insertNode(50, 7);
    linkedList.insertNode(2, 9);
    linkedList.insertNode(0, 11);

    // Traversal
    linkedList.displayNodes();
    linkedList.displayReversedNodes();

    // Searching
    linkedList.searchNode(9);

    // Deletion
    linkedList.deleteNode(3);
    linkedList.displayNodes();
  }
}

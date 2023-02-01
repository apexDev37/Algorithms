package com.apexdev.algorithms.java.circularDoublyLinkedList.base;


public class LinkedList {
  protected Node head;
  protected Node tail;
  protected int size;

  protected boolean emptyLinkedList() {
    return this.head == null;
  }

  public Node getNodeAt(int location) {
    try {
      return getNode(location);
    } catch (NullPointerException exception) {
      throw new IndexOutOfBoundsException("Given node location: " + location + ", does not exist.");
    }
  }

  private Node getNode(int location) {
    Node currentNode = this.head;
    for (int n = 0; n < location - 1; n++)
      currentNode = currentNode.next;
    return currentNode;
  }

  protected int getNodeLocation(int target) {
    Node currentNode = this.head;
    for (int location = 0; location < this.size; location++) {
      if (currentNode.value == target)
        return location;
      currentNode = currentNode.next;
    }
    return -1;
  }

}

package com.apexdev.algorithms.java.circularDoublyLinkedList;

import com.apexdev.algorithms.java.circularDoublyLinkedList.base.LinkedList;
import com.apexdev.algorithms.java.circularDoublyLinkedList.base.Node;

import java.util.NoSuchElementException;

public class CircularDoublyLinkedList extends LinkedList {
  private Node newNode;

  // Creation
  public void createLinkedList(int nodeValue) {
    createNewNode(nodeValue);
    linkDoubly(newNode, newNode);
    assignHeadNewNode();
    assignTailNewNode();
    this.size = 1;
  }

  private void createNewNode(int nodeValue) {
    this.newNode = new Node();
    this.newNode.value = nodeValue;
  }

  private void assignHeadNewNode() {
    this.head = newNode;
  }

  private void assignTailNewNode() {
    this.tail = newNode;
  }

  private void linkDoubly(Node currentNode, Node nextNode) {
    currentNode.next = nextNode;
    nextNode.prev = currentNode;
  }

  // Insertion
  public void insertNode(int location, int nodeValue) {
    if (!emptyLinkedList()) {
      createNewNode(nodeValue);
      insertNodeAt(location);
    } else createLinkedList(nodeValue);
    this.size++;
  }

  private void insertNodeAt(int location) {
    if (location <= 0)
      insertBeforeHead();
    else if (location >= this.size)
      insertAfterTail();
    else insertAt(location);
  }

  private void insertBeforeHead() {
    linkDoubly(tail, newNode);
    linkDoubly(newNode, head);
    assignHeadNewNode();
  }

  private void insertAfterTail() {
    linkDoubly(tail, newNode);
    linkDoubly(newNode, head);
    assignTailNewNode();
  }

  private void insertAt(int location) {
    Node currentNode = getNodeAt(location);
    Node nextNode = currentNode.next;
    linkDoubly(currentNode, newNode);
    linkDoubly(newNode, nextNode);
  }

  // Traversal
  public void displayNodes() {
    try {
      traverseLinkedList(1);
    } catch (NullPointerException e) {
      throw new IllegalStateException("Cannot traverse empty linked list");
    }
  }

  public void displayReversedNodes() {
    try {
      traverseLinkedList(-1);
    } catch (NullPointerException e) {
      throw new IllegalStateException("Cannot traverse empty linked list");
    }
  }

  private void traverseLinkedList(int direction) {
    StringBuilder builder = new StringBuilder();
    traverse(direction, builder);
    printLinkedList(builder);
  }

  private void traverse(int direction, StringBuilder builder) {
    Node currentNode = (direction == 1)? this.head : this.tail;
    for (int location = 0; location < this.size; location++) {
      appendNode(builder, currentNode, location);
      currentNode = (direction == 1)? currentNode.next : currentNode.prev;
    }
  }

  private void appendNode(StringBuilder builder, Node currentNode, int location) {
    if (location != this.size - 1) {
      builder.append(String.format("[%d]", currentNode.value));
      builder.append(" <-> ");
    } else builder.append(String.format("[%d]", currentNode.value));
  }

  private void printLinkedList(StringBuilder builder) {
    System.out.println("Linked List: " + builder.toString());
  }

  // Searching
  public void searchNode(int nodeValue) {
    try {
      int location = getNodeLocation(nodeValue);
      searchStatus(location);
    } catch (Exception e) {
      throw new NoSuchElementException(String.format("Node with value: %d, does not exist in linked list.", nodeValue));
    }
  }

  private void searchStatus(int location) {
    if (location == -1)
      throw new IllegalArgumentException();
    System.out.println("Node found at location: " + location);
  }

  private void nullifyReferences(Node currentNode) {
    currentNode.next = null;
    currentNode.prev = null;
  }
}



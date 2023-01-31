package com.apexdev.algorithms.java.doublyLinkedList;

import com.apexdev.algorithms.java.doublyLinkedList.base.LinkedList;
import com.apexdev.algorithms.java.doublyLinkedList.base.Node;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class DoublyLinkedList extends LinkedList {
  private Node newNode;

  // Creation
  public void createLinkedList(int nodeValue) {
    createNewNode(nodeValue);
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
    linkDoubly(this.newNode, this.head);
    assignHeadNewNode();
  }

  private void insertAfterTail() {
    linkDoubly(this.tail, this.newNode);
    assignTailNewNode();
  }

  private void insertAt(int location) {
    Node currentNode = getNodeAt(location);
    Node nextNode = currentNode.next;
    linkDoubly(currentNode, this.newNode);
    linkDoubly(this.newNode, nextNode);
  }

  private void linkDoubly(Node currentNode, Node nextNode) {
    currentNode.next = nextNode;
    nextNode.prev = currentNode;
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

  // Deletion
  public void deleteNode(int nodeLocation) {
    if (this.size < 2) deleteLinkedList();
    else deleteNodeAt(nodeLocation);
    this.size--;
  }

  public void deleteLinkedList() {
    nullifyAllNodesPreviousReference();
    this.head = null;
    this.tail = null;
  }

  private void nullifyAllNodesPreviousReference() {
    Node currentNode = this.head;
    for (int location = 0; location < this.size - 1; location++) {
      currentNode = currentNode.next;
      currentNode.prev = null;
    }
  }

  private void deleteNodeAt(int location) {
    if (location >= 1) {
      Node currentNode = getNodeAt(location);
      if (location == (this.size - 1)) deleteLastNode(currentNode);
      else deleteGivenNode(currentNode);
    } else deleteFirstNode();
  }

  private void deleteFirstNode() {
    this.head = this.head.next;
    this.head.prev = null;
  }

  private void deleteLastNode(Node node) {
    node.next = null;
    this.tail = node;
  }

  private void deleteGivenNode(Node node) {
    Node nextNode = node.next.next;
    linkDoubly(node, nextNode);
  }
}

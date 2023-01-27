package com.apexdev.algorithms.java.circularSinglyLinkedList;

import com.apexdev.algorithms.java.circularSinglyLinkedList.base.LinkedList;
import com.apexdev.algorithms.java.circularSinglyLinkedList.base.Node;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList extends LinkedList {
  private Node newNode;

  // Creation
  public void createLinkedList(int nodeValue) {
    createNewNode(nodeValue);
    assignHeadNewNode();
    assignTailNewNode();
    createCircularLink();
    this.size = 1;
  }

  private void createNewNode(int nodeValue) {
    this.newNode = new Node();
    this.newNode.value = nodeValue;
    this.newNode.next = null;
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
      createCircularLink();
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
    this.newNode.next = this.head;
    this.head = this.newNode;
  }

  private void insertAfterTail() {
    this.tail.next = this.newNode;
    this.newNode.next = null;
    this.tail = this.newNode;
  }

  private void insertAt(int location) {
    Node currentNode = getNodeAt(location);
    this.newNode.next = currentNode.next;
    currentNode.next = this.newNode;
  }

  // Traversal
  public void displayNodes() {
    try {
      traverseLinkedList();
    } catch (NullPointerException e) {
      throw new IllegalStateException("Cannot traverse given empty linked list");
    }
  }

  private void traverseLinkedList() {
    StringBuilder builder = new StringBuilder();
    traverse(builder);
    printLinkedList(builder);
  }

  private void traverse(StringBuilder builder) {
    Node currentNode = this.head;
    for (int location = 0; location < this.size; location++) {
      appendNode(builder, currentNode, location);
      currentNode = currentNode.next;
    }
  }

  private void appendNode(StringBuilder builder, Node currentNode, int location) {
    if (location != this.size - 1) {
      builder.append(String.format("[%d]", currentNode.value));
      builder.append(" -> ");
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
    else {
      deleteNodeAt(nodeLocation);
      createCircularLink();
    }
    this.size--;
  }

  private void deleteLinkedList() {
    this.head = null;
    this.tail.next = null;
    this.tail = null;
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
  }

  private void deleteLastNode(Node node) {
    node.next = this.head;
    this.tail = node;
  }

  private void deleteGivenNode(Node node) {
    Node nextNode = node.next;
    node.next = nextNode.next;
  }

  private void createCircularLink() {
    this.tail.next = this.head;
  }
}

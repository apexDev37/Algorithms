package com.apexdev.algorithms.java.doublyLinkedList;

import com.apexdev.algorithms.java.doublyLinkedList.base.LinkedList;
import com.apexdev.algorithms.java.doublyLinkedList.base.Node;

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
    this.newNode.next = null;
    this.newNode.prev = null;
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
    this.newNode.next = this.head;
    this.newNode.prev = null;
    this.head = this.newNode;
  }

  private void insertAfterTail() {
    this.tail.next = null;
    this.tail.prev = this.tail;
    this.tail = this.newNode;
  }

  private void insertAt(int location) {
    Node currentNode = getNodeAt(location);
    Node nextNode = currentNode.next;
    linkDoublyNodes(currentNode, nextNode);
  }

  private void linkDoublyNodes(Node currentNode, Node nextNode) {
    currentNode.next = this.newNode;
    this.newNode.prev = currentNode;
    this.newNode.next = nextNode;
    nextNode.prev = this.newNode;
  }
}

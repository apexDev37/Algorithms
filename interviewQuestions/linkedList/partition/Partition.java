package com.apexdev.interviewQuestions.linkedList.partition;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

public final class Partition {

  public static void execute(SingleLinkedList linkedList, int target) {
    Node currentNode = linkedList.head;
    linkedList.tail = linkedList.head;
    partition(linkedList, target, currentNode);
    outputResults(linkedList, target);
  }

  private static void partition(SingleLinkedList linkedList, int target, Node currentNode) {
    for (int location = 0; location < linkedList.size; location++) {
      Node nextNode = currentNode.next;
      insertBasedOnTarget(linkedList, target, currentNode);
      currentNode = nextNode;
    }
    linkedList.tail.next = null;
  }

  private static void insertBasedOnTarget(SingleLinkedList linkedList, int target, Node currentNode) {
    if (currentNode.value < target)
      insertBeforeHead(linkedList, currentNode);
    else insertAfterTail(linkedList, currentNode);
  }

  private static void insertBeforeHead(SingleLinkedList linkedList, Node currentNode) {
    currentNode.next = linkedList.head;
    linkedList.head = currentNode;
  }

  private static void insertAfterTail(SingleLinkedList linkedList, Node currentNode) {
    linkedList.tail.next = currentNode;
    linkedList.tail = currentNode;
  }

  private static void outputResults(SingleLinkedList linkedList, int target) {
    System.out.printf("Partitioned by target (%d): %n", target);
    linkedList.displayNodes();
  }
}

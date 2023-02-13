package com.apexdev.interviewQuestions.linkedList.partition;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

public final class Partition {

  public static void execute(SingleLinkedList linkedList, int target) {
    Node currentNode = linkedList.head;
    linkedList.tail = linkedList.head;

    for (int location = 0; location < linkedList.size; location++) {
      Node nextNode = currentNode.next;

      if (currentNode.value < target) {
        // Insert current node before head node
        currentNode.next = linkedList.head;
        linkedList.head = currentNode;
      } else {
        // Insert current node after tail node
        linkedList.tail.next = currentNode;
        linkedList.tail = currentNode;
      }

      currentNode = nextNode;
    }

    linkedList.tail.next = null;
    System.out.printf("Partitioned by target (%d): %n", target);
    linkedList.displayNodes();
  }
}

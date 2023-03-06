package com.apexdev.interviewQuestions.linkedList.removeDuplicates;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

import java.util.HashSet;

public class RemoveDuplicates {

  public static void execute(SingleLinkedList linkedList) {
    System.out.println("Before removing duplicates");
    linkedList.displayNodes();
    removeDuplicates(linkedList);
    System.out.println("After removing duplicates");
    linkedList.displayNodes();
  }

  private static void removeDuplicates(SingleLinkedList linkedList) {
    Node currentNode = linkedList.head;
    Node previousNode = null;
    HashSet<Integer> existingValues = new HashSet<>();

    for (int location = 0; location < linkedList.size; location++) {
      if (existingValues.contains(currentNode.value)) {
        delete(linkedList, currentNode, previousNode);
        location--;
      } else {
        existingValues.add(currentNode.value);
        previousNode = currentNode;
      }

      currentNode = currentNode.next;
    }
  }

  private static void delete(SingleLinkedList linkedList, Node currentNode, Node previousNode) {
    previousNode.next = currentNode.next;
    linkedList.size--;
  }
}

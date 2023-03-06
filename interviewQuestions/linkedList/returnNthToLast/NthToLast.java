package com.apexdev.interviewQuestions.linkedList.returnNthToLast;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

import java.util.HashMap;
import java.util.Map;

public final class NthToLast {
  private static final Map<Integer, Node> locationNodeMap = new HashMap<>();
  private static final Node nthNode;

  public static void execute(int nth, SingleLinkedList linkedList) {
    mapLocationToNode(linkedList);
    findNthNode(nth);
    displayDetails(nth, linkedList);
  }

  private static void mapLocationToNode(SingleLinkedList linkedList) {
    int location = 0;
    Node currentNode = linkedList.head;
    while (currentNode != null) {
      locationNodeMap.put(location, currentNode);
      currentNode = currentNode.next;
      location += 1;
    }
  }

  private static void findNthNode(int nth) {
    int lastNodeLocation = locationNodeMap.size() - 1;
    int nthLocation = (lastNodeLocation - nth) + 1;
    nthNode = locationNodeMap.get(nthLocation);
  }

  private static void displayDetails(int nth, SingleLinkedList linkedList) {
    linkedList.displayNodes();
    System.out.printf("Nth Node -> Location: %d, Value: [%d]%n", nth, nthNode.value);
  }
}

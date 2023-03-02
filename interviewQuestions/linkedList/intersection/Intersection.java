package com.apexdev.interviewQuestions.linkedList.intersection;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

import java.util.Objects;

public final class Intersection {
  private static Node longer;
  private static Node shorter;

  public static void execute(SingleLinkedList firstList, SingleLinkedList secondList) {
    System.out.println("Intersection implementation----------------");
    initializeFields(firstList, secondList);

    System.out.println(longer.value);
    System.out.println(shorter.value);

    int difference = firstList.size - secondList.size;
    Node longerStartingNode = getNodeAfterExtraNodes(difference);
    System.out.printf("Starting node: %d%n", longerStartingNode.value);


    // Find the kth Node
    longer = longerStartingNode;
    while (longer.next != null) {
      longer = longer.next;
      shorter = shorter.next;
      if (Objects.equals(longer, shorter)) {
        System.out.println("Found Kth Node");
        System.out.println("Kth Node: " + longer.value);
      }
    }
  }

  private static Node getNodeAfterExtraNodes(int difference) {
    Node currentNode = longer;
    for (int location = 0; location < difference; location++)
      currentNode = currentNode.next;
    return currentNode;
  }

  private static void initializeFields(SingleLinkedList firstList, SingleLinkedList secondList) {
    if (firstList.size > secondList.size)
      assignLongerShorter(firstList, secondList);
    else assignLongerShorter(secondList, firstList);
  }

  private static void assignLongerShorter(SingleLinkedList longerList, SingleLinkedList shorterList) {
    longer = longerList.head;
    shorter = shorterList.head;
  }
}

package com.apexdev.interviewQuestions.linkedList.intersection;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

import java.util.NoSuchElementException;
import java.util.Objects;

public final class Intersection {
  private static Node longer;
  private static Node shorter;

  public static void execute(SingleLinkedList firstList, SingleLinkedList secondList) {
    initializeFields(firstList, secondList);
    Node kthNode = findKthNode(firstList, secondList);
    outputDetails(kthNode);
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

  private static Node findKthNode(SingleLinkedList firstList, SingleLinkedList secondList) {
    ignoreExtraNodesInLongerList(firstList, secondList);
    return getKthNode();
  }

  private static void ignoreExtraNodesInLongerList(SingleLinkedList firstList, SingleLinkedList secondList) {
    int extraNodes = Math.abs(firstList.size - secondList.size);
    longer = getNodeAfter(extraNodes);
  }

  private static Node getNodeAfter(int extraNodes) {
    Node currentNode = longer;
    for (int location = 0; location < extraNodes; location++)
      currentNode = currentNode.next;
    return currentNode;
  }

  private static Node getKthNode() {
    while (longer.next != null) {
      updateToNextNodes();
      if (Objects.equals(longer, shorter))
        return longer;
    }
    throw new NoSuchElementException("Intersection node (kth)  does not exist");
  }

  private static void updateToNextNodes() {
    longer = longer.next;
    shorter = shorter.next;
  }

  private static void outputDetails(Node kthNode) {
    System.out.printf("[Kth node] -> reference: %s, value: %d%n",
            kthNode, kthNode.value);
  }
}

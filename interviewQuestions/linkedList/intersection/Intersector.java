package com.apexdev.interviewQuestions.linkedList.intersection;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.interviewQuestions.linkedList.utility.LinkedListGenerator;

public final class Intersector {
  private static final SingleLinkedList intersectionList
          = LinkedListGenerator.generate(3);

  public static void intersect(SingleLinkedList firstList, SingleLinkedList secondList) {
    outputDetailsWhen("Before", firstList, secondList);
    createIntersectionPoint(firstList, secondList);
    outputDetailsWhen("After", firstList, secondList);

  }

  private static void createIntersectionPoint(SingleLinkedList firstList, SingleLinkedList secondList) {
    create(firstList, secondList);
    handleListSize(firstList, secondList);
  }

  private static void create(SingleLinkedList firstList, SingleLinkedList secondList) {
    firstList.tail.next = intersectionList.head;
    secondList.tail.next = intersectionList.head;
  }

  private static void handleListSize(SingleLinkedList firstList, SingleLinkedList secondList) {
    firstList.size += intersectionList.size;
    secondList.size += intersectionList.size;
  }

  private static void
  outputDetailsWhen(String state, SingleLinkedList firstList, SingleLinkedList secondList) {
    System.out.printf("%s intersection -----------------------%n", state);
    firstList.displayNodes();
    secondList.displayNodes();
  }
}

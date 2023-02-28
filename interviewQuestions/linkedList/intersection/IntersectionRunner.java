package com.apexdev.interviewQuestions.linkedList.intersection;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.interviewQuestions.linkedList.utility.LinkedListGenerator;

public class IntersectionRunner {

  public static void main(String[] args) {
    // Generate two linked lists of different sizes - (4), (2)
    SingleLinkedList firstList = LinkedListGenerator.generate(4);
    SingleLinkedList secondList = LinkedListGenerator.generate(2);

    // Create an intersection point for the two generated lists
    Intersector.intersect(firstList, secondList);

    // Find the kth node where the two lists intersect
    Intersection.execute(firstList, secondList);
  }
}

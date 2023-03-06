package com.apexdev.interviewQuestions.linkedList.returnNthToLast;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.interviewQuestions.linkedList.utility.LinkedListGenerator;

public class NthToLastExample {

  public static void main(String[] args) {
    int nth = 5;
    SingleLinkedList linkedList = LinkedListGenerator.generate(7);
    NthToLast.execute(nth, linkedList);
  }
}

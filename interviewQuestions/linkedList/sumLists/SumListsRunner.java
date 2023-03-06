package com.apexdev.interviewQuestions.linkedList.sumLists;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.interviewQuestions.linkedList.utility.LinkedListGenerator;

public class SumListsRunner {

  public static void main(String[] args) {
    SingleLinkedList firstListValue = LinkedListGenerator.generate(4);
    SingleLinkedList secondListValue = LinkedListGenerator.generate(3);
    SumLists.execute(firstListValue, secondListValue);
  }
}

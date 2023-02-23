package com.apexdev.interviewQuestions.linkedList.sumLists;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

import java.util.List;

public final class SumLists {

  public static void
    execute(SingleLinkedList firstListValue, SingleLinkedList secondListValue) {
      firstListValue.displayNodes();
      secondListValue.displayNodes();

      int firstValueSum = 0;
      int secondValueSum = 0;
      SingleLinkedList sumList = new SingleLinkedList();

      Node currentNode = firstListValue.head;
      int digitPosition = 1;
      for (int location = 0; location < firstListValue.size; location++) {
        int digit = currentNode.value;
        firstValueSum += digit * digitPosition;
        digitPosition *= 10;

        currentNode = currentNode.next;

      }

      currentNode = secondListValue.head;
      digitPosition = 1;
      for (int location = 0; location < secondListValue.size; location++) {
        int digit = currentNode.value;
        secondValueSum += digit * digitPosition;
        digitPosition *= 10;

        currentNode = currentNode.next;
      }

      System.out.println("First Value Sum: " + firstValueSum);
      System.out.println("Second Value Sum: " + secondValueSum);

      int sumOfLists = firstValueSum + secondValueSum;

      System.out.println("Sum of Lists: " + sumOfLists);

      char[] digits = String.valueOf(sumOfLists).toCharArray();
      for (char digit : digits) {
        int nodeValue = Integer.parseInt(String.valueOf(digit));
        System.out.println("Node value to be inserted: " + nodeValue);
        sumList.insertNode(0, nodeValue);
      }

    System.out.println("Size: " + sumList.size);
      sumList.displayNodes();
  }
}

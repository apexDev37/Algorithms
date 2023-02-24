package com.apexdev.interviewQuestions.linkedList.sumLists;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

public final class SumLists {

  public static void execute(SingleLinkedList firstList,
                             SingleLinkedList secondList) {

    // Display nodes of both lists
    firstList.displayNodes();
    secondList.displayNodes();

    // Compute value sum of both lists
    int sumOfLists = computeSumOfLists(firstList, secondList);
    System.out.println("Sum of Lists: " + sumOfLists);

    // Insert each digit from the computed sum of lists in new linked list in reverse order
    SingleLinkedList sumList = convertValueToList(sumOfLists);

    sumList.displayNodes();
  }

  private static int computeSumOfLists(SingleLinkedList firstList, SingleLinkedList secondList) {
    System.out.println("First value: " + convertListToValue(firstList));
    System.out.println("Second value: " + convertListToValue(secondList));
    return convertListToValue(firstList)
            + convertListToValue(secondList);
  }

  private static int convertListToValue(SingleLinkedList listValue) {
    StringBuilder value = buildValue(listValue);
    int reversedValue = Integer.parseInt(value.reverse().toString());
    System.out.println("Value Sum String Representation: " + reversedValue);
    return reversedValue;
  }

  private static StringBuilder buildValue(SingleLinkedList listValue) {
    StringBuilder valueBuilder = new StringBuilder(listValue.size);
    appendEachNodeValueAsDigit(listValue, valueBuilder);
    return valueBuilder;
  }

  private static void appendEachNodeValueAsDigit(SingleLinkedList listValue, StringBuilder value) {
    Node currentNode = listValue.head;
    for (int location = 0; location < listValue.size; location++) {
      value.append(currentNode.value);
      currentNode = currentNode.next;
    }
  }

  private static SingleLinkedList convertValueToList(int value) {
    // Create new list to contain digits of the sum of lists in reverse order
    SingleLinkedList sumList = new SingleLinkedList();
    insertDigitsToList(value, sumList);
    return sumList;
  }

  private static void insertDigitsToList(int value, SingleLinkedList sumList) {
    for (char digit : getDigits(value)) {
      int nodeValue = Character.getNumericValue(digit);
      sumList.insertNode(0, nodeValue);
    }
  }

  private static char[] getDigits(int value) {
    return String.valueOf(value).toCharArray();
  }
}


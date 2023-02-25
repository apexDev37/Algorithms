package com.apexdev.interviewQuestions.linkedList.sumLists;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;

public final class SumLists {

  public static void execute(SingleLinkedList firstList,
                             SingleLinkedList secondList) {
    detailsBeforeOperation(firstList, secondList);
    getSumList(firstList, secondList).displayNodes();
  }

  private static void detailsBeforeOperation(SingleLinkedList firstList, SingleLinkedList secondList) {
    firstList.displayNodes();
    secondList.displayNodes();
  }

  private static SingleLinkedList getSumList(SingleLinkedList firstList, SingleLinkedList secondList) {
    int sumOfLists = computeSumOfLists(firstList, secondList);
    return convertValueToList(sumOfLists);
  }


  private static int computeSumOfLists(SingleLinkedList firstList, SingleLinkedList secondList) {
    return convertListToValue(firstList)
            + convertListToValue(secondList);
  }

  private static int convertListToValue(SingleLinkedList listValue) {
    StringBuilder value = buildValue(listValue);
    return Integer.parseInt(value.reverse().toString());
  }

  private static StringBuilder buildValue(SingleLinkedList listValue) {
    StringBuilder valueBuilder = new StringBuilder(listValue.size);
    appendEachNodeValue(listValue, valueBuilder);
    return valueBuilder;
  }

  private static void appendEachNodeValue(SingleLinkedList listValue, StringBuilder value) {
    Node currentNode = listValue.head;
    for (int location = 0; location < listValue.size; location++) {
      value.append(currentNode.value);
      currentNode = currentNode.next;
    }
  }

  private static SingleLinkedList convertValueToList(int value) {
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


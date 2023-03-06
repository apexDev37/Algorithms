package com.apexdev.interviewQuestions.linkedList.partition;

import com.apexdev.algorithms.java.singlyLinkedList.SingleLinkedList;
import com.apexdev.algorithms.java.singlyLinkedList.base.Node;
import com.apexdev.interviewQuestions.linkedList.utility.LinkedListGenerator;

public class PartitionExample {

  public static void main(String[] args) {
    SingleLinkedList linkedList = LinkedListGenerator.generate(5);
    Node node = linkedList.getNodeAt(3);
    int target = node.value;

    linkedList.displayNodes();
    Partition.execute(linkedList, target);
  }
}

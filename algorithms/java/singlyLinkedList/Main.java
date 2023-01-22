package com.apexdev.algorithms;

import com.apexdev.algorithms.singlyLinkedList.SingleLinkedList;

public class Main {

    public static void main(String[] args) {

        // Creation
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.createLinkedList(7);
        linkedList.displayNodes();

        // Insertion
        linkedList.insertNode(0, 3);
        linkedList.insertNode(2, 2);
        linkedList.insertNode(3, 4);
        linkedList.displayNodes();

        // Searching
        linkedList.searchNode(7);

        // Deletion
        linkedList.deleteNode(0);
        linkedList.displayNodes();
    }
}

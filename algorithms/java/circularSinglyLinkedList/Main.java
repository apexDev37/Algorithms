package com.apexdev.algorithms.java.circularSinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        // Creation
        CircularSinglyLinkedList linkedList = new CircularSinglyLinkedList();
        linkedList.createLinkedList(7);

        // Insertion
        linkedList.insertNode(0, 3);
        linkedList.insertNode(0, 9);
        linkedList.insertNode(20, 6);
        linkedList.displayNodes();

        // Searching
        linkedList.searchNode(7);

        // Deletion
        linkedList.deleteNode(20);
        linkedList.displayNodes();
    }
}

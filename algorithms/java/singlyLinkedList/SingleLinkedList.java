package com.apexdev.algorithms.linkedlist.single;

import com.apexdev.algorithms.linkedlist.LinkedList;
import com.apexdev.algorithms.linkedlist.Node;

import java.util.NoSuchElementException;

public class SingleLinkedList extends LinkedList {
    private Node newlyCreatedNode;

    // Creation
    public void createLinkedList(int nodeValue) {
        Node firstNode = new Node();
        firstNode.value = nodeValue;
        firstNode.next = null;
        this.head = firstNode;
        this.tail = firstNode;
        this.size = 1;
    }

    // Insertion
    public void insertNode(int location, int nodeValue) {
        // Handle insertion into empty linked list
        if (this.head == null) {
            createLinkedList(nodeValue);
            return;
        }

        // Create new node for insertion
        Node node = new Node();
        node.value = nodeValue;


        // Insert new node at given location
        if (location <= 0) {
            node.next = this.head;
            this.head = node;
        } else if (location >= size) {
            this.tail.next = node;
            node.next = null;
            this.tail = node;
        } else {
            int index = 0;
            Node currentNode = this.head;
            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }
            node.next = currentNode.next;
            currentNode.next = node;
        }

        this.size++;
    }

    // Traversal
    public void traverseLinkedList() {
        if (head == null)
            throw new IllegalStateException("Cannot Traverse Empty Linked List");

        Node currentNode = this.head;
        for (int n = 0; n < this.size - 1; n++) {
            System.out.printf("[%d] -> ", currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.printf("[%d]%n", currentNode.value);
    }

    // Searching
    public void searchNode(int nodeValue) {
        if (this.head == null)
            throw new IllegalStateException("Cannot traverse empty Linked List");

        Node currentNode = this.head;
        for (int location = 0; location < this.size; location++) {
            if (currentNode.value == nodeValue) {
                System.out.println("Found Node at location: " + location);
                return;
            }
            currentNode = currentNode.next;
        }

        throw new NoSuchElementException(
                String.format("Node with value: %d, does not exist in linked list.", nodeValue));
    }

    // Deletion
    public void deleteNode(int nodeLocation) {
        if (this.head == null)
            throw new IllegalStateException("Cannot delete node from empty Linked List");

        if (nodeLocation > this.size)
            throw new IllegalArgumentException("Given node location: %d, is greater than size of Linked List");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else if (nodeLocation == 0) {
            this.head = this.head.next;
        } else if (nodeLocation < this.size) {
            int location = 0;
            Node currentNode = this.head;
            while (location < nodeLocation - 1) {
                currentNode = currentNode.next;
                location++;
            }

            if (nodeLocation == (this.size - 1)) {
                currentNode.next = null;
                this.tail = currentNode;
            } else {
                Node nextNode = currentNode.next;
                currentNode.next = nextNode.next;
            }
        }

        this.size--;
    }
}

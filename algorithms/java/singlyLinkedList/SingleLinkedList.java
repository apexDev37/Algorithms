package com.apexdev.algorithms.linkedlist.single;

import com.apexdev.algorithms.linkedlist.LinkedList;
import com.apexdev.algorithms.linkedlist.Node;

import java.util.NoSuchElementException;

public class SingleLinkedList extends LinkedList {
    private Node newNode;

    // Creation
    public void createLinkedList(int nodeValue) {
        createNewNode(nodeValue);
        assignHeadNewNode();
        assignTailNewNode();
        this.size = 1;
    }

    private void createNewNode(int nodeValue) {
        this.newNode = new Node();
        this.newNode.value = nodeValue;
        this.newNode.next = null;
    }

    private void assignHeadNewNode() {
        this.head = newNode;
    }

    private void assignTailNewNode() {
        this.tail = newNode;
    }

    // Insertion
    public void insertNode(int location, int nodeValue) {
        // Handle insertion into empty linked list
        if (!emptyLinkedList()) {

            // Create new node for insertion
            createNewNode(nodeValue);

            // Insert new node at given location
            insertNodeAt(location);

        } else createLinkedList(nodeValue);

        this.size++;
    }

    private void insertNodeAt(int location) {
        if (location <= 0)
            insertBeforeHead();
        else if (location >= this.size)
            insertAfterTail();
        else
            insertAtLocation(location);
    }

    private void insertBeforeHead() {
        this.newNode.next = this.head;
        this.head = this.newNode;
    }

    private void insertAfterTail() {
        this.tail.next = this.newNode;
        this.newNode.next = null;
        this.tail = this.newNode;
    }

    private void insertAtLocation(int location) {
        Node currentNode = getNodeAt(location);
        this.newNode.next = currentNode.next;
        currentNode.next = this.newNode;
    }

    private Node getNodeAt(int location) {
        Node currentNode = this.head;
        for (int n = 0; n < location - 1; n++)
            currentNode = currentNode.next;
        return currentNode;
    }

    private boolean emptyLinkedList() {
        return this.head == null;
    }

    // Traversal
    public void traverseLinkedList() {
        // Error handling
        if (emptyLinkedList())
            throw new IllegalStateException("Cannot Traverse Empty Linked List");

        // Traversal logic
        Node currentNode = this.head;
        for (int n = 0; n < this.size - 1; n++) {
            System.out.printf("[%d] -> ", currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.printf("[%d]%n", currentNode.value);
    }

    // Searching
    public void searchNode(int nodeValue) {
        handleEmptyLinkedList();
        int nodeLocation = search(nodeValue);
        System.out.println("Found Node at location: " + nodeLocation);
        throw new NoSuchElementException(
                String.format("Node with value: %d, does not exist in linked list.", nodeValue));
    }

    private int search(int target) {
        Node currentNode = this.head;
        for (int location = 0; location < this.size; location++) {
            if (currentNode.value == target)
                return location;
            currentNode = currentNode.next;
        }
        return -1;
    }

    private void handleEmptyLinkedList() {
        if (this.head == null)
            throw new IllegalStateException("Cannot perform operation on empty Linked List");
    }

    // Deletion
    public void deleteNode(int nodeLocation) {
        if (this.size < 2) deleteLinkedList();
        else deleteNodeAt(nodeLocation);
        this.size--;
    }

    private void deleteLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private void deleteNodeAt(int location) {
        if (location >= 1) {
            Node currentNode = getNodeAt(location);
            if (location == (this.size - 1)) deleteLastNode(currentNode);
            else deleteGivenNode(currentNode);
        } else
            deleteFirstNode();
    }

    private void deleteFirstNode() {
        this.head = this.head.next;
    }

    private void deleteLastNode(Node currentNode) {
        currentNode.next = null;
        this.tail = currentNode;
    }

    private void deleteGivenNode(Node currentNode) {
        Node nextNode = currentNode.next;
        currentNode.next = nextNode.next;
    }
}

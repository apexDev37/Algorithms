# Remove Duplicates  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Remove all duplicates from an unsorted linked list._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

## Description

Given a singly linked list of unsorted Nodes containing positive integer values.
Write a program in Java to remove all duplicate Nodes. That is, all subsequent
Nodes whose value already exists in prior Nodes.  
<br />

## Algorithm (Pseudocode)

- Traverse through each `node` beginning at the `head` property of the linked list
- Check if the current `node.value` exists in the HashSet of `existingValues`
- If the `node.value` exists in the HashSet
  - Link the `previousNode` to the current node's `next` property
  - Assign `currentNode` with it's `next` property
- Else if the `node.value` does not exist in the HashSet
  - Add the `currentNode.value` to the HashSet of `existingValues`
  - Assign the `currentNode` to `previousNode`
  - Assign the current node's `next` property to `currentNode`  
<br />

## Asymptotic analysis (Big O)

| Operation | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| `execute` | Constant - O(N) | Constant - O(1)  |  
<br />

## Functions
> _Find and observe implementation and behavior in the runtime environment class: [RemoveDuplicatesExample](./interviewQuestions/linkedList/removeDuplicates/RemoveDuplicatesExample.java)_

- ##### execute

```java
    public static void execute(SingleLinkedList linkedList)
```

> _Removes all the duplicate nodes in an unsorted linked list._

The `execute` function is wrapped in the `RemoveDuplicates` class. It exposes the
functionality to remove all nodes with duplicate values in the given linked list.
It performs this operation by implementing the algorithm defined [above](#algorithm-pseudocode).
The linked list is output to the console both before and after the operation to 
remove duplicates so that the contrast can be specified.

##### Parameters
@`linkedList`    ---  A `linkedList` consisting of nodes with positive integer values  
<br />

## See Also

For further explanation and deep dive into the technical question: Remove Duplicates.  
See additional resource, [Remove Duplicates](https://www.scaler.com/topics/remove-duplicates-from-linked-list/)
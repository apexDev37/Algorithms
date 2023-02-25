# Sum Lists  [![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
> _Question: Write a method that adds two numbers and returns their sum as a linked list._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

## Description

Given two numbers represented as a linked list, where each node contains 
a single digit. The digits are stored in reverse order, such that the 1's
digit is at the head of the list. Write a method that adds two numbers and
returns the sum as a linked list. Assume that the size of the linked lists
do not have to be equal.

**Note**: The returned linked list sum is also stored in reverse order.

<img src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" width="70%"></img>

## Algorithm (Pseudocode)

- Convert both the `firstList` and `secondList` to values
- Compute the `sum` of the previously converted values.
- Convert the previously computed `sum` to a `linked list`
- Output the `linked list` containing digits of the `sum`

## Asymptotic analysis (Big O)

| Operation | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| `execute` | Linear - O(N)   | Constant - O(1)  |

## Functions
> _Find implementation and behavior in the runtime environment class: [SumListsRunner](./SumListsRunner.java)_

- ##### execute

```java
      public static void
        execute(SingleLinkedList firstList, SingleLinkedList secondList)
```

> _Outputs a linked list containing digits of the sum for two given lists._

The `execute` `static` function is wrapped in the `SumLists` class. It exposes the
functionality to compute the `sum` of two given linked lists, where each `linked list` 
represents a value - each node containing a single digit. This value is stored 
in reverse order. After computing the sum of the values in the form of linked 
lists, it inserts each digit from the computed sum into a new linked list, 
`sumList`, which represents the sum of both linked lists also stored in 
reverse order.

##### Parameters
| Type               | Name         | Description                               |
|--------------------|--------------|-------------------------------------------|
| `SingleLinkedList` | `firstList`  | A singly linked list representing a value |   
| `SingleLinkedList` | `secondList` | A singly linked list representing a value |   

## See Also

For further explanation and deep dive into the technical question: Sum Lists.  
See additional resource, [Sum Lists](https://www.geeksforgeeks.org/sum-of-two-linked-lists/)
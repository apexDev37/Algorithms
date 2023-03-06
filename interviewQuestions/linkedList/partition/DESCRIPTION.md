# Partition  [![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
> _Question: Write code to partition a singly linked list around a value x, such that all nodes less than x come before
> all nodes greater or equal to x._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

## Description

Given a singly linked list of unsorted nodes containing positive integer values.
Write a program in Java to partition the linked list around a given value x, such
that nodes that have values less than x are on the left side or come before all
nodes with values greater or equal to x. Partitioned node with the value x can 
appear anywhere on the left or right side of the partition.

**Note**: There is no obligation for the nodes to be in order while partitioning.  
> The following image displays a linked list partitioned around the _x_ value of 3

<img src="https://assets.leetcode.com/uploads/2021/01/04/partition.jpg" width="70%"></img>

## Algorithm (Pseudocode)

- Traverse (iterate) through the linked list
- Check if current `node.value` is `<` or `>=` to `x`
  - If current `node.value < x`, then insert at the beginning 
  - If current `node.value >= x`, then insert at the end 
- After traversal, set the `next` property of the `tail` node to `null`
- Output the partitioned linked list

## Asymptotic analysis (Big O)

| Operation | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| `execute` | Linear - O(N)   | Constant - O(1)  |

## Functions
> _Find implementation and behavior in the runtime environment class: [PartitionExample](./PartitionExample.java)_

- ##### execute

```java
    public static void execute(SingleLinkedList linkedList, int target)
```

> _Outputs a partitioned linked list around the given target value._

The `execute` `static` function is wrapped in the `Partition` class. It exposes the
functionality to partition a linked list by a given `target` value which represents the
value for a `node` that exists in the linked list. It performs this operation by 
implementing the algorithm defined [above](#algorithm-pseudocode). The partitioned
linked list is output to the console in a semantic format.

##### Parameters
| Type               | Name          | Description                                                       |
|--------------------|---------------|-------------------------------------------------------------------|
| `SingleLinkedList` | `linkedList`  | A consists of singly linked nodes with positive integer values    |   
| `int`              | `target`      | A positive value for a single node in the given `linkedList`      |   

## See Also

For further explanation and deep dive into the technical question: Partition.  
See additional resource, [Partition](https://codedestine.com/partition-a-linked-list/)
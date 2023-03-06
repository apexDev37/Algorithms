# Return Nth to Last  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Implement an algorithm to find the nth to the last element of a singly linked list._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

## Description

Given a singly linked list of unsorted nodes containing positive integer values.
Write a program in Java to return the value of the node which is nth to the last
node. That is, given `n`, return the value of the Node `n` steps from the last Node.
Assume length of the linked list is unknown in your implementation.

<img src="https://1.bp.blogspot.com/-ut2PZrBRwTA/VnG41nH81VI/AAAAAAAAAyI/gF4fjVCFLnA/s1600/nth-last-element-in-linked-list.png" width="70%"></img>
<br />


## Algorithm (Pseudocode)

- Verify given `nth` argument is a positive `integer` within bound of the linked list `size`
- Traverse (iterate) through the linked list
- Map each Node/`value` to a location/`key`
- Get the size of the `map`
- Subtract the `size` of the map and given `nth` argument
- Retrieve the `nth` node from the `map` with the difference being the `key`

## Asymptotic analysis (Big O)

| Operation | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| `execute` | Linear - O(N)   | Constant - O(1)  |

## Functions
> _Find implementation and behavior in the runtime environment class: [NthToLastExample](./NthToLastExample.java)_

- ##### execute

```java
    public static void execute(SingleLinkedList linkedList)
```

> _Outputs the node located `nth` steps from the last node._

The `execute` `static` function is wrapped in the `NthToLastExample` class. It exposes the
functionality to find and return the node that is located `nth` from the last node in the
given linked list. It performs this operation by implementing the algorithm defined
[above](#algorithm-pseudocode). The node `nth` from the last node is output to the console
in a semantic format.

##### Parameters
@`linkedList`    ---  A `SinglyLinkedList` consisting of nodes with positive integer values

## See Also

For further explanation and deep dive into the technical question: Nth to Last Node.  
See additional resource, [Nth to Last Node](https://www.enjoyalgorithms.com/blog/remove-nth-node-from-list-end)
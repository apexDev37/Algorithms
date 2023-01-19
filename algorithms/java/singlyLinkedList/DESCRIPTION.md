## SinglyLinkedList  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Implementation and operations associated with the singly linked list data structure._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Linked list data structure is a form of a sequential collection, and it does not have to be in order.  
A linked list consists of independent nodes that may contain any type of data (in this case `integer`).  
Each node has a reference to the next node in the link.  

<img src="https://media.geeksforgeeks.org/wp-content/uploads/singly-linkedlist.png" width="80%"></img>  
<br />

### Contents
---
1. [Linked List](#linked-list)
2. [SinglyLinkedList]()
3. [Creation]()
4. [Insertion]()
5. [Traversal]()
6. [Searching]()
7. [Deletion]()  

### Linked List
---
Type: `java.lang.Object`  
Package: `com.apexdev.algorithms.singlyLinkedList.base`

```java
    public class LinkedList()
```

Base class inherited by various types of linked lists.  
Contains utility methods to perform common and ubiquitous operations associated with linked lists.

### Fields
| Modifier & Type  | Name | Description                                |
|------------------|------|--------------------------------------------|
| `protected Node` | head | Reference to the first node in linked list |
| `protected Node` | tail | Reference to the last node in linked list  |
| `protected int`  | size | Number of nodes in linked list             |

### Methods

---
- ##### emptyLinkedList

```java
    protected boolean emptyLinkedList()
```

> _Returns a `boolean` value representing whether a linked list is empty (contains no nodes)._  
<br />


### See Also
---
For further explanation and deep dive into data structure: Linked List.  
See additional resource, [Linked List](#) 

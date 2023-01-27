## SinglyLinkedList  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Implementation and operations associated with the singly linked list data structure._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Linked list, data structure, is a form of a sequential collection, and it does not have to be in order.  
A linked list consists of independent nodes that may contain any type of data (in this case `integer`).  
Each node has a reference to the next node in the link.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/singly-linkedlist.png" width="80%"></img>  
<br />

### Contents
---
1. [Linked List](#linked-list)
2. [Singly Linked List](#singly-linked-list)
3. [Creation](#creation)
4. [Insertion](#insertion)
5. [Traversal](#traversal)
6. [Searching](#searching)
7. [Deletion](#deletion)  
   <br />

### Linked List
---
Type: `java.lang.Object`  
Package: `com.apexdev.algorithms.singlyLinkedList.base`

```java
    public class LinkedList
```

Base `class` inherited by various types of linked lists.
Consists of elements of type `Node.class` defined in the base package.
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

---
- ##### getNodeAt

```java
    protected Node getNodeAt(int location)
```

> _Returns a `Node` from a given location in the linked list._

##### Parameters
@`location`    ---  An `integer` representing the location for a `Node`

##### Exceptions
@`IndexOutOfBoundsException`    ---  throws when no `Node` exists for given `location`

---
- ##### getNodeLocation

```java
    protected int getNodeLocation(int target)
```

> _Returns a positive `integer` representing the location for a given `Node`._
> _Returns `-1` if `Node` does not exist._

##### Parameters
@`target`    ---  An `integer` representing the `value` for a `Node` in the linked list  
<br />

### Singly Linked List
---
Type: `java.lang.Object`  
Package: `com.apexdev.algorithms.singlyLinkedList`  
Inherits: `LinkedList`

```java
    public class SingleLinkedList
        extends LinkedList
```

Full implementation and operations associated with singly linked lists.

### Fields
| Modifier & Type  | Name    | Description                         |
|------------------|---------|-------------------------------------|
| `private Node`   | newNode | Newly created `Node` in linked list |

### Methods
> **Note:** Find and observe implementation of singly linked list behavior in the `Main.java` class.

---
### Creation

- ##### createLinkedList

```java
    public void createLinkedList(int nodeValue)
```

> _Creates a `linkedList` against the calling `instance` consisting of one `Node`._

Creates a new linked list for the caller `object` of this method.
Creates a new node with an assigned value of the given `nodeValue`.
`head` and `tail` nodes reference the newly created `Node`. `size` of
the linked list is incremented by one.

---
### Insertion

- ##### insertNode

```java
    public void insertNode(int location, int nodeValue)
```

> _Inserts a new `Node` into a given location in the linked list._

Inserts a newly created `Node` with an assigned value of the given `nodeValue`.
Insertion is at the given `location` in the linked list.
If the caller instance `object` contains no nodes (empty),
then a new linked list will be created.

##### Parameters
@`location`    ---  An `integer` representing the insert location for a new `Node`  
@`nodeValue`    ---  An `integer` representing the value for a new `Node`

---
### Traversal
- ##### displayNodes

```java
    public void displayNodes()
```

> _Displays out to the console all the nodes in a linked list._

Traverses through each individual `Node` in a given linked list and outputs
it to the console in a semantic format.

---
### Searching

- ##### searchNode

```java
    public void searchNode(int nodeValue)
```

> _Searches for a `Node` with the value of the given `nodeValue`
> and outputs the location._

Searches for a target `Node` by iterating through each `Node` in a linked list.
Checks for the first occurrence where a `Node` has a value equal to
the given `nodeValue`. If `Node` with the given `nodeValue` exists in the
linked list, then the `location` of the target `Node` will be output to the
console, else a `new NoSuchElementException` will be thrown.

##### Parameters
@`nodeValue`    ---  An `integer` representing the value for a target `Node`

##### Exceptions
@`NoSuchElementException`    ---  throws when target `Node` could not be found

---
### Deletion

- ##### deleteNode

```java
    public void deleteNode(int nodeLocation)
```

> _Deletes a `Node` at the given `nodeLocation`._

Deletes a `Node` by iterating through a linked list and breaking the links to
the `Node` at the given `location`. If the given `nodeLocation` is greater than
the `size` of the linked list, then the last `Node` in the linked list will be
deleted. If the given `nodeLocation` is less than or equal to zero, then
the first `Node` in the linked list will be deleted.

##### Parameters
@`nodeLocation`    ---  An `integer` representing the `location` for a `Node`
<br />

### See Also
---
For further explanation and deep dive into data structure: Singly Linked List.  
See additional resource, [Singly Linked List](https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/) 
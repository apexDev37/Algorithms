# Intersection  [![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
> _Question: Determine if two links intersect and return the intersecting node (kthNode)._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

## Description
Given two (singly) linked lists, determine if the two lists intersect.
Return the intersecting node. Note that the intersection is defined 
based on reference and not value. That is, if the kth node of the 
first list is the exact same node (by reference) as the jth node of 
the second linked list, then they are intersecting.

<img src="https://miro.medium.com/max/1400/1*p7PMPUQrVFuqgx-6L-Qgug.png" width="70%"></img>

## Algorithm (Pseudocode)
- Determine between the two lists which list has the greater size
- Compute the difference between the size of both linked lists
- Use the computed difference to ignore the excess nodes in the longer list during iteration
- Traverse through both lists 
- Check if node in the first list is the exact same node in the second list
  - If true, return the first occurrence as the kth node
  - If false, continue to iterate to find the kth node
- Output details for the kth node in a semantic format.

## Asymptotic analysis (Big O)
| Operation | Time Complexity   | Space Complexity |
|-----------|-------------------|------------------|
| `execute` | Linear - O(A + B) | Constant - O(1)  |

## Functions
> _Find construction and behavior in the runtime environment class: [IntersectionRunner](./IntersectionRunner.java)_

- ##### execute
```java
      public static void 
        execute(SingleLinkedList firstList, SingleLinkedList secondList)
```

> _Outputs the kth node - the first intersection point node between to intersecting lists._

The `execute` `static` function is wrapped in the `Intersection` class. It exposes the
functionality to find the `kthNode` between two given intersecting linked lists. The two
lists may be of the same or different sizes. If the kth Node is not found, then the two
linked lists do not intersect. In this case, an exception will be thrown stating that 
the `kthNode` does not exist.

##### Parameters
| Type               | Name         | Description                                                     |
|--------------------|--------------|-----------------------------------------------------------------|
| `SingleLinkedList` | `firstList`  | A linked list containing nodes with values of positive integers |   
| `SingleLinkedList` | `secondList` | A linked list containing nodes with values of positive integers |   

##### Exceptions
| Type                      | Description                                                    |
|---------------------------|----------------------------------------------------------------|
| `NoSuchElementException`  | Thrown when no kthNode is found after traversal of both lists  |   

## Utilities
### Intersector
---
Type: `java.lang.Object`  
Package: `com.apexdev.interviewQuestions.linkedList.intersection;`  

```java
      public final class Intersector {}
```

### Fields
| Modifier & Type                          | Name              | Description                                                |
|------------------------------------------|-------------------|------------------------------------------------------------|
| `private static final SingleLinkedList`  | intersectionList  | Generated linked list to be the intersection of both lists |

### Methods
- ##### intersect

```java
      public static void intersect(SingleLinkedList firstList, SingleLinkedList secondList)
```

> _Creates an intersection between two given (singly) linked lists._

The `intersect` `static` function is wrapped in the `Intersector` utility class. It exposes the
functionality to create and intersection between two given linked lists. The logic behind the
intersection is that `Intersector` generates a new linked list. This is the single instance
variable `intersectionList`. It then points the `tail` node of both the given lists to the 
`head` node of this newly generated linked list. Hence, creating an intersection between both
lists. This sets up two intersecting linked lists for us two work with.

##### Parameters
| Type               | Name         | Description                                                     |
|--------------------|--------------|-----------------------------------------------------------------|
| `SingleLinkedList` | `firstList`  | A linked list containing nodes with values of positive integers |   
| `SingleLinkedList` | `secondList` | A linked list containing nodes with values of positive integers |   

## See Also

For further explanation and deep dive into the technical question: Intersection.  
See additional resource, [Intersection](https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/)
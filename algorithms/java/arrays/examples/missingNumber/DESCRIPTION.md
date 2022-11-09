## Missing Number  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Find the missing number in an integer array of 1 to 100._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img> <img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Given an array of positive integer values from 1 to 100 (inclusive). Write a program in Java to find the single missing number in the given array.  
<br />

### Algorithm (Pseudocode)
---
- Compute the sum of numbers in the given array inclusive of the missing number
- Compute the sum of numbers in the given array exclusive of the missing number
- Compute the difference of both the array sum inclusive and exclusive of the missing number
- Return the difference as the missing number  
  <br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Constant | O(1)
- **Space complexity** -- Constant | O(1)  
  <br />

### Functions
---
- ##### getMissingNumberIn

```java
    private static int getMissingNumberIn(int[] numbers)
```

> _Returns an `Integer` representing the missing number in a given array of integers._

##### Parameters
@`numbers`    ---  An array of positive integers from 1 to 100 (inclusive) with a single missing number

--- 

- ##### getSumOfNumbers

```java
    private static int getSumOfNumbers(int[] numbers)
```

> _Returns an `Integer` representing the sum of the given array inclusive of the missing number. 
> Computed using the formula `(n * (n + 1)) / 2`, where `n` is the last element in the array (100)._

##### Parameters
@`numbers`    ---  An array of positive integers from 1 to 100 (inclusive) with a single missing number  
<br />


### Utilities
---
- ##### setup

```java
    private static int[] setup()
```

> _Returns an `Array` of a specified length with a single specified missing number._

--- 

- ##### getInclusiveRange

```java
    private static int[] getInclusiveRange(int max)
```

> _Returns an `Array` representing a sequence of integers from 1 to the given parameter `max` (inclusive).  
> example: `new int[]{1, 2, 3 ... max}`_

##### Parameters
@`max`    ---  An integer representing the last element in array of sequential integers  

--- 

- ##### removeElementFrom

```java
    private static int[] removeElementFrom(int[] numbers, int element)
```

> _Returns an `Array` representing `numbers` without the given `element`.  
> example: `int[]{1, 2, 3, 4}`  
> element: `3`  
> returns: `new int[]{1, 2, 4}`_

##### Parameters
@`numbers`    ---  An array of positive integers from 1 to 100 (inclusive)  
@`element`    ---  A positive integer representing the element to be removed from `numbers`  
<br />


### See Also
---
For further explanation and deep dive into the technical question: Missing Numbers.  
See additional resource, [Missing Numbers](https://medium.com/@briandsalemi/how-to-solving-the-missing-number-question-33b0426a9ba5)  

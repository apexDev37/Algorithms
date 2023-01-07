## Pairs Two Sum  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Find the first pair of integers whose sum is equal to a given target._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img> <img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Given an array of unsorted, positive integer values. 
Write a program in Java to find the first pair of integers whose sum is equal to a given target.
Return the indices of the pair of integers as an array in no particular order.
Handle the case where no pair sum equals the given target.  
<br />

### Algorithm (Pseudocode)
---
- Compute all the possible unique pair sums through iteration
- Check if each computed pair sum equals the given target value
- If pair sum equals, return new array containing the indices of the pair values 
- Else if no pair sum equals, throw exception  
<br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Quadratic, O(n^2)
- **Space complexity** -- Constant | O(1)  
<br />

### Functions
---
- ##### twoSum

```java
    private static int[] twoSum(int[] values, int target)
```

> _Returns an `Array` containing the indices of the pair values whose sum equals the given target._

##### Parameters
@`values`    ---  An `array` of unsorted, positive integers  
@`target`    ---  A positive `Integer` value   

##### Exceptions
@`IllegalArgumentException`    ---  throws when no pair sum equals given target  
<br />

### See Also
---
For further explanation and deep dive into the technical question: Pairs Two Sum.  
See additional resource, [Pairs Two Sum](https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/)
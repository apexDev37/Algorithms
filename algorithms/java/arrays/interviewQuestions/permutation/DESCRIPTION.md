## Permutation  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Given two arrays of integers, find out if they are a permutation of each other._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Given two arrays of unsorted, positive integer values.
Write a program in Java to find out if both arrays are a permutation of each other.
Return a boolean value to indicate the permutation status between both arrays.  

A permutation is an arrangement of its members into a sequence or linear order,
or if the set is already ordered, a rearrangement of its elements.

<img src="https://algorist.com/images/figures/generating-permutations-R.png" width="25%"></img>  
<br />

### Algorithm (Pseudocode)
---
- Check if both array lengths equal
- If array lengths don't equal, return false
- Else, continue with computation
- Compute the sum for both array values
- Compute the product for both array values
- If both the sum and products equals, the arrays are a permutation. Return true
- Else, return false  
<br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Constant | O(1)
- **Space complexity** -- Constant | O(1)  
<br />

### Functions
---

- ##### isPermutation

```java
    private static boolean isPermutation(int[] firstArray, int[] secondArray)
```

> _Returns a `boolean` representing whether both arrays are permutations of each other._

##### Parameters
@`firstArray`    ---  An `array` of unsorted, positive integers  
@`secondArray`    ---  An `array` of unsorted, positive integers

---

- ##### arraySumsEqual

```java
    private static boolean arraySumsEqual(int[] firstArray, int[] secondArray)
```

> _Returns a `boolean` representing whether the sums of both arrays are equal._

##### Parameters
@`firstArray`    ---  An `array` of unsorted, positive integers  
@`secondArray`    ---  An `array` of unsorted, positive integers

---

- ##### arrayProductsEqual

```java
    private static boolean arrayProductsEqual(int[] firstArray, int[] secondArray)
```

> _Returns a `boolean` representing whether the products of both arrays are equal._

##### Parameters
@`firstArray`    ---  An `array` of unsorted, positive integers  
@`secondArray`    ---  An `array` of unsorted, positive integers  
<br />

### See Also
---
For further explanation and deep dive into the technical question: Permutation.  
See additional resource, [Permutation](https://www.geeksforgeeks.org/check-if-two-arrays-are-permutations-of-each-other/)
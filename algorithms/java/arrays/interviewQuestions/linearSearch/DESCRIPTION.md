## Linear Search  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Write a program to check if an array contains a given number and return its index._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img> <img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Write a program in Java that will enable a user to determine if a number exists in an array. If the number exists in the array, return the corresponding index for the number being searched for. Handle the case where the number does not exist in the array.  
<br />

### Algorithm (Pseudocode)
---
- Iterate through each element in the given array
- Check if current element equals the target value
- If element equals target value, return index of element
- Throw exception if target element does not exist in array  
  <br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Linear | O(n)
- **Space complexity** -- Constant | O(1)  
  <br />

### Functions
---
- ##### linearSearch

```java
    private static int linearSearch(int[] values, int target)
```

> _Returns an `Integer` value representing the zero-based-index of the target value found in a given array._

##### Parameters
@`values`    ---  A populated array of integer values.  
@`target`    ---  An integer value being searched for.

##### Exceptions
@`NoSuchElementException`   --- Throws when target value does not exist in given array.  
<br />

### See Also
---
For further explanation and deep dive into the linear search algorithm.  
See additional resource, [Linear Search](https://www.javatpoint.com/linear-search)
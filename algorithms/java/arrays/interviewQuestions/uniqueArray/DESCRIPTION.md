## Unique Array  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Find out if a given array is unique (has no duplicate values)._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Given an unsorted array of positive integers.
Write a program in Java to find out if the array is unique, that is, has no duplicate values.
Return a boolean value representing the status of whether the array is unique.  
<br />

### Algorithm (Pseudocode)
---
- Iterate through each unique integer pairs in the given array
- Check if the values of the unique integer pairs equal
- If any of the values equal, return false
- Else, return true  
<br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Quadratic | O(n^2)
- **Space complexity** -- Constant | O(1)  
<br />

### Functions
---

- ##### isUnique

```java
    private static boolean isUnique(int[] values)
```

> _Returns a `boolean` value representing whether a given array is unique._

##### Parameters
@`values`    ---  A unsorted `array` of positive integers  
<br />

### See Also
---
For further explanation and deep dive into the technical question: Unique Array.  
See additional resource, [Unique Array](https://www.java67.com/2015/10/2-ways-to-find-duplicate-elements-in-java-array.html) 

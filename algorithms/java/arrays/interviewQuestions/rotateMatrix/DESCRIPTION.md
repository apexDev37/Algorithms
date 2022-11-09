## Rotate Matrix  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
> _Question: Given an image represented by a 3x3, 2D matrix. Rotate the matrix by 90 degrees._

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img>
<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
---
Given a 3x3, 2D matrix.
Write a program in Java to rotate the matrix 90 degrees right.
Return the given matrix modified by the rotation process without creating a new matrix.

A matrix is a multidimensional array of elements.
A 3x3 matrix means a matrix of order 3, that is, having 3 rows and 3 columns.  
<img src="https://www.w3resource.com/w3r_images/c-array-image-exercise-18.png" width="35%"></img>  
<br />

### Algorithm (Pseudocode)
---
- Rotate the corner elements (having even sum indices `[0][2]`, `[2][2]`, etc.)
- Assign each corner element the value of the next corner element (`[0][2]` -> `[0][0]`)
- Rotate the center elements (having odd sum indices `[2][1]`, `[1][2]`, etc.)
- Assign each center element the value of the next corner element (`[1][2]` -> `[0][1]`)
- Return the matrix rotated right by 90 degrees  
<br />

### Asymptotic analysis (Big O)
---
- **Time complexity** -- Constant | O(1)
- **Space complexity** -- Constant | O(1)  
<br />

### Functions
---

- ##### rotate90DegreesRight

```java
    private static int[][] rotate90DegreesRight(int[][] matrix)
```

> _Returns a 2D `array` representing a given matrix rotated 90 degrees right._

##### Parameters
@`matrix`    ---  A 2D, 3x3, `array` of positive integers  

---

- ##### rotateEvenSumIndices

```java
    private static int[][] rotateEvenSumIndices(int[][] matrix)
```

> _Returns a 2D `array` representing a matrix with corner elements (odd sum indices) rotated 90 degrees right._

##### Parameters
@`matrix`    ---  A 2D, 3x3, `array` of positive integers  

---

- ##### rotateOddSumIndices

```java
    private static int[][] rotateOddSumIndices(int[][] matrix)
```

> _Returns a 2D `array` representing a matrix with middle elements (odd sum indices) rotated 90 degrees right._

##### Parameters
@`matrix`    ---  A 2D, 3x3, `array` of positive integers  
<br />

### See Also
---
For further explanation and deep dive into the technical question: Rotate Matrix.  
See additional resource, [Rotate Matrix](https://www.enjoyalgorithms.com/blog/rotate-a-matrix-by-90-degrees-in-an-anticlockwise-direction) 

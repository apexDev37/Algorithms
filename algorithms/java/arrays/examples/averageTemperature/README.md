# Arrays
Common technical interview question that deals with the `Array` data structure.

## _Average Temperature_
> Question: _Find the number of days above the average temperature._

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img> <img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>

### Description
Write a program that will enable a user to input the temperature for a given number of days specified prior by the user. Find the average temperature for the temperatures input by the user and determine the number of days above the average temperature.

### Algorithm (Pseudocode)

- Get user input for number of days to capture temperature
- Get user input for temperature for each user-specified number of days
- Compute the average temperature for the given number of days
- Count the days which have a temperature above the average

### Asymptotic analysis (Big O)
- **Time complexity** -- Linear | O(n)
- **Space complexity** -- Constant | O(1)


### Functions

- ##### getNumberOfDays

```java
    private static int getNumberOfDays(Scanner scanner)
```

> Returns an `Integer` value representing the number of days the user desires to capture temperature.

##### Parameters
@`scanner`    ---  Accepts an instance of the Scanner class to read user input.

---

- ##### getTemperatures

```java
    private static int[] getTemperatures()
```
> Returns an `array` which contains integer values representing the temperatures for a specified number of days. Each array element represents the temperature for a single day.

---

- ##### captureTemperatures

```java
    private static void captureTemperatures(int[] temperatures, Scanner scanner)
```
> Populates the `temperatures` array with user input of temperatures for a specific number of days. The length of `temperatures` dictates the number of days.

##### Parameters
@`temperatures`    ---  An empty array for integer values to capture day temperatures.
@`scanner`    ---  An instance of the Scanner class to read user input.

---

- ##### captureDayTemperature

```java
    private static int captureDayTemperature(int day, Scanner scanner)
```
> Returns an `Integer` value which represents the temperature input value captured from the user for a given single day.

##### Parameters
@`day`    ---  An integer value to inform the user of the current day to capture temperature.
@`scanner`    ---  An instance of the Scanner class to read user input.

---

- ##### computeAverage

```java
    private static double computeAverage(int[] temperatures)
```
> Returns a `Double` value which represents the average temperature for all the captured temperatures for a specific number of days.

##### Parameters
@`temperatures`    ---  An integer array containing the temperatures for a given number of days.

---

- ##### countAboveAverage

```java
    private static long countAboveAverage(double average, int[] temperatures)
```
> Returns a `Double` value which represents the average temperature for all the captured temperatures for a specific number of days.

##### Parameters
@`average`    ---  An double value representing the computed temperatures average.
@`temperatures`    ---  An integer array containing the temperatures for a given number of days.

---

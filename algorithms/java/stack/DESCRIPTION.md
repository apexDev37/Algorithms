# Stack  [![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
> _Data structure: Stores items or elements using a last in, first out (LIFO) storage mechanism._

<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20220714004311/Stack-660x566.png" width="15%"></img>

## Description

Imaginatively, the stack data structure can be visualized as similar object items vertically stacked on each other.
Therefore, in order to extract any given object, the item at the top of the vertically stacked items is the first to be
accessed. Imagine a stack of books or boxes vertically pilled on top of each other. In order to access the first box or
item at the bottom of the stack (vertical pile of items), you must extract all items before in order to access the first
item. This storage mechanism provided by the stack data structure is crucial in contexts where the last incoming data is
utilized first.

## Asymptotic analysis (Big O)

| Operation | Time Complexity  | Space Complexity |
|-----------|------------------|------------------|
| `push`    | Constant - O(1)  | Constant - O(1)  |
| `pop`     | Constant - O(1)  | Constant - O(1)  |
| `peek`    | Constant - O(1)  | Constant - O(1)  |
| `isEmpty` | Constant - O(1)  | Constant - O(1)  |
| `isFull`  | Constant - O(1)  | Constant - O(1)  |

> NB: The above analysis applies to the available implementations of stack.
> However, during creation, the implementation with a _fixed_ capacity a has space complexity of O(N) instead of O(1),
> where n is the number of reserved memory locations.

## Functionality
> _The following listed methods are defined and implemented (overridden) from the Stack [interface](./Stack.java)_

- ##### push

```java
  @Override
  public void push(E value)
```

> _Add a single element to the top of the stack._

The term _push_ is associated with **insertion** in the given context. The `push` method is responsible for inserting an
element into the top of the stack. The size of the stack increments by one indicating that only one element can be added
to the stack at any given point and time. In the case of utilizing a stack with a fixed capacity, checks are performed
before adding an element to the stack, and exceptions due to max capacity are handled.

##### Parameters
| Type               | Name         | Description                                      |
|--------------------|--------------|--------------------------------------------------|
| `E`                | `value`      | A generic value to be pushed to top of the stack |   

##### Exceptions
| Type                     | Parameter   | Description                                            |
|--------------------------|-------------|--------------------------------------------------------|
| `IllegalStateException`  | `message`   | Thrown during push attempt when stack capacity is full |   

- ##### pop

```java
  @Override
  public E pop()
```

> _Return and delete the single element at the top of the stack_

The term _pop_ is associated with **removing** in the given context. The `pop` method is responsible for deleting the
element at the top of the stack and returning the same element. The `pop` method like most stack methods will operate on
the top element. The size of the stack decrements by one indicating that only one element can be popped from the stack
at a time. In the case of trying to perform a pop operation on an empty stack, checks are performed before deleting and
returning the top element and exceptions due to an empty stack are handled.

##### Exceptions
| Type                   | Parameter   | Description                              |
|------------------------|-------------|------------------------------------------|
| `EmptyStackException`  | `message`   | Thrown during pop attempt on empty stack |   

- ##### peek

```java
  @Override
  public E peek()
```

> _Return, without deleting, the single element at the top of the stack_

The term _peek_ is associated with **retrieving** in the given context. The `peek` method operates on the top element.
It is responsible for fetching the element at the top of the stack. The size of the stack remains unmodified due to no
insertion or deletion operation executed against the stack instance. In the case of trying to perform a peek operation
on an empty stack, checks are performed before returning the top element and exceptions due to an empty stack are
handled.

##### Exceptions
| Type                   | Parameter   | Description                               |
|------------------------|-------------|-------------------------------------------|
| `EmptyStackException`  | `message`   | Thrown during peek attempt on empty stack |   

- ##### isEmpty

```java
  @Override
  public boolean isEmpty()
```

> _Return a boolean value based on whether stack is empty or not_

The `isEmpty` method operates on values that represent the state of a stack. It is responsible for checking if a stack
contains any elements. The `isEmpty` method returns `true` if the stack contains no elements or returns `false` if one
or more elements exist in the stack.

- ##### isFull

```java
  @Override
  public boolean isFull()
```

> _Return a boolean value based on whether stack capacity is reached_

The `isFull` method operates on values that represent the state of a stack in terms of capacity. It is responsible for
checking if a stack has reached its maximum capacity. The `isFull` method returns `true` if the stack capacity is
reached or returns `false` if the number of elements in the stack is less than the capacity of the stack.

> NB: The `isFull` method is only available on instances that utilize the implementation of stack with a fixed capacity.

## See Also

For further explanation and deep dive into the data structure: Stack.  
See additional resource, [Stack](https://www.simplilearn.com/tutorials/data-structure-tutorial/stacks-in-data-structures#:~:text=The%20stack%20data%20structure%20is,of%20money%2C%20and%20many%20more.)

# Queue  [![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
> _Abstract data structure: Stores items or elements using a first in, first out (FIFO) storage mechanism._

<img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img>
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221213113312/Queue-Data-Structures.png" width="30%"></img>

## Description

Queues are comparable to stacks. A queue, on the other hand, has both ends available for insertion or deletion, whereas
a stack only has one open end for insertion and deletion. A line of customers waiting to be serviced by a cashier at a
point of sale is a real-world representation of a queue. A queue is represented by this line of customers. The
customer at the front of the line is served first and is also the _first_ to leave after being served. Furthermore, as
new customers enter the queue, the length of the line grows. The person who is last to enter the queue is also last to
be served. As a result, the relational notion of first in, first out, or last in, last out emerged.

## Asymptotic analysis (Big O)

| Operation | Time Complexity  | Space Complexity |
|-----------|------------------|------------------|
| `push`    | Constant - O(1)  | Constant - O(1)  |
| `pop`     | Constant - O(1)  | Constant - O(1)  |
| `peek`    | Constant - O(1)  | Constant - O(1)  |
| `isEmpty` | Constant - O(1)  | Constant - O(1)  |
| `isFull`  | Constant - O(1)  | Constant - O(1)  |

> **NB**: Static queue implementations have a space complexity of O(N) instead of O(1) where N is the number of memory
> allocations for each element.

> **Tip**: Consider dynamic queue implementations - without a fixed capacity - for **space efficiency**
> in relation to queues.

## Functionality
> _The following listed methods are defined and implemented (overridden) from the Queue [interface](./base/Queue.java)_

- ##### enqueue

```java
  @Override
  public void enqueue(E element)
```

> _Add a single element to the back of a queue._

The term _enqueue_ is associated with **insertion** in the given context. The `enqueue` method is responsible for
inserting an element at the `back` of a queue. The `size` of a queue increments indicating that only one element can
be added to the queue at any given point and time. In the case of utilizing a queue with a fixed `capacity`, checks are
performed before adding an element to the queue, and exceptions due to `capacity` reached are handled.

##### Parameters
| Type               | Name         | Description                                       |
|--------------------|--------------|---------------------------------------------------|
| `E`                | `value`      | A generic value to be pushed to back of the queue |   

##### Exceptions
| Type                     | Parameter   | Description                                                |
|--------------------------|-------------|------------------------------------------------------------|
| `IllegalStateException`  | `message`   | Thrown during enqueue attempt when max capacity is reached |   

- ##### dequeue

```java
  @Override
  public E dequeue()
```

> _Returns and removes the first element in a queue._

The term _dequeue_ is associated with **deletion** in the given context. The `dequeue` method is responsible for two
things: _removing_ the `front` element and _returning_ it to the caller. The `dequeue` method operates on the `front`
element of the queue primarily enforcing the [FIFO](https://en.wikipedia.org/wiki/FIFO_(computing_and_electronics)#:~:text=In%20computing%20and%20in%20systems,the%20queue%2C%20is%20processed%20first.)
mechanism. The queue's `size` decreases by one, indicating that only one element can be dequeued at a moment. When
attempting to perform a `dequeue` operation on an empty queue, checks are done prior to the operation, and an exception
is raised due to an empty queue.

##### Exceptions
| Type                   | Parameter   | Description                                  |
|------------------------|-------------|----------------------------------------------|
| `EmptyQueueException`  | `message`   | Thrown during dequeue attempt on empty queue |   

- ##### peek

```java
  @Override
  public E peek()
```

> _Returns the front element in a queue._

The term _peek_ is associated with **retrieving** in the given context. The `peek` method operates on the `front` element.
It is responsible for returning the queue's `front` element. The `size` of the queue remains unmodified due to no
insertion or deletion operation executed against a queue instance. When attempting to conduct a `peek` operation on an
empty queue, checks are performed before returning the `front` element, and an `exception` is raised due to an empty queue.

##### Exceptions
| Type                   | Parameter   | Description                               |
|------------------------|-------------|-------------------------------------------|
| `EmptyQueueException`  | `message`   | Thrown during peek attempt on empty queue |   

- ##### isEmpty

```java
  @Override
  public boolean isEmpty()
```

> _Returns truthy if a queue is empty._

The `isEmpty` method handles values that reflect a queue's populated state. It determines whether a queue contains any
elements. The `isEmpty` method returns `true` if the queue contains no elements or `false` if the queue contains one or
more elements.

- ##### isFull

```java
  @Override
  public boolean isFull()
```

> _Returns truthy if a queue is full._

The `isFull` method works on values that indicate the capacity of a queue. It is in charge of determining if a queue has
hit its maximum `capacity`. The `isFull` method returns `true` if the queue capacity is met, or `false` if the number of
elements in the queue is _less than_ the queue capacity.

> **Disclaimer**: Despite `isFull` only applicable to static queue implementations, dynamic queue implementations
> in this package override and expose this method through contract. Return value on dynamic instances is always `false`.

## See Also

For further explanation and deep dive into the data structure: Queue.  
See additional resource, [Queue](https://www.javatpoint.com/ds-types-of-queues)

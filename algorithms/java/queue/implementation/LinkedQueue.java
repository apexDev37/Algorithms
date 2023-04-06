package com.apexdev.algorithms.java.queue.implementation;

import com.apexdev.algorithms.java.queue.base.LinearDynamicQueue;

import java.text.MessageFormat;

class LinkedQueue<E> extends LinearDynamicQueue<E> {

  @Override
  public void enqueue(E element) {
    if (isEmpty())
      handleFirstEnqueue(element);
    else enqueueToBack(element);
    size++;
  }

  private void enqueueToBack(E element) {
    back.link(new Node<>(element));
    this.back = back.next;
  }

  @Override
  public E dequeue() {
    handleEmptyQueue("dequeue");
    if (size == 1) back = null;
    return dequeueFrontElement();
  }

  private E dequeueFrontElement() {
    E element = front.value;
    deleteFront();
    return element;
  }

  private void deleteFront()
    { this.front = front.next;   size--; }

  @Override
  public boolean isEmpty() {
    // force ensure all nodes in empty queue have no references,
    // compared to: size == 0
    return front == null && back == null;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
            "Queue '{'\n\telements={0}\n\tsize={1}\n'}'",
            displayElements(),
            size);
  }

  private String displayElements() {
    StringBuilder builder = new StringBuilder("[");

    Node<E> element = this.front;
    for (int location = 0; location < this.size - 1; location++) {
      builder.append(element.value).append(", ");
      element = element.next;
    }

    builder.append(element.value).append("]");
    return builder.toString();
  }
}

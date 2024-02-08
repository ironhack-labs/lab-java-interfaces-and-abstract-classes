# IntList Interface

This project implements an `IntList` interface along with two implementations: `IntArrayList` and `IntVector`. These classes provide functionalities to store a list of integers and dynamically resize the underlying array when needed.

## IntList Interface

The `IntList` interface defines the contract for the list, with `add` and `get` methods.

```java
public interface IntList {
    void add(int number);
    int get(int id);
}

Use IntArrayList when you have a smaller array with fewer resizing operations. For example, if you expect the array to grow gradually and want to minimize memory overhead, IntArrayList might be more efficient.

Use IntVector when you expect the array to grow rapidly and consistently. Since IntVector doubles the size of its array, it can accommodate larger lists with fewer resizing operations, making it more efficient in scenarios where the list size increases quickly.
IntList Implementations

This project contains two implementations of the IntList interface:

IntArrayList → uses an array with an initial length of 10. When the array is full, it grows by 50%.

IntVector → uses an array with an initial length of 20. When the array is full, it grows to double its current size.

When to use IntArrayList?

IntArrayList is more efficient when:

The number of elements is not very large.

You add elements gradually and don’t expect sudden growth.

Memory efficiency is important, since a 50% increase wastes less extra space than doubling.

Example:
If you are storing a list of user IDs in a small application (hundreds of users at most), IntArrayList will be more efficient.

When to use IntVector?

IntVector is more efficient when:

The number of elements can grow significantly (thousands or more).

Performance of adding elements is more important than memory savings.

You want to minimize the number of times elements have to be copied into a new array.

Example:
If you are implementing a data structure for handling large datasets (e.g., server logs or sensor readings), IntVector will be more efficient because it resizes less frequently.
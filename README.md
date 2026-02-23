# Efficiency Comparison: IntArrayList vs IntVector

## When IntArrayList is More Efficient

IntArrayList increases its capacity by 50% when full.

Example:
Initial size: 10
When full → 15
Then → 22
Then → 33

Because it grows gradually, it uses less extra memory.
This makes it more efficient when:

- The data size grows slowly
- Memory usage is important
- The total number of elements is moderate

Example use case:
A small application storing up to 50–100 numbers where memory efficiency matters.


## When IntVector is More Efficient

IntVector doubles its size when full.

Example:
Initial size: 20
When full → 40
Then → 80
Then → 160

Because it doubles, resizing happens less frequently.
This makes it more efficient when:

- A very large number of elements will be added
- Performance is more important than memory usage
- Frequent resizing must be minimized

Example use case:
A system that processes thousands or millions of integers.

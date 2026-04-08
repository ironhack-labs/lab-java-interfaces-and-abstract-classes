# IntList Implementation Analysis

## Efficiency Comparison: IntArrayList vs. IntVector

This project includes two implementations of the `IntList` interface, each with a different strategy for resizing its internal array when it reaches capacity.

### When is `IntArrayList` more efficient?
`IntArrayList` grows by **50%** of its current size when full.
* **Best Use Case:** It is more efficient in terms of **Memory (RAM) consumption**. It is ideal when you have limited memory resources or when you expect the list to grow, but at a slow, gradual, or predictable pace. Because it doesn't request massive blocks of memory at once, it prevents memory waste.

### When is `IntVector` more efficient?
`IntVector` grows by **100%** (it doubles its size) when full.
* **Best Use Case:** It is more efficient in terms of **Processing Speed (CPU)** when dealing with massive amounts of data. Resizing an array (creating a new one and copying all elements over) is a heavy operation. By doubling in size, `IntVector` performs this costly operation much less frequently than `IntArrayList`. It trades memory space for faster execution times when rapidly adding many elements.


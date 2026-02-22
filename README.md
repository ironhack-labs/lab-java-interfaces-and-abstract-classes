Custom IntList Implementation

This project is a simple Java implementation of dynamic integer lists. Its main goal is to show how arrays grow when they reach their capacity, using different strategies for expansion.

 Project Structure:

At the core, we have the IntList interface with two basic operations:

add(int number) – Adds an element to the list.

get(int id) – Retrieves an element by its index.

We then provide two concrete classes that manage memory differently:

IntArrayList

Starts with a capacity of 10.

When full, it grows by 50% (current capacity × 1.5).

IntVector

Starts with a capacity of 20.

When full, it doubles in size (current capacity × 2).

Performance & Efficiency:

In software engineering, there’s always a trade-off between time complexity and space complexity. Let’s see how each class fits different use cases:

1. Why IntArrayList?

Memory-efficient: Because it grows slowly (1.5×), it doesn’t allocate large amounts of unused memory.

Best for: Systems where memory is limited, like embedded devices or mobile apps.

Tip: Use this if you roughly know the list size and want to keep memory usage low.

2. Why IntVector?

Speed-focused: Doubling the size means array copying happens less frequently, which improves throughput.

Best for: Situations where you’re adding lots of elements in a loop and want to avoid delays caused by frequent resizing.

Tip: Use this when performance matters more than memory usage.

In short:

IntArrayList → Small memory footprint.

IntVector → Fast growth, fewer resizing pauses.

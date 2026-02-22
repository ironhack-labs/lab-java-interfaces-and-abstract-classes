# IntList Implementations

## Overview
Two dynamic array-based implementations of the `IntList` interface:

- **IntArrayList** — starts with capacity 10, grows by **50%** (+1) when full  
- **IntVector**   — starts with capacity 20, **doubles** capacity when full

Both use `System.arraycopy` for efficient resizing and throw proper exceptions on invalid index access.

## When to use IntArrayList (more efficient)
→ When you expect the list to grow slowly or stay relatively small most of the time.  
→ 50% growth uses less memory in the long run compared to doubling, especially for many small-to-medium lists.  
→ Fewer large memory allocations → better for memory-constrained environments or when many short-lived lists are created.

Example scenario: storing recent user actions in a mobile app session (usually < 100 elements).

## When to use IntVector (more efficient)
→ When you expect the list to grow very large or you want to minimize the number of resize operations.  
→ Doubling reduces the total number of copies performed over many additions (amortized O(1) with better constant factors for very large sizes).  
→ Fewer resizes → better performance when inserting thousands or millions of elements.

Example scenario: reading a large log file into memory, building a dataset for machine learning, or any bulk data import where final size is potentially very big.

## Summary – Choose based on expected size & growth pattern

| Scenario                          | Recommended     | Reason                              |
|-----------------------------------|------------------|-------------------------------------|
| Small to medium lists             | IntArrayList    | Lower memory overhead               |
| Very large lists, bulk inserts    | IntVector       | Fewer resizes, better amortized cost|
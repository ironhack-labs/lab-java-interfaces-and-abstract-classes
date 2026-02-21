# IntList Implementations

## IntArrayList
Use this when you will store a small number of elements and memory efficiency is important.  
The initial capacity is 10, and when it’s full, it grows by 50%.

## IntVector
Use this when you will add many elements.  
The initial capacity is 20, and when it’s full, it doubles in size.

## When should you choose which?
- **IntArrayList:** small amount of data, memory efficiency is important
- **IntVector:** large amount of data, performance/speed is important
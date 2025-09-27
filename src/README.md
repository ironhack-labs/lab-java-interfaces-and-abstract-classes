# InList Implementations

This project contains and 'IntList' interface with two implementations: 'IntArrayList' and 'IntVector'.

## Implementations

- **IntArrayList**
 - Default array size: 10
 - Increases array by 50% when full

- **IntVector**
 - Default array size: 20
 - Default array size when full

## Efficiency Considerations

- **When IntArrayList is more efficient**
 - If the list is small (less than ~20 elements), it uses less memory because it only grows by 50%.

- **When InVector is more efficient**
 - If the list grows large (hundreds of elements), doubling the array size reduces the number of resizes and copying operations.